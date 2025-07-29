package com.github.s1maodyasz.jsc.model;

/**
 * Reference to a .class file in the classpath
 */
public final class ClassRef {

    private final String source;
    private final String name;

    public ClassRef(String source, String name) {
        this.source = source;
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public String getName() {
        return name;
    }
}
