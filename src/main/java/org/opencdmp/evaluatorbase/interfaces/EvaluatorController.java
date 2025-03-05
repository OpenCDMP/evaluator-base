package org.opencdmp.evaluatorbase.interfaces;

import org.opencdmp.commonmodels.models.description.DescriptionModel;
import org.opencdmp.commonmodels.models.plan.PlanModel;
import org.opencdmp.evaluatorbase.models.misc.RankModel;
import org.springframework.web.bind.annotation.*;

/**
 * The Evaluator interface represents the mechanism of evaluation and ranking a plan or description
 */
@RequestMapping("/api/evaluator")
public interface EvaluatorController {

	@PostMapping("/rank/plan")
	RankModel rankPlan(@RequestBody PlanModel planModel) throws Exception ;

	@PostMapping("/rank/description")
	RankModel rankDescription(@RequestBody DescriptionModel descriptionModel) throws Exception;

	@GetMapping("/config")
	EvaluatorConfiguration getConfiguration();

	@GetMapping("/logo")
	String getLogo();

}
