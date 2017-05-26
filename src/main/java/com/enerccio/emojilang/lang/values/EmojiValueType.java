package com.enerccio.emojilang.lang.values;

public enum EmojiValueType {

	NIL(1, "NilType"), 
	LONG(2, "LongType"), 
	DOUBLE(3, "DoubleType"), 
	STRING(4, "StringType"), 
	BOOL(6, "BoolType"), 
	OBJECT(7, "ObjectType"), 
	MODULE(8, "ModuleType"), 
	FUNCTION(9, "FunctionType")	
	;
	
	public final byte tag;
	public final String type;
	
	EmojiValueType(int tag, String type) {
		this.tag = (byte) tag;
		this.type = type;
	}
	
}
