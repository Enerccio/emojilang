package com.enerccio.emojilang.lang.values;

import com.enerccio.emojilang.runtime.EmojiRuntime;

public interface EmojiInstance {
	
	EmojiValue access(EmojiRuntime runtime, String name);
	void write(EmojiRuntime runtime, String name, EmojiValue value);
	
}
