# Evaluator Base for OpenCDMP

**evaluator-base** is a Maven package that provides the base interfaces and configuration classes required to implement plan evaluation services for the **OpenCDMP** platform. Each evaluation service is developed as a separate microservice and can be registered with OpenCDMP to support the evaluation and ranking of **Plans** and related **Descriptions**.

---

## Overview

OpenCDMP supports the evaluation of plans and descriptions by providing a flexible mechanism that allows developers to implement custom evaluation services. The **evaluator-base** package standardizes how these evaluations are integrated into the platform, ensuring that evaluations are structured, reusable, and easily extended.

The **evaluator-base** package provides the necessary Java interfaces and configuration classes to define and develop these evaluation services.

**Documentation**: [Evaluator Service Guide](https://opencdmp.github.io/developers/plugins/evaluator)

---

## Key Interfaces and Classes

For key interfaces check the documentation [here](https://opencdmp.github.io/developers/plugins/evaluator/#key-interfaces-and-classes).

---

## How to Create a Custom Evaluation Service

To implement a custom evaluation service for OpenCDMP:

[How to Create a Custom Evaluation Service](https://opencdmp.github.io/developers/plugins/evaluator/#how-to-create-a-custom-evaluation-service)

1. **Create a New Spring Boot Project**:
   - Use **Spring Boot** to create a microservice that implements the `EvaluatorClient` and `EvaluatorController` interfaces.

2. **Define Your Evaluation Configuration**:
   - Define the evaluation-specific configuration in the `EvaluatorConfiguration` class.

3. **Register the Service**:
   - Once your service is implemented and running, register it with the OpenCDMP platform. It will be available as an evaluation option for plans and descriptions.

---

## Reference Implementations

You can refer to the [RDA maDMP](https://github.com/OpenCDMP/evaluator-rda-madmp) and [OSTrails](https://github.com/OpenCDMP/evaluator-ostrails-dmp-evaluation-service) evalautor services that are part of the OpenCDMP platform as examples.

---

## Architecture Integration

Evaluator services integrate with OpenCDMP through:

1. **REST API**: Services expose endpoints defined by `EvaluatorController`
2. **Service Registry**: OpenCDMP backend registers available evalautors via configuration
3. **Common Models**: Data exchange using shared models from `common-models` package
4. **Microservices**: Each evalautor runs as an independent service

## Related Resources

- **Common Models**: [common-models repository](https://github.com/OpenCDMP/common-models)
- **Main Repository**: [OpenCDMP](https://github.com/OpenCDMP/OpenCDMP)
- **Evaluators Overview**: https://opencdmp.github.io/optional-services/evaluator-services
- **Developer Plugin Guide**: https://opencdmp.github.io/developers/plugins/evaluator

---

## License

This package is licensed under the [EUPL 1.2 License](LICENSE).

---

## Contact

For questions or support regarding the implementation of evaluation services, please contact:

- **Email**: opencdmp at cite.gr

---

*This package is part of the OpenCDMP ecosystem. For general OpenCDMP documentation, visit [opencdmp.github.io](https://opencdmp.github.io).*
