package com.enerccio.emojilang.lang.values;

import java.io.OutputStream;

import com.enerccio.emojilang.bytecode.BytecodeContainer;
import com.enerccio.emojilang.runtime.EmojiRuntime;

public class EmojiFunction extends EmojiValue implements EmojiConstant, EmojiCallable {
	
	private int name;
	private int src;
	private int lineNo, charNo;
	private int[] argNames;
	
	private transient BytecodeContainer bytecode;
	
	@Override
	public void writeToBytecode(OutputStream buffer) {
		
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

}
