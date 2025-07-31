package com.github.s1maodyasz.jsc.model;

@FunctionalInterface
public interface JavaDocTag {

	JavaDocTag PARAM = JavaDocTag.of("param");
	JavaDocTag RETURN = JavaDocTag.of("return");
	JavaDocTag THROWS = JavaDocTag.of("throws");
	JavaDocTag SEE = JavaDocTag.of("see");
	JavaDocTag SINCE = JavaDocTag.of("since");
	JavaDocTag DEPRECATED = JavaDocTag.of("deprecated");
	JavaDocTag AUTHOR = JavaDocTag.of("author");
	JavaDocTag VERSION = JavaDocTag.of("version");
	JavaDocTag EXCEPTION = JavaDocTag.of("exception");
	JavaDocTag LINK = JavaDocTag.of("link");
	JavaDocTag LINKPLAIN = JavaDocTag.of("linkplain");
	JavaDocTag INHERIT_DOC = JavaDocTag.of("inheritDoc");
	JavaDocTag VALUE = JavaDocTag.of("value");
	JavaDocTag CODE = JavaDocTag.of("code");
	JavaDocTag LITERAL = JavaDocTag.of("literal");
	JavaDocTag SERIAL = JavaDocTag.of("serial");

	String name();

	static JavaDocTag of(String name) {
		return () -> name;
	}
}
