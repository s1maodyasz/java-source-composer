package com.github.s1maodyasz.jsc.model.builder.customizer;

import com.github.s1maodyasz.jsc.model.JavaDocDef;
import com.github.s1maodyasz.jsc.model.JavaDocTag;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class JavaDocsDefinitionCustomizer {

	private final List<String> lines = new LinkedList<>();
	private final Map<JavaDocTag, String> tags = new HashMap<>();

	private JavaDocsDefinitionCustomizer() {}

	public static JavaDocsDefinitionCustomizer builder() {
		return new JavaDocsDefinitionCustomizer();
	}

	public JavaDocsDefinitionCustomizer addLine(String line) {
		lines.add(line);
		return this;
	}

	public JavaDocsDefinitionCustomizer addTag(JavaDocTag tag, String value) {
		tags.put(tag, value);
		return this;
	}

	public JavaDocDef build() {
		return new JavaDocDef(lines, tags);
	}
}
