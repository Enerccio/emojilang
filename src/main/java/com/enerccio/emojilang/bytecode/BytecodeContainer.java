package com.enerccio.emojilang.bytecode;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import com.enerccio.emojilang.Utils;
import com.enerccio.emojilang.lang.values.EmojiConstant;

public class BytecodeContainer {
	
	private static final String header = "😤😤😤";
	
	private String bytecode = "";
	private List<EmojiConstant> values = new ArrayList<EmojiConstant>();
	
	public BytecodeContainer() {
		
	}
	
	public int addConstant(EmojiConstant constant) {
		values.add(constant);
		return values.size()-1;
	}
	
	public EmojiConstant getConstant(int ord) {
		return values.get(ord);
	}
	
	public int currentByteCodePos() {
		return bytecode.length();
	}
	
	public void addBytecode(String bytecode) {
		this.bytecode += bytecode;
	}
	
	public void addBytecodeInt(int i) {
		this.bytecode += String.format("%08d", i);
	}

	public byte[] save() throws IOException {
		ByteArrayOutputStream res = new ByteArrayOutputStream();
		res.write(header.getBytes(StandardCharsets.UTF_8));
		byte[] bytecode = this.bytecode.getBytes(StandardCharsets.UTF_8);
		res.write(Utils.convertInt(bytecode.length));
		res.write(bytecode);
		res.write(Utils.convertInt(values.size()));
		for (EmojiConstant c : values) {
			byte[] tag = c.writeTag().getBytes(StandardCharsets.UTF_8);
			res.write(tag.length);
			res.write(tag);
			c.writeToBytecode(res);
		}
		return res.toByteArray();
	}
}
