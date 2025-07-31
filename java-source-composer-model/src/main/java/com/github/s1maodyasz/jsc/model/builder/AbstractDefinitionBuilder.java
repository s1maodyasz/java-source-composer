package com.github.s1maodyasz.jsc.model.builder;

import com.github.s1maodyasz.jsc.model.Def;

public abstract class AbstractDefinitionBuilder<T extends Def> {

	public abstract T build();
}
