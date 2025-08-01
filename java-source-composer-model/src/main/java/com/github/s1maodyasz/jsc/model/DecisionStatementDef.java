package com.github.s1maodyasz.jsc.model;

/**
 * Used in {@link StatementDef.IfElse} and {@link StatementDef.Switch} for representing decision
 * statements
 */
public final class DecisionStatementDef implements Def {

	private final ExpressionDef condition;
	private final CodeBlock codeBlock;

	public DecisionStatementDef(ExpressionDef condition, CodeBlock codeBlock) {
		this.condition = condition;
		this.codeBlock = codeBlock;
	}

	public ExpressionDef condition() {
		return condition;
	}

	public CodeBlock scope() {
		return codeBlock;
	}
}
