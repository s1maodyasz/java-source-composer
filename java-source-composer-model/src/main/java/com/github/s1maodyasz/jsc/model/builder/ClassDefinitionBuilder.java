package com.github.s1maodyasz.jsc.model.builder;

import com.github.s1maodyasz.jsc.model.*;
import java.util.List;
import javax.lang.model.element.Modifier;

public final class ClassDefinitionBuilder extends AbstractDefinitionBuilder<Def.Class> {

	private String packageName;
	private List<AnnotationUsage> annotations;
	private List<Modifier> modifiers;
	private String className;
	private JavaDocDef docs;
	private List<TypeDef> typeParameters;
	private List<StatementDef.Variable> variables;
	private List<Def.Method> methods;
	private InitDef.Static staticInitiator;
	private List<InitDef.Constructor> constructors;
	private List<Def.Class> innerClasses;

	private ClassDefinitionBuilder() {}

	public static ClassDefinitionBuilder create() {
		return new ClassDefinitionBuilder();
	}

	public ClassDefinitionBuilder packageName(String packageName) {
		this.packageName = packageName;
		return this;
	}

	public ClassDefinitionBuilder annotations(
			Customizer<AnnotationUsageCollectionCustomizer> customizer) {
		final AnnotationUsageCollectionCustomizer customize =
				new AnnotationUsageCollectionCustomizer(this.annotations);
		customizer.customize(customize);
		this.annotations = customize.customize();
		return this;
	}

	@Override
	public Def.Class build() {
		return null; // TODO
	}
}
