package org.opencdmp.evaluatorbase.interfaces;

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
     * @param plan plan evaluation structure that contains plan model and benchmark ids (can be used for available configuration)
     * @return an object containing plan ranking level, messages and details from the result
     */
    RankResultModel rankPlan(PlanEvaluationModel plan);

    /**
     * Returns an object with rank info of plan
     *
     * @param description description evaluation structure that contains description model and benchmark ids (can be used for available configuration)
     * @return an object containing description ranking level, messages and details from the result
     */
    RankResultModel rankDescription(DescriptionEvaluationModel description) ;

    /**
     * Returns the configuration details of the service
     */
    EvaluatorConfiguration getConfiguration();

    /**
     * Returns service's logo
     */
    String getLogo();
}