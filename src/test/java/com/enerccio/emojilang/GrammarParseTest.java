package com.enerccio.emojilang;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.enerccio.emojilang.compiler.parser.EmojiParser;
import com.enerccio.emojilang.grammar.emojiParser.CompilationUnitContext;

public class GrammarParseTest {
	
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream(new File("test.cp"));
		EmojiParser p = new EmojiParser(new File("test.cp"), is);
        CompilationUnitContext ctx = p.parse();
        
        System.out.println("Package name: " + ctx.packageDeclaration().getText());
	}
	
}
