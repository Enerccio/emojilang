package com.enerccio.emojilang.sys;

public class EmojiParserException extends EmojiCompilationFailureException {
	private static final long serialVersionUID = -1763458512626407872L;

	public EmojiParserException() {
		super();
	}

	public EmojiParserException(String reason) {
		super(reason);
	}

	public EmojiParserException(Throwable t) {
		super(t);
	}

	public EmojiParserException(String reason, Throwable t) {
		super(reason, t);
	}

}
