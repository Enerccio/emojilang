package com.enerccio.emojilang.sys;

public class EmojiException extends RuntimeException {
	private static final long serialVersionUID = 21546175312280461L;
	
	public EmojiException() {
		super();
	}
	
	public EmojiException(String reason) {
		super(reason);
	}
	
	public EmojiException(Throwable t) {
		super(t);
	}
	
	public EmojiException(String reason, Throwable t) {
		super(reason, t);
	}

}
