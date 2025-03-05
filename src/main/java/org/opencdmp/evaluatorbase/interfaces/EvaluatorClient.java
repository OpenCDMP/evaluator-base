package org.opencdmp.evaluatorbase.interfaces;

import com.sun.jdi.InvalidTypeException;
import org.opencdmp.commonmodels.models.description.DescriptionModel;
import org.opencdmp.commonmodels.models.plan.PlanModel;
import org.opencdmp.evaluatorbase.models.misc.*;

import javax.management.InvalidApplicationException;
import java.io.IOException;

/**
 * The Evaluator interface represents the mechanism of evaluation and ranking a plan or description
 */
public interface EvaluatorClient {

    /**
     * Returns an object with rank info of plan
     *
     * @param plan plan structure
     * @return an object containing plan ranking level, messages and details from the result
     * @throws Exception if an error occurs while trying to ranking and evaluate the plan
     */
    RankModel rankPlan(PlanModel plan) throws InvalidApplicationException, IOException, InvalidTypeException;

    /**
     * Returns an object with rank info of plan
     *
     * @param description description structure
     * @return an object containing description ranking level, messages and details from the result
     * @throws Exception if an error occurs while trying to ranking and evaluate the description
     */
    RankModel rankDescription(DescriptionModel description) throws InvalidApplicationException, IOException;

    /**
     * Returns the configuration details of the service
     */
    EvaluatorConfiguration getConfiguration();

    /**
     * Returns service's logo
     */
    String getLogo();
}