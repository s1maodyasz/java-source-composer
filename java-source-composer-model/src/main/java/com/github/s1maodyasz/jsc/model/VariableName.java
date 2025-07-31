package com.github.s1maodyasz.jsc.model;

@FunctionalInterface
public interface VariableName extends ElementDef {

	String name();

	static VariableName of(String name) {
		return () -> name;
	}
}
