/*
 * generated by Xtext 2.24.0
 */
package org.xtext.mde.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.mde.parser.antlr.internal.InternalDatalogParser;
import org.xtext.mde.services.DatalogGrammarAccess;

public class DatalogParser extends AbstractAntlrParser {

	@Inject
	private DatalogGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDatalogParser createParser(XtextTokenStream stream) {
		return new InternalDatalogParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public DatalogGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DatalogGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}