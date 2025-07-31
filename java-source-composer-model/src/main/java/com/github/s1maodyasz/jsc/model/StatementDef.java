package com.github.s1maodyasz.jsc.model;

import java.util.Collections;
import java.util.List;

public interface StatementDef extends ElementDef {

	final class While implements StatementDef {

		private final boolean doFirst;
		private final ExpressionDef condition;
		private final Scope scope;

		public While(boolean doFirst, ExpressionDef condition, Scope scope) {
			this.doFirst = doFirst;
			this.condition = condition;
			this.scope = scope;
		}

		public boolean doFirst() {
			return doFirst;
		}

		public ExpressionDef getCondition() {
			return condition;
		}

		public Scope getScope() {
			return scope;
		}
	}

	/** This probably should be changed if we want to support more recent versions of java */
	final class Return implements StatementDef {
		private final ExpressionDef expression;

		public Return(ExpressionDef expression) {
			this.expression = expression;
		}

		public ExpressionDef getExpression() {
			return expression;
		}
	}

	final class Throw implements StatementDef {
		private final ExpressionDef exception;

		public Throw(ExpressionDef exception) {
			this.exception = exception;
		}

		public ExpressionDef getException() {
			return exception;
		}
	}

	class Try implements StatementDef {
		private final Scope tryScope;
		private final Scope catchScope;
		private final Scope finallyScope;

		public Try(Scope tryScope, Scope catchScope, Scope finallyScope) {
			this.tryScope = tryScope;
			this.catchScope = catchScope;
			this.finallyScope = finallyScope;
		}

		public Scope getTryScope() {
			return tryScope;
		}

		public Scope getCatchScope() {
			return catchScope;
		}

		public Scope getFinallyScope() {
			return finallyScope;
		}
	}

	final class TryWithResources extends Try {
		private final ExpressionDef resources;

		public TryWithResources(
				Scope tryScope, Scope catchScope, Scope finallyScope, ExpressionDef resources) {
			super(tryScope, catchScope, finallyScope);
			this.resources = resources;
		}

		public ExpressionDef getResources() {
			return resources;
		}
	}

	final class IfElse implements StatementDef {
		private final ExpressionDef condition;
		private final Scope then;
		private final Scope otherwise;
		private final List<DecisionStatementDef> specifics;

		public IfElse(
				ExpressionDef condition,
				Scope then,
				Scope otherwise,
				List<DecisionStatementDef> specifics) {
			this.condition = condition;
			this.then = then;
			this.otherwise = otherwise;
			this.specifics = Collections.unmodifiableList(specifics);
		}

		public ExpressionDef getCondition() {
			return condition;
		}

		public Scope getThen() {
			return then;
		}

		public Scope getOtherwise() {
			return otherwise;
		}

		public List<DecisionStatementDef> getSpecifics() {
			return specifics;
		}
	}

	final class Switch implements StatementDef {
		private final ExpressionDef condition;
		private final List<DecisionStatementDef> cases;
		private final Scope standard;

		public Switch(ExpressionDef condition, List<DecisionStatementDef> cases, Scope standard) {
			this.condition = condition;
			this.cases = cases;
			this.standard = standard;
		}

		public ExpressionDef getCondition() {
			return condition;
		}

		public List<DecisionStatementDef> getCases() {
			return cases;
		}

		public Scope getStandard() {
			return standard;
		}
	}

	final class For implements StatementDef {
		private final ExpressionDef init;
		private final ExpressionDef condition;
		private final ExpressionDef update;
		private final Scope scope;

		public For(ExpressionDef init, ExpressionDef condition, ExpressionDef update, Scope scope) {
			this.init = init;
			this.condition = condition;
			this.update = update;
			this.scope = scope;
		}

		public ExpressionDef getInit() {
			return init;
		}

		public ExpressionDef getCondition() {
			return condition;
		}

		public ExpressionDef getUpdate() {
			return update;
		}

		public Scope getScope() {
			return scope;
		}
	}

	final class ForEach implements StatementDef {
		private final VariableDef variable;
		private final ExpressionDef expression;
		private final Scope scope;

		public ForEach(VariableDef variable, ExpressionDef expression, Scope scope) {
			this.variable = variable;
			this.expression = expression;
			this.scope = scope;
		}

		public VariableDef getVariable() {
			return variable;
		}

		public ExpressionDef getExpression() {
			return expression;
		}

		public Scope getScope() {
			return scope;
		}
	}

	final class Break implements StatementDef {}

	final class Continue implements StatementDef {}

	final class Synchronized implements StatementDef {
		private final ExpressionDef lock;
		private final Scope scope;

		public Synchronized(ExpressionDef lock, Scope scope) {
			this.lock = lock;
			this.scope = scope;
		}

		public ExpressionDef getLock() {
			return lock;
		}

		public Scope getScope() {
			return scope;
		}
	}

	final class Increment implements ExpressionDef {
		private final VariableDef variable;
		private final boolean postfix;

		public Increment(VariableDef variable, boolean postfix) {
			this.variable = variable;
			this.postfix = postfix;
		}

		public VariableDef getVariable() {
			return variable;
		}

		public boolean isPostfix() {
			return postfix;
		}
	}

	final class Decrement implements ExpressionDef {
		private final VariableDef variable;
		private final boolean postfix;

		public Decrement(VariableDef variable, boolean postfix) {
			this.variable = variable;
			this.postfix = postfix;
		}

		public VariableDef getVariable() {
			return variable;
		}

		public boolean isPostfix() {
			return postfix;
		}
	}
}
