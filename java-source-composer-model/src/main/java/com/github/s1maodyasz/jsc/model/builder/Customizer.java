package com.github.s1maodyasz.jsc.model.builder.customizer;

@FunctionalInterface
public interface Customizer<T, B> {

    T customize(B builder);

}
