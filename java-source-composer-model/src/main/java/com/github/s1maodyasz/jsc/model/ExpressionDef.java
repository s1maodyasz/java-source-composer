package com.github.s1maodyasz.jsc.model;

import java.util.List;

public interface ExpressionDef extends ElementDef {

	final class Literal implements ExpressionDef {
		private final Object object;

		public Literal(Object object) {
			this.object = object;
		}

		public Object object() {
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

		public ExpressionDef condition() {
			return condition;
		}

		public ExpressionDef then() {
			return then;
		}

		public ExpressionDef otherwise() {
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

		public ExpressionDef expression() {
			return expression;
		}

		public TypeDef type() {
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

		public ExpressionDef expression() {
			return expression;
		}

		public ClassName type() {
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

		public ClassName type() {
			return type;
		}

		public List<ExpressionDef> arguments() {
			return arguments;
		}
	}

	final class IsNullable implements ExpressionDef {
		private final ExpressionDef expression;

		public IsNullable(ExpressionDef expression) {
			this.expression = expression;
		}

		public ExpressionDef expression() {
			return expression;
		}
	}

	final class isNotNull implements ExpressionDef {
		private final ExpressionDef expression;

		public isNotNull(ExpressionDef expression) {
			this.expression = expression;
		}

		public ExpressionDef expression() {
			return expression;
		}
	}
}
