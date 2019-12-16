// Generated from /Users/dulaev/Desktop/lab3/src/Pascal.g4 by ANTLR 4.7.2

    import java.util.Map;
    import java.util.HashMap;
    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PascalParser}.
 */
public interface PascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(PascalParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(PascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(PascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(PascalParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(PascalParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(PascalParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(PascalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(PascalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PascalParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PascalParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(PascalParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(PascalParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PascalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PascalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(PascalParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(PascalParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(PascalParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(PascalParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(PascalParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(PascalParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(PascalParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(PascalParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(PascalParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(PascalParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(PascalParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(PascalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(PascalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(PascalParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(PascalParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(PascalParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(PascalParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(PascalParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(PascalParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(PascalParser.FinalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PascalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(PascalParser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(PascalParser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(PascalParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(PascalParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(PascalParser.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(PascalParser.AdditiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(PascalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(PascalParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(PascalParser.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(PascalParser.MultiplicativeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(PascalParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(PascalParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(PascalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(PascalParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(PascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(PascalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PascalParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(PascalParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PascalParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(PascalParser.BoolContext ctx);
}