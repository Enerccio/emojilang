package com.enerccio.emojilang.bytecode;

import java.util.ArrayList;
import java.util.List;

import com.enerccio.emojilang.lang.values.EmojiConstant;

public class BytecodeContainer {
	
	private CharSequence bytecode = "";
	private List<EmojiConstant> values = new ArrayList<EmojiConstant>();
	
	public BytecodeContainer() {
		
	}
	
	public int addConstant(EmojiConstant constant) {
		values.add(constant);
		return values.size()-1;
	}

}
