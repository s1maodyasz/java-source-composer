package com.github.s1maodyasz.jsc.model;

import java.util.*;

public final class JavaDoc {

	private final List<String> lines;
	private final Map<JavaDocTag, String> tags;

	public JavaDoc() {
		this.lines = new ArrayList<>();
		this.tags = new LinkedHashMap<>();
	}

	public JavaDoc(final List<String> lines, final Map<JavaDocTag, String> tags) {
		this.lines = Collections.unmodifiableList(lines);
		this.tags = Collections.unmodifiableMap(tags);
	}

	public List<String> getLines() {
		return lines;
	}

	public Map<JavaDocTag, String> getTags() {
		return tags;
	}
}
