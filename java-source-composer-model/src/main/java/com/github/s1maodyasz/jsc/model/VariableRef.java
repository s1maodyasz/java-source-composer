package com.github.s1maodyasz.jsc.model;

public interface VariableRef extends Ref {

    final class Name implements VariableRef {
        private final String name;

        public Name(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    final class Variable implements VariableRef {
        private VariableDef variable;

        public Variable(VariableDef variable) {
            this.variable = variable;
        }

        public VariableDef getVariable() {
            return variable;
        }
    }
}
