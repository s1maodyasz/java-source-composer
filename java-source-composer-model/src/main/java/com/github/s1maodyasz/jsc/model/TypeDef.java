package com.github.s1maodyasz.jsc.model;

import java.util.Collections;
import java.util.List;

public interface TypeDef {

    TypeDef VOID = new Keyword(void.class);

    TypeDef NULL = new Keyword(null);

    final class Primitive implements TypeDef {
        public static final Primitive BOOLEAN = new Primitive(boolean.class);
        public static final Primitive BYTE = new Primitive(byte.class);
        public static final Primitive SHORT = new Primitive(short.class);
        public static final Primitive INT = new Primitive(int.class);
        public static final Primitive LONG = new Primitive(long.class);
        public static final Primitive FLOAT = new Primitive(float.class);
        public static final Primitive DOUBLE = new Primitive(double.class);
        public static final Primitive CHAR = new Primitive(char.class);

        final Class<?> type;

        public Primitive(Class<?> type) {
            this.type = type;
        }
    }

    final class Array implements TypeDef {
        final TypeDef type;
        final int dimensions;

        public Array(TypeDef type, int dimensions) {
            this.type = type;
            this.dimensions = dimensions;
        }
    }

    final class Wildcard implements TypeDef {
        final List<TypeDef> uppers;
        final List<TypeDef> lowers;

        public Wildcard(List<TypeDef> uppers, List<TypeDef> lowers) {
            this.uppers = uppers;
            this.lowers = lowers;
        }
    }

    final class TypeVariable implements TypeDef {
        final String name;
        final List<TypeDef> bounds;

        public TypeVariable(String name, List<TypeDef> bounds) {
            this.name = name;
            this.bounds = bounds;
        }
    }

    /**
     * This is a special type used to represent the "this" type.
     */
    final class This implements TypeDef { }

    /**
     * This is a special type used to represent the "super" type.
     */
    final class Super implements TypeDef { }

    /**
     * Another types used to represent special keywords like void or null
     */
    final class Keyword implements TypeDef {
        final Class<?> type;

        public Keyword(Class<?> type) {
            this.type = type;
        }
    }

    default boolean isPrimitive() {
        return this instanceof Primitive;
    }

    default boolean isArray() {
        return this instanceof Array;
    }

    static TypeDef array(TypeDef type) {
        return new Array(type, 1);
    }

    static TypeDef array(TypeDef type, int dimensions) {
        return new Array(type, dimensions);
    }

    static TypeDef wildcardWithoutBounds() {
        return new Wildcard(
                Collections.emptyList(),
                Collections.emptyList()
        );
    }

    static TypeDef wildcardWithUppers(List<TypeDef> uppers) {
        return new Wildcard(
                uppers,
                Collections.emptyList()
        );
    }

    static TypeDef wildcardWithLowers(List<TypeDef> lowers) {
        return new Wildcard(
                Collections.emptyList(),
                lowers
        );
    }

    static TypeDef wildcardWithBounds(List<TypeDef> uppers, List<TypeDef> lowers) {
        return new Wildcard(
                uppers,
                lowers
        );
    }
}
