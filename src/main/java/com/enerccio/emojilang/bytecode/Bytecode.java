package com.enerccio.emojilang.bytecode;

public enum Bytecode {

	// from FEARFUL FACE
	NOP("😨", "NOP", 0)
	
	;
	
	public final String emoji;
	public final String hr;
	public final int argc;
	
	Bytecode(String emoji, String humanReadable, int argc) {
		this.emoji = emoji;
		this.hr = humanReadable;
		this.argc = argc;
	}
	
}
