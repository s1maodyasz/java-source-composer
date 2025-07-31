package com.github.s1maodyasz.jsc.model;

public interface ClassName extends TypeDef {

	/** This class is used to represent the reference to a class with {@link Class} */
	@FunctionalInterface
	interface Type extends ClassName {
		Class<?> of();

		static Type of(Class<?> type) {
			return () -> type;
		}
	}

	/** This class is used to represent the reference to a class with name and package */
	final class Name implements ClassName {
		private final String className;
		private final String packageName;

		public Name(String className, String packageName) {
			this.className = className;
			this.packageName = packageName;
		}

		public String getClassName() {
			return className;
		}

		public String getPackageName() {
			return packageName;
		}
	}

	static ClassName type(Class<?> type) {
		return Type.of(type);
	}

	static ClassName name(String className, String packageName) {
		return new Name(className, packageName);
	}
}
