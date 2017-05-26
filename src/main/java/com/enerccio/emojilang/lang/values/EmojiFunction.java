package com.enerccio.emojilang.lang.values;

import java.nio.ByteBuffer;

import com.enerccio.emojilang.bytecode.BytecodeContainer;
import com.enerccio.emojilang.runtime.EmojiRuntime;

public class EmojiFunction extends EmojiValue implements EmojiConstant, EmojiCallable {
	
	private int name;
	private int src;
	private int lineNo, charNo;
	private int[] argNames;
	
	private transient BytecodeContainer bytecode;
	
	@Override
	public void writeToBytecode(ByteBuffer buffer) {
		
	}

	@Override
	public void readFromBytecode(ByteBuffer buffer) {
		
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

	public int getSrc() {
		return src;
	}

	public void setSrc(int src) {
		this.src = src;
	}

	public int getLineNo() {
		return lineNo;
	}

	public void setLineNo(int lineNo) {
		this.lineNo = lineNo;
	}

	public int getCharNo() {
		return charNo;
	}

	public void setCharNo(int charNo) {
		this.charNo = charNo;
	}

	@Override
	public byte writeTag() {
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

}
