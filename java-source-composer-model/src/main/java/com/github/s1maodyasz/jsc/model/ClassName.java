package com.github.s1maodyasz.jsc.model;

public interface ClassName extends TypeDef {

	/** This class is used to represent the reference to a class with {@link Class} */
	@FunctionalInterface
	interface Type extends ClassName {
		Class<?> type();

		static Type of(Class<?> type) {
			return () -> type;
		}
	}

	/** This class is used to represent the reference to a class with name and package */
	final class Reference implements ClassName {
		private final String className;
		private final String packageName;

		public Reference(String className, String packageName) {
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

	static ClassName reference(String className, String packageName) {
		return new Reference(className, packageName);
	}
}
