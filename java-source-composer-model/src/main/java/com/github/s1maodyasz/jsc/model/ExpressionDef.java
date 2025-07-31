package com.github.s1maodyasz.jsc.model;

import java.util.List;

public interface ExpressionDef extends ElementDef {

	final class Literal implements ExpressionDef {
		private final Object object;

		public Literal(Object object) {
			this.object = object;
		}

		public Object getValue() {
			return object;
		}
	}

	final class Variable implements ExpressionDef {
		private final VariableRef object;

		public Variable(VariableRef object) {
			this.object = object;
		}

		public VariableRef getVariable() {
			return object;
		}
	}

	final class Ternary implements ExpressionDef {
		private final ExpressionDef condition;
		private final ExpressionDef then;
		private final ExpressionDef otherwise;

		public Ternary(ExpressionDef condition, ExpressionDef then, ExpressionDef otherwise) {
			this.condition = condition;
			this.then = then;
			this.otherwise = otherwise;
		}

		public ExpressionDef getCondition() {
			return condition;
		}

		public ExpressionDef getThen() {
			return then;
		}

		public ExpressionDef getOtherwise() {
			return otherwise;
		}
	}

	final class Cast implements ExpressionDef {
		private final ExpressionDef expression;
		private final TypeDef type;

		public Cast(ExpressionDef expression, TypeDef type) {
			this.expression = expression;
			this.type = type;
		}

		public ExpressionDef getExpression() {
			return expression;
		}

		public TypeDef getType() {
			return type;
		}
	}

	final class InstanceOf implements ExpressionDef {
		private final ExpressionDef expression;
		private final ClassName type;

		public InstanceOf(ExpressionDef expression, ClassName type) {
			this.expression = expression;
			this.type = type;
		}

		public ExpressionDef getExpression() {
			return expression;
		}

		public ClassName getType() {
			return type;
		}
	}

	final class New implements ExpressionDef {
		private final ClassName type;
		private final List<ExpressionDef> arguments;

		public New(ClassName type, List<ExpressionDef> arguments) {
			this.type = type;
			this.arguments = arguments;
		}

		public ClassName getType() {
			return type;
		}

		public List<ExpressionDef> getArguments() {
			return arguments;
		}
	}

	final class IsNullable implements ExpressionDef {
		private final ExpressionDef expression;

		public IsNullable(ExpressionDef expression) {
			this.expression = expression;
		}

		public ExpressionDef getExpression() {
			return expression;
		}
	}

	final class IsNonNull implements ExpressionDef {
		private final ExpressionDef expression;

		public IsNonNull(ExpressionDef expression) {
			this.expression = expression;
		}

		public ExpressionDef getExpression() {
			return expression;
		}
	}

	static ExpressionDef Literal(Object object) {
		return new Literal(object);
	}

	static ExpressionDef Variable(VariableRef variableRef) {
		return new Variable(variableRef);
	}

	static ExpressionDef Cast(ExpressionDef expression, TypeDef type) {
		return new Cast(expression, type);
	}

	static ExpressionDef InstanceOf(ExpressionDef expression, ClassName type) {
		return new InstanceOf(expression, type);
	}

	static ExpressionDef New(ClassName type, List<ExpressionDef> arguments) {
		return new New(type, arguments);
	}

	static ExpressionDef IsNullable(ExpressionDef expression) {
		return new IsNullable(expression);
	}

	static ExpressionDef IsNonNull(ExpressionDef expression) {
		return new IsNonNull(expression);
	}
}
