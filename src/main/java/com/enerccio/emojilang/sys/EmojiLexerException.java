package com.enerccio.emojilang.sys;

public class EmojiLexerException extends EmojiCompilationFailureException {
	private static final long serialVersionUID = 3356188509828674621L;

	public EmojiLexerException() {
		super();
	}

	public EmojiLexerException(String reason) {
		super(reason);
	}

	public EmojiLexerException(Throwable t) {
		super(t);
	}

	public EmojiLexerException(String reason, Throwable t) {
		super(reason, t);
	}

}
