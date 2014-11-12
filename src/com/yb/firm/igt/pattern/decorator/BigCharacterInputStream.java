package com.yb.firm.igt.pattern.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BigCharacterInputStream extends FilterInputStream {

	public BigCharacterInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int c = super.read();
		return c == -1 ? -1 : Character.toUpperCase(c);
	}	
	
	

}
