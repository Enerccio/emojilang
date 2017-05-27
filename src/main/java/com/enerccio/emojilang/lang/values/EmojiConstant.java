package com.enerccio.emojilang.lang.values;

import java.io.OutputStream;

public interface EmojiConstant {
	
	public String writeTag();
	public void writeToBytecode(OutputStream buffer);
	public void readFromBytecode(OutputStream buffer);

	public static EmojiConstant parseTag() {
		return null;
	}
}
