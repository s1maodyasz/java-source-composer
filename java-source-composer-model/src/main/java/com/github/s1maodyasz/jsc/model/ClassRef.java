package com.github.s1maodyasz.jsc.model;

/**
 * Reference to a .class file in the classpath
 */
public interface ClassRef {

    /**
     * This class is used to represent the reference to a class with {@link Class}
     */
    final class Type implements ClassRef {

        private final Class<?> type;

        public Type(Class<?> type) {
            this.type = type;
        }

        public Class<?> getType() {
            return type;
        }
    }

    final class Name implements ClassRef {

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

    static ClassRef type(Class<?> type) {
        return new Type(type);
    }

    static ClassRef name(String className, String packageName) {
        return new Name(className, packageName);
    }
}
