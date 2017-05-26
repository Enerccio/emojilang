package com.enerccio.emojilang.lang.values;

import com.enerccio.emojilang.lang.Builtins;
import com.enerccio.emojilang.runtime.EmojiRuntime;

public abstract class EmojiConstBase extends EmojiObjectBase {

	@Override
	public void write(EmojiRuntime runtime, String name, EmojiValue value) {
		runtime.throwException(Builtins.BT_EXC_RO_ERROR, "Read only type <" + getType().type + ">");
	}
}
