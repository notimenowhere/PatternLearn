package com.yb.firm.igt.pattern.decorator;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringBufferInputStream;

@SuppressWarnings("deprecation")
public class Test {

	public static void main(String[] args) throws IOException {
		
		Beverage beverage = new Decaf();
		Beverage bb = new Mocha( new Milk( new Whip (beverage)));
		System.out.println( bb.cost() );
		System.out.println( bb.getDecription());
		
		// java IO
		@SuppressWarnings("resource")
		InputStream in = new BigCharacterInputStream(new StringBufferInputStream("i like you"));
		int c;
		while( (c = in.read()) > 0 )
		{
			System.out.print((char)c);
		}
		
	}

}
