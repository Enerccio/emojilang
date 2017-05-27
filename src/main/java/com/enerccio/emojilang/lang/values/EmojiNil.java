package com.enerccio.emojilang.lang.values;

import java.io.OutputStream;

public class EmojiNil extends EmojiObjectBase implements EmojiConstant {
	
	public static final EmojiNil INSTANCE = new EmojiNil();

	@Override
	public EmojiValueType getType() {
		return EmojiValueType.NIL;
	}

	@Override
	public String writeTag() {
		return getType().tag;
	}

	@Override
	public void writeToBytecode(OutputStream buffer) {
		
	}

	@Override
	public void readFromBytecode(OutputStream buffer) {
		
	}

}
