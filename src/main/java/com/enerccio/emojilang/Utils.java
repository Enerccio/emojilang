package com.enerccio.emojilang;

import java.nio.ByteBuffer;

public class Utils {

	private static ByteBuffer convertIntBuffer = ByteBuffer.allocate(4); 
	public static synchronized byte[] convertInt(int i) {
		convertIntBuffer.position(0);
		convertIntBuffer.putInt(i);
		return convertIntBuffer.array();
	}
	
}
