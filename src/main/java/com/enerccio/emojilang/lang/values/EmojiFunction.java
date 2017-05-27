package com.enerccio.emojilang.lang.values;

import java.io.IOException;
import java.io.OutputStream;

import com.enerccio.emojilang.Utils;
import com.enerccio.emojilang.bytecode.BytecodeContainer;
import com.enerccio.emojilang.runtime.EmojiRuntime;

public class EmojiFunction extends EmojiValue implements EmojiConstant, EmojiCallable {
	
	private int enterBytecodeOffset;
	private int name;
	private int[] argNames;
	
	private transient BytecodeContainer bytecode;
	
	@Override
	public void writeToBytecode(OutputStream buffer) {
		try {
			buffer.write(Utils.convertInt(enterBytecodeOffset));
			buffer.write(Utils.convertInt(name));
			buffer.write(Utils.convertInt(argNames.length));
			for (int arg : argNames)
				buffer.write(Utils.convertInt(arg));
		} catch (IOException e) {
			
		}
	}

	@Override
	public void readFromBytecode(OutputStream buffer) {
		
	}
	
	@Override
	public void call(EmojiRuntime runtime) {
		
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	@Override
	public String writeTag() {
		return getType().tag;
	}

	@Override
	public EmojiValueType getType() {
		return EmojiValueType.FUNCTION;
	}

	public BytecodeContainer getBytecode() {
		return bytecode;
	}

	public void setBytecode(BytecodeContainer bytecode) {
		this.bytecode = bytecode;
	}

	public int[] getArgNames() {
		return argNames;
	}

	public void setArgNames(int[] argNames) {
		this.argNames = argNames;
	}

	public int getEnterBytecodeOffset() {
		return enterBytecodeOffset;
	}

	public void setEnterBytecodeOffset(int enterBytecodeOffset) {
		this.enterBytecodeOffset = enterBytecodeOffset;
	}

}
