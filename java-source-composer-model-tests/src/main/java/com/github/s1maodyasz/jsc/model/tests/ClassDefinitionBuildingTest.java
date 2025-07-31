package com.github.s1maodyasz.jsc.model.tests;

import com.github.s1maodyasz.jsc.model.ClassName;
import com.github.s1maodyasz.jsc.model.Def;
import com.github.s1maodyasz.jsc.model.builder.ClassDefinitionBuilder;

public class ClassDefinitionBuildingTest {

	// This way is quite perfect, but it's a bit verbose and need a lot of code
	public static void main(String[] args) {
		final Def userDef =
				ClassDefinitionBuilder.create()
						.packageName("com.github.s1maodyasz.jsc.model.tests")
						.annotations(
								customizable ->
										customizable.add(
												annotationUsageBuilder ->
														annotationUsageBuilder
																.name(ClassName.type(SuppressWarnings.class))
																.value("value", new String[] {"unchecked", "deprecation"})))
						.build();
	}
}
