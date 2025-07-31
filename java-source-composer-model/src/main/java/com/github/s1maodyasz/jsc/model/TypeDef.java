package com.github.s1maodyasz.jsc.model;

import java.util.Collections;
import java.util.List;

public interface TypeDef {

	// Some special types and common references
	ClassRef STRING = ClassRef.type(String.class);
	ClassRef OBJECT = ClassRef.type(Object.class);
	ClassRef VOID = ClassRef.type(void.class);
	ClassRef NULL = ClassRef.type(null);

	final class Primitive implements TypeDef {
		public static final Primitive BOOLEAN =
				new Primitive(boolean.class, ClassRef.type(Boolean.class));
		public static final Primitive BYTE = new Primitive(byte.class, ClassRef.type(Byte.class));
		public static final Primitive SHORT = new Primitive(short.class, ClassRef.type(Short.class));
		public static final Primitive INT = new Primitive(int.class, ClassRef.type(Integer.class));
		public static final Primitive LONG = new Primitive(long.class, ClassRef.type(Long.class));
		public static final Primitive FLOAT = new Primitive(float.class, ClassRef.type(Float.class));
		public static final Primitive DOUBLE = new Primitive(double.class, ClassRef.type(Double.class));
		public static final Primitive CHAR = new Primitive(char.class, ClassRef.type(Character.class));

		final Class<?> originalType;
		final ClassRef boxedType;

		public Primitive(Class<?> originalType, ClassRef boxedType) {
			this.originalType = originalType;
			this.boxedType = boxedType;
		}

		public Class<?> getOriginalType() {
			return originalType;
		}

		public ClassRef getBoxedType() {
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
		return new Wildcard();
	}

	static TypeDef wildcardWithUppers(List<TypeDef> uppers) {
		return new Wildcard(uppers, Collections.emptyList());
	}

	static TypeDef wildcardWithLowers(List<TypeDef> lowers) {
		return new Wildcard(Collections.emptyList(), lowers);
	}

	static TypeDef wildcardWithBounds(List<TypeDef> uppers, List<TypeDef> lowers) {
		return new Wildcard(uppers, lowers);
	}

	static TypeDef typeVariable(String name) {
		return new TypeVariable(name);
	}

	static TypeDef typeVariable(String name, List<TypeDef> bounds) {
		return new TypeVariable(name, bounds);
	}

	static TypeDef union(String name) {
		return new Union(name);
	}

	static TypeDef union(String name, List<TypeDef> types) {
		return new Union(name, types);
	}

	static TypeDef intersection(String name) {
		return new Intersection(name);
	}

	static TypeDef intersection(String name, List<TypeDef> types) {
		return new Intersection(name, types);
	}
}
