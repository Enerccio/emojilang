package com.enerccio.emojilang.lang.values;

import com.enerccio.emojilang.sys.EmojiException;

public abstract class EmojiValue {
	
	public abstract EmojiValueType getType();
	
	public abstract EmojiValue performOperation(String operation, 
			EmojiValue... emojiValues) throws EmojiException;
	
	protected EmojiException operationFailure(String operation, 
			EmojiValue... emojiValues) {
		return new EmojiException(generateFailureMessage(operation, emojiValues));
	}
	
	private String generateFailureMessage(String operation, 
			EmojiValue... emojiValues) {
		String msg = "Undefined operation <" + operation + ">";
		return msg;
	}

}
