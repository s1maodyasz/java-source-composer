package com.github.s1maodyasz.jsc.model;

import java.util.Collections;
import java.util.List;

public interface TypeDef {

	// Some special types and common references
	ClassName STRING = ClassName.type(String.class);
	ClassName OBJECT = ClassName.type(Object.class);
	ClassName VOID = ClassName.type(void.class);
	ClassName NULL = ClassName.type(null);

	final class Primitive implements TypeDef {
		public static final Primitive BOOLEAN =
				new Primitive(boolean.class, ClassName.type(Boolean.class));
		public static final Primitive BYTE = new Primitive(byte.class, ClassName.type(Byte.class));
		public static final Primitive SHORT = new Primitive(short.class, ClassName.type(Short.class));
		public static final Primitive INT = new Primitive(int.class, ClassName.type(Integer.class));
		public static final Primitive LONG = new Primitive(long.class, ClassName.type(Long.class));
		public static final Primitive FLOAT = new Primitive(float.class, ClassName.type(Float.class));
		public static final Primitive DOUBLE =
				new Primitive(double.class, ClassName.type(Double.class));
		public static final Primitive CHAR = new Primitive(char.class, ClassName.type(Character.class));

		final Class<?> originalType;
		final ClassName boxedType;

		public Primitive(Class<?> originalType, ClassName boxedType) {
			this.originalType = originalType;
			this.boxedType = boxedType;
		}

		public Class<?> getOriginalType() {
			return originalType;
		}

		public ClassName getBoxedType() {
			return boxedType;
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

		public Wildcard() {
			this.uppers = Collections.emptyList();
			this.lowers = Collections.emptyList();
		}

		public Wildcard(List<TypeDef> uppers, List<TypeDef> lowers) {
			this.uppers = uppers;
			this.lowers = lowers;
		}

		public List<TypeDef> getUppers() {
			return uppers;
		}

		public List<TypeDef> getLowers() {
			return lowers;
		}
	}

	final class TypeVariable implements TypeDef {
		final String name;
		final List<TypeDef> bounds;

		public TypeVariable(String name) {
			this.name = name;
			this.bounds = Collections.emptyList();
		}

		public TypeVariable(String name, List<TypeDef> bounds) {
			this.name = name;
			this.bounds = bounds;
		}

		public String getName() {
			return name;
		}

		public List<TypeDef> getBounds() {
			return bounds;
		}
	}

	/** This is a special type used to represent the "union" type for exceptions for example. */
	final class Union implements TypeDef {
		private final String name;
		private final List<TypeDef> types;

		public Union(String name) {
			this.name = name;
			this.types = Collections.emptyList();
		}

		public Union(String name, List<TypeDef> types) {
			this.name = name;
			this.types = types;
		}

		public String getName() {
			return name;
		}

		public List<TypeDef> getTypes() {
			return types;
		}
	}

	/**
	 * This is a special type used to represent the "intersection" type for interfaces for example.
	 */
	final class Intersection implements TypeDef {
		private final String name;
		private final List<TypeDef> types;

		public Intersection(String name) {
			this.name = name;
			this.types = Collections.emptyList();
		}

		public Intersection(String name, List<TypeDef> types) {
			this.name = name;
			this.types = types;
		}

		public String getName() {
			return name;
		}

		public List<TypeDef> getTypes() {
			return types;
		}
	}

	/** Special type used to represent the "this" type. */
	final class This implements TypeDef {}

	/** Special type used to represent the "super" type. */
	final class Super implements TypeDef {}

	default boolean isPrimitive() {
		return this instanceof Primitive;
	}

	default boolean isArray() {
		return this instanceof Array;
	}
}
