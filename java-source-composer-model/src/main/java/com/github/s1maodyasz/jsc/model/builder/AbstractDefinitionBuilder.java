package com.github.s1maodyasz.jsc.model.builder;

import com.github.s1maodyasz.jsc.model.ElementDef;

public abstract class AbstractElementDefBuilder<T extends ElementDef> {

    public abstract T build();

}
