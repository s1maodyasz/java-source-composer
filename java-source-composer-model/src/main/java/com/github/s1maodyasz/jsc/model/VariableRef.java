package com.github.s1maodyasz.jsc.model;

@FunctionalInterface
public interface VariableRef extends Ref {

	String name();

	static VariableRef name(String name) {
		return () -> name;
	}
}
