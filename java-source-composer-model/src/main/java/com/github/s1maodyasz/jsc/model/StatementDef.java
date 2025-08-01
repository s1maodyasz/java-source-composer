package com.github.s1maodyasz.jsc.model;

import java.util.Collections;
import java.util.List;

public interface StatementDef extends ElementDef {

	final class While implements StatementDef {

		private final boolean doFirst;
		private final ExpressionDef condition;
		private final CodeBlock codeBlock;

		public While(boolean doFirst, ExpressionDef condition, CodeBlock codeBlock) {
			this.doFirst = doFirst;
			this.condition = condition;
			this.codeBlock = codeBlock;
		}

		public boolean doFirst() {
			return doFirst;
		}

		public ExpressionDef condition() {
			return condition;
		}

		public CodeBlock codeBlock() {
			return codeBlock;
		}
	}

	/** This probably should be changed if we want to support more recent versions of java */
	final class Return implements StatementDef {
		private final ExpressionDef expression;

		public Return(ExpressionDef expression) {
			this.expression = expression;
		}

		public ExpressionDef expression() {
			return expression;
		}
	}

	final class Throw implements StatementDef {
		private final ExpressionDef exception;

		public Throw(ExpressionDef exception) {
			this.exception = exception;
		}

		public ExpressionDef exception() {
			return exception;
		}
	}

	class Try implements StatementDef {
		private final CodeBlock tryCodeBlock;
		private final CodeBlock catchCodeBlock;
		private final CodeBlock finallyCodeBlock;

		public Try(CodeBlock tryCodeBlock, CodeBlock catchCodeBlock, CodeBlock finallyCodeBlock) {
			this.tryCodeBlock = tryCodeBlock;
			this.catchCodeBlock = catchCodeBlock;
			this.finallyCodeBlock = finallyCodeBlock;
		}

		public CodeBlock tryCodeBlock() {
			return tryCodeBlock;
		}

		public CodeBlock catchCodeBlock() {
			return catchCodeBlock;
		}

		public CodeBlock finallyCodeBlock() {
			return finallyCodeBlock;
		}
	}

	final class TryWithResources extends Try {
		private final ExpressionDef resources;

		public TryWithResources(
				CodeBlock tryCodeBlock,
				CodeBlock catchCodeBlock,
				CodeBlock finallyCodeBlock,
				ExpressionDef resources) {
			super(tryCodeBlock, catchCodeBlock, finallyCodeBlock);
			this.resources = resources;
		}

		public ExpressionDef resources() {
			return resources;
		}
	}

	final class IfElse implements StatementDef {
		private final ExpressionDef condition;
		private final CodeBlock then;
		private final CodeBlock otherwise;
		private final List<DecisionStatementDef> specifics;

		public IfElse(
				ExpressionDef condition,
				CodeBlock then,
				CodeBlock otherwise,
				List<DecisionStatementDef> specifics) {
			this.condition = condition;
			this.then = then;
			this.otherwise = otherwise;
			this.specifics = Collections.unmodifiableList(specifics);
		}

		public ExpressionDef condition() {
			return condition;
		}

		public CodeBlock then() {
			return then;
		}

		public CodeBlock otherwise() {
			return otherwise;
		}

		public List<DecisionStatementDef> specifics() {
			return specifics;
		}
	}

	final class Switch implements StatementDef {
		private final ExpressionDef condition;
		private final List<DecisionStatementDef> cases;
		private final CodeBlock standard;

		public Switch(ExpressionDef condition, List<DecisionStatementDef> cases, CodeBlock standard) {
			this.condition = condition;
			this.cases = cases;
			this.standard = standard;
		}

		public ExpressionDef condition() {
			return condition;
		}

		public List<DecisionStatementDef> cases() {
			return cases;
		}

		public CodeBlock standard() {
			return standard;
		}
	}

	final class For implements StatementDef {
		private final ExpressionDef init;
		private final ExpressionDef condition;
		private final ExpressionDef update;
		private final CodeBlock codeBlock;

		public For(
				ExpressionDef init, ExpressionDef condition, ExpressionDef update, CodeBlock codeBlock) {
			this.init = init;
			this.condition = condition;
			this.update = update;
			this.codeBlock = codeBlock;
		}

		public ExpressionDef init() {
			return init;
		}

		public ExpressionDef condition() {
			return condition;
		}

		public ExpressionDef update() {
			return update;
		}

		public CodeBlock codeBlock() {
			return codeBlock;
		}
	}

	final class ForEach implements StatementDef {
		private final VariableDef variable;
		private final ExpressionDef expression;
		private final CodeBlock codeBlock;

		public ForEach(VariableDef variable, ExpressionDef expression, CodeBlock codeBlock) {
			this.variable = variable;
			this.expression = expression;
			this.codeBlock = codeBlock;
		}

		public VariableDef variable() {
			return variable;
		}

		public ExpressionDef expression() {
			return expression;
		}

		public CodeBlock codeBlock() {
			return codeBlock;
		}
	}

	final class Break implements StatementDef {}

	final class Continue implements StatementDef {}

	final class Synchronized implements StatementDef {
		private final ExpressionDef lock;
		private final CodeBlock codeBlock;

		public Synchronized(ExpressionDef lock, CodeBlock codeBlock) {
			this.lock = lock;
			this.codeBlock = codeBlock;
		}

		public ExpressionDef lock() {
			return lock;
		}

		public CodeBlock codeBlock() {
			return codeBlock;
		}
	}

	final class Increment implements ExpressionDef {
		private final VariableDef variable;
		private final boolean postfix;

		public Increment(VariableDef variable, boolean postfix) {
			this.variable = variable;
			this.postfix = postfix;
		}

		public VariableDef variable() {
			return variable;
		}

		public boolean postfix() {
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

		public VariableDef variable() {
			return variable;
		}

		public boolean postfix() {
			return postfix;
		}
	}
}
