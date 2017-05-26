package com.enerccio.emojilang.sys;

public class EmojiCompilationFailureException extends EmojiException {
	private static final long serialVersionUID = -920894917812946993L;

	public EmojiCompilationFailureException() {
		super();
	}

	public EmojiCompilationFailureException(String reason) {
		super(reason);
	}

	public EmojiCompilationFailureException(Throwable t) {
		super(t);
	}

	public EmojiCompilationFailureException(String reason, Throwable t) {
		super(reason, t);
	}

}
