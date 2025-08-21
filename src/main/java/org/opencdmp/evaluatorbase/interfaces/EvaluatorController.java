package org.opencdmp.evaluatorbase.interfaces;

import org.opencdmp.evaluatorbase.models.misc.DescriptionEvaluationModel;
import org.opencdmp.evaluatorbase.models.misc.PlanEvaluationModel;
import org.opencdmp.evaluatorbase.models.misc.RankResultModel;
import org.springframework.web.bind.annotation.*;

/**
 * The Evaluator interface represents the mechanism of evaluation and ranking a plan or description
 */
@RequestMapping("/api/evaluator")
public interface EvaluatorController {

	@PostMapping("/rank/plan")
	RankResultModel rankPlan(@RequestBody PlanEvaluationModel planModel) throws Exception ;

	@PostMapping("/rank/description")
	RankResultModel rankDescription(@RequestBody DescriptionEvaluationModel descriptionModel) throws Exception;

	@GetMapping("/config")
	EvaluatorConfiguration getConfiguration();

	@GetMapping("/logo")
	String getLogo();

}
