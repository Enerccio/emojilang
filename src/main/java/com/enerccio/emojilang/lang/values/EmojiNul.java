package com.enerccio.emojilang.lang.values;

import java.nio.ByteBuffer;

public class EmojiNul extends EmojiObjectBase implements EmojiConstant {
	
	public static final EmojiNul INSTANCE = new EmojiNul();

	@Override
	public EmojiValueType getType() {
		return EmojiValueType.NIL;
	}

	@Override
	public byte writeTag() {
		return getType().tag;
	}

	@Override
	public void writeToBytecode(ByteBuffer buffer) {
		
	}

	@Override
	public void readFromBytecode(ByteBuffer buffer) {
		
	}

}
