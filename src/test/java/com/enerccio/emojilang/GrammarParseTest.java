package com.enerccio.emojilang;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import com.enerccio.emojilang.grammar.emojiLexer;
import com.enerccio.emojilang.grammar.emojiParser;
import com.enerccio.emojilang.grammar.emojiParser.CompilationUnitContext;

public class GrammarParseTest {
	
	public static void main(String[] args) throws IOException {
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("test.cp");
		CharStream input = CharStreams.fromStream(is);
        emojiLexer lexer = new emojiLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        emojiParser parser = new emojiParser(tokens);
        CompilationUnitContext ctx = parser.compilationUnit();
        
        System.out.println("Package name: " + ctx.packageDeclaration().emojiStream().getText());
	}
	
}
