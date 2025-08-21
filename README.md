# Evaluator Base for OpenCDMP

**evaluator-base** is a Maven package that provides the base interfaces and configuration classes required to implement plan evaluation services for the **OpenCDMP** platform. Each evaluation service is developed as a separate microservice and can be registered with OpenCDMP to support the evaluation and ranking of **Plans** and related **Descriptions**.

## Overview

OpenCDMP supports the evaluation of plans and descriptions by providing a flexible mechanism that allows developers to implement custom evaluation services. The **evaluator-base** package standardizes how these evaluations are integrated into the platform, ensuring that evaluations are structured, reusable, and easily extended.

The **evaluator-base** package provides the necessary Java interfaces and configuration classes to define and develop these evaluation services.

## Key Interfaces and Classes

### 1. `EvaluatorClient.java`

This interface defines the core operations that any evaluation service must implement.

```java
import org.opencdmp.evaluatorbase.models.misc.DescriptionEvaluationModel;

public interface EvaluatorClient {

   RankResultModel rankPlan(PlanEvaluationModel plan) throws InvalidApplicationException, IOException, InvalidTypeException;

   RankResultModel rankDescription(DescriptionEvaluationModel description) throws InvalidApplicationException, IOException;

   EvaluatorConfiguration getConfiguration();

   String getLogo();
}
```

- **rankPlan()**: Evaluates and ranks a plan, returning a **RankResultModel** object with the evaluation details.
- **rankDescription()**: Evaluates and ranks a description, returning a **RankResultModel ** object.
- **getConfiguration()**: Returns the configuration details of the evaluation service.
- **getLogo()**: Returns the service’s logo in base64 format, if available.

### 2. `EvaluatorController.java`

This interface defines the API endpoints that the evaluation service must implement to communicate with the OpenCDMP platform.

```java
@RequestMapping("/api/evaluator")
public interface EvaluatorController {
    
   @PostMapping("/rank/plan")
   RankResultModel rankPlan(@RequestBody PlanEvaluationModel planModel) throws Exception;

   @PostMapping("/rank/description")
   RankResultModel rankDescription(@RequestBody DescriptionEvaluationModel descriptionModel) throws Exception;

    @GetMapping("/config")
    EvaluatorConfiguration getConfiguration();

    @GetMapping("/logo")
    String getLogo();
}
```

- **rankPlan()**: Evaluates a plan and returns its rank.
- **rankDescription()**: Evaluates a description and returns its rank.
- **getConfiguration()**: Returns the evaluation service's configuration details.
- **getLogo()**: Returns the logo for the evaluation service if available.

### 3. `EvaluatorConfiguration.java`

This class contains the configuration details for each evaluation service, which the OpenCDMP platform reads and registers.

```java
public class EvaluatorConfiguration {

    private String evaluatorId;
    private RankConfig rankConfig;
    private List<PluginEntityType> evaluatorEntityTypes;
    private boolean useSharedStorage;
    private boolean hasLogo;
    private List<ConfigurationField> configurationFields;
    private List<ConfigurationField> userConfigurationFields;
    private List<BenchmarkConfiguration> availableBenchmarks;
}
```

### Fields:
- **evaluatorId**: Unique identifier for the evaluator service.
- **rankConfig**: Configuration details related to how rankings are assigned.
- **evaluatorEntityTypes**: Entity types the evaluator supports, such as plans or descriptions.
- **useSharedStorage**: Indicates if shared storage is used for the evaluator.
- **hasLogo**: Indicates if the evaluator service has a logo.
- **configurationFields**: Fields that contain additional configuration for this evaluator.
- **userConfigurationFields**: Fields that provide additional configuration options specific to this file transformer.
- **availableBenchmarks**: Benchmark that can be used to add reference.

## How to Create a Custom Evaluation Service

To implement a custom evaluation service for OpenCDMP:

1. **Create a New Spring Boot Project**:
   - Use **Spring Boot** to create a microservice that implements the `EvaluatorClient` and `EvaluatorController` interfaces.

2. **Define Your Evaluation Configuration**:
   - Define the evaluation-specific configuration in the `EvaluatorConfiguration` class.

3. **Use Existing Implementations as Examples**:
   - You can refer to other evaluation services in the OpenCDMP platform for reference.
   - You can refer to the `evaluator-rda-madmp` project that is part of the OpenCDMP platform as example.

4. **Register the Service**:
   - Once your service is implemented and running, register it with the OpenCDMP platform. It will be available as an evaluation option for plans and descriptions.

## Example

An example of an implementation is available in the `evaluator-rda-madmp` repository, where plans and descriptions are evaluated based on a json schema.

## License

This package is licensed under the [EUPL 1.2 License](LICENSE).

## Contact

For questions or support regarding the implementation of evaluation services, please contact:

- **Email**: opencdmp at cite.gr
