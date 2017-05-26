package com.enerccio.emojilang.lang.values;

import java.util.HashMap;
import java.util.Map;

import com.enerccio.emojilang.sys.EmojiException;

public abstract class EmojiObjectBase extends EmojiValue {
	
	private Map<String, EmojiValue> bindings = new HashMap<String, EmojiValue>();

	@Override
	public EmojiValue performOperation(String operation, EmojiValue... emojiValues) throws EmojiException {
		throw operationFailure(operation, emojiValues);
	}

	public Map<String, EmojiValue> getBindings() {
		return bindings;
	}

	public void setBindings(Map<String, EmojiValue> bindings) {
		this.bindings = bindings;
	}

}
