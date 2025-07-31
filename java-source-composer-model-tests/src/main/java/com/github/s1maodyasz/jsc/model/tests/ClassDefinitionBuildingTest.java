package com.github.s1maodyasz.jsc.model.tests;

import com.github.s1maodyasz.jsc.model.ClassDef;
import com.github.s1maodyasz.jsc.model.ClassName;
import com.github.s1maodyasz.jsc.model.JavaDocTag;
import com.github.s1maodyasz.jsc.model.builder.ClassDefinitionBuilder;
import javax.lang.model.element.Modifier;

public class ClassDefinitionBuildingTest {

	public static void main(String[] args) {
		final ClassDef ref =
				ClassDefinitionBuilder.builder()
						.packageName("com.github.s1maodyasz.jsc.model.tests")
						.className("UserRepository")
						.addAnnotation(
								annotationUsageCustomizer ->
										annotationUsageCustomizer
												.reference(ClassName.name("SuppressWarnings", "java.lang"))
												.addValue(
														annotationUsageValueCustomizer ->
																annotationUsageValueCustomizer.name("value").value("unchecked")))
						.modifiers(Modifier.PUBLIC, Modifier.FINAL)
						.docs(
								javaDocsCustomizer ->
										javaDocsCustomizer
												.addLine("this is an example java doc class")
												.addTag(JavaDocTag.AUTHOR, "s1maodyasz")
												.addTag(JavaDocTag.VERSION, "1.0"))
						.addTypeParameter(
								typeParameterCustomizer ->
										typeParameterCustomizer
												.name("T")
												.addBound(ClassName.name("Serializable", "java.io")))
						.build();
	}
}
