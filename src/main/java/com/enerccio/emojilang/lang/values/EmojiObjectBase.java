package com.enerccio.emojilang.lang.values;

import java.util.HashMap;
import java.util.Map;

import com.enerccio.emojilang.lang.Builtins;
import com.enerccio.emojilang.runtime.EmojiRuntime;

public abstract class EmojiObjectBase extends EmojiValue implements EmojiInstance {
	
	private Map<String, EmojiValue> bindings = new HashMap<String, EmojiValue>();


	@Override
	public EmojiValue access(EmojiRuntime runtime, String name) {
		if (!bindings.containsKey(name)) {
			runtime.throwException(Builtins.BT_EXC_NAME_ERROR, "Undefined field <" + name + ">");
			return EmojiNil.INSTANCE;
		}
		return bindings.get(name);
	}

	@Override
	public void write(EmojiRuntime runtime, String name, EmojiValue value) {
		bindings.put(name, value);
	}

	protected Map<String, EmojiValue> getBindings() {
		return bindings;
	}
	
}
