package com.github.s1maodyasz.jsc.model.builder;

@FunctionalInterface
public interface Customizer<T extends Customizable> {

	void customize(T customizable);
}
