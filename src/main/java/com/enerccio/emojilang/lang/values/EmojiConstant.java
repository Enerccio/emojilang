package com.enerccio.emojilang.lang.values;

import java.nio.ByteBuffer;

public interface EmojiConstant {
	
	public byte writeTag();
	public void writeToBytecode(ByteBuffer buffer);
	public void readFromBytecode(ByteBuffer buffer);

	public static EmojiConstant parseTag() {
		return null;
	}
}
