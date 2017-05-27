package com.enerccio.emojilang.lang.values;

public enum EmojiValueType {

	NIL("😁", "NilType"), 
	LONG("😂", "LongType"), 
	DOUBLE("😃", "DoubleType"), 
	STRING("😄", "StringType"), 
	BOOL("😅", "BoolType"), 
	OBJECT("😆", "ObjectType"), 
	MODULE("😉", "ModuleType"), 
	FUNCTION("😊", "FunctionType")	
	;
	
	public final String tag;
	public final String type;
	
	EmojiValueType(String tag, String type) {
		this.tag = tag;
		this.type = type;
	}
	
}
