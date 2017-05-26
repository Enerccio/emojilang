package com.enerccio.emojilang.lang.values;

import com.enerccio.emojilang.sys.EmojiException;

public class EmojiModule extends EmojiObjectBase {

	@Override
	public EmojiValueType getType() {
		return EmojiValueType.MODULE;
	}

	@Override
	public EmojiValue performOperation(String operation, EmojiValue... emojiValues) throws EmojiException {		
		return super.performOperation(operation, emojiValues);
	}

}
