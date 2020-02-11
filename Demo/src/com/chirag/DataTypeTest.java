package com.chirag;

public class DataTypeTest {
		
	public static void main(String[] args) {
		
//		double d = 0X123.486; // invalid floating point literal only in decimal form 0X is not floating
//		double d = 0123.486;	// valid
//		double d = 0777; 		//valid
//		double d = 0786;		// invalid octal not allowed octal start with 0 and it not contain 8
//		double d = 0786.6; 		//valid because floating value
//		double d = 0X1234;		// valid
//		double d = 0XFACE;		// valid 
		double d = 1.2e54;		// valid Scientific value
		
		System.out.println(d);
		
//		float f  = 0X123.486; // invalid floating point literal only in decimal form 0X is not floating
//		float f  = 0123.486;	// invalid because floating value require f or F literal
//		float f  = 0777; 		//valid consider as octal
//		float f = 0786;		// invalid because floating value require f or F literal
//		float f = 0786.6; 		// invalid because floating value require f or F literal
//		float f = 0X1234;		// valid hexadecimal value
//		float f = 0XFACE;		// valid decimal value
//		float f = 1.2e35f;		// valid scientific value
		float f = 1__23_500.5_5f;		// valid _ in number literal for(int,double,float,long)
		System.out.println(f);
		
		boolean bool = false;	// valid
//		boolean bool = 0; 		// invalid
//		boolean bool = False;	//invalid
	
//		char ch = 'a';	//valid
//		char ch = "a";	//invalid;
//		char ch = 'ab';	//invalid within single quote only one character allowed
//		char ch = 65;	// unicode value allowed (0 - 65535)
//		char ch = '\u0061'; // valid hexadecimal value 0061 --> a (97)
		char ch = '\ubee6';
		System.out.println(ch);
		
		final char c = 127;
		ch = 127;
//		byte b = 127;
		byte ba = (byte)ch;
		byte b = c;
		 
//		int[] a[];
//		int [][]a;
//		int a[][];
//		int[]   a[];
		int  []a[];
		
	}

}
