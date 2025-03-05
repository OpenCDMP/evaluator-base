package org.opencdmp.evaluatorbase.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import org.opencdmp.commonmodels.enums.EnumUtils;
import org.opencdmp.commonmodels.enums.EnumValueProvider;

import java.util.Map;

public enum EvaluatorEntityType implements EnumValueProvider<Short> {
	Plan((short) 0),
	Description((short) 1);

	private final Short value;
	private static final Map<Short, EvaluatorEntityType> map = EnumUtils.getEnumValueMap(EvaluatorEntityType.class);

	private EvaluatorEntityType(Short value) {
		this.value = value;
	}

	@JsonValue
	public Short getValue() {
		return this.value;
	}

	public static EvaluatorEntityType of(Short i) {
		return (EvaluatorEntityType)map.get(i);
	}
}