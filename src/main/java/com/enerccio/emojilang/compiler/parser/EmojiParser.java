package com.enerccio.emojilang.compiler.parser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.BitSet;

import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import com.enerccio.emojilang.grammar.emojiLexer;
import com.enerccio.emojilang.grammar.emojiParser;
import com.enerccio.emojilang.grammar.emojiParser.CompilationUnitContext;
import com.enerccio.emojilang.sys.EmojiLexerException;
import com.enerccio.emojilang.sys.EmojiParserException;

public class EmojiParser {

	private File src;
	private emojiLexer lexer;
	private emojiParser parser;
	
	public EmojiParser(File src, String data) {
		CharStream input = CharStreams.fromString(data);
		this.src = src;
        prepare(input);
	}
	
	public EmojiParser(File src, InputStream data) throws IOException {
		CharStream input = CharStreams.fromStream(data);
		this.src = src;
        prepare(input);
	}
	
	private void prepare(CharStream input) {
		lexer = new emojiLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new ANTLRErrorListener() {
			
			@Override
			public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
					String msg, RecognitionException e) {
				throw new EmojiLexerException("Failed to parse token at line " + line + ", char " + charPositionInLine + ", "
						+ "offending symbol " + offendingSymbol + " " + msg + (src == null ? "" : " at " + src), e);
			}
			
			@Override
			public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
					ATNConfigSet configs) {
				
			}
			
			@Override
			public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
					BitSet conflictingAlts, ATNConfigSet configs) {
				
			}
			
			@Override
			public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
					BitSet ambigAlts, ATNConfigSet configs) {
				
			}
		});
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        parser = new emojiParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ANTLRErrorListener() {
			
			@Override
			public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine,
					String msg, RecognitionException e) {
				throw new EmojiParserException("Failed to parse grammar at line " + line + ", char " + charPositionInLine + ", "
						+ "offending symbol " + offendingSymbol + " " + msg + (src == null ? "" : " at " + src), e);
			}
			
			@Override
			public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction,
					ATNConfigSet configs) {
				
			}
			
			@Override
			public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex,
					BitSet conflictingAlts, ATNConfigSet configs) {
				
			}
			
			@Override
			public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact,
					BitSet ambigAlts, ATNConfigSet configs) {
				
			}
		});
	}

	public CompilationUnitContext parse() {
		return parser.compilationUnit();
	}

}
