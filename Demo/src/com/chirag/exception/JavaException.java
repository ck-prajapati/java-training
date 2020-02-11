package com.chirag.exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class MyException extends Exception {
	int a;

	MyException(int b) {
		a = b;
	}

	public String toString() {
		return ("Exception Number =  " + a);
	}
}
class divZero{
	
	public void divZeroCall() {
//		try {
			int a = 0;
			if(a==0)
				throw new ArithmeticException("Division by Zero");
//		}
//		catch(ArithmeticException ae) {
//			System.out.println("DivZero Block :"  + ae);
//		} 
	}
}
public class JavaException {
	public static void main(String args[]) {
		try {
			int d = 1;
			int n = 20;
			int fraction = n / d;
			int g[] = { 1 };
			g[20] = 100;
		}
//		catch (Exception e) {
//			System.out.println("In the catch block due to Exception = " + e);
//		}
		catch (ArithmeticException e) {
			System.out.println("In the catch block due to Exception = " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("In the catch block due to Exception = " + e);
		} finally {
			System.out.println("Inside the Finally block...");
		}
		
//		User Defined Exception With Throws Keyword
		try {
			throw new MyException(2);
		} catch (MyException e) {
			System.out.println(e);
		}

		
//		IOException With Try Resource
		try(FileWriter file = new FileWriter("D:\\Data1.txt");){
	           file.write("Chirag");
	    }
	    catch(IOException ie){
	    	System.out.println("IOException : " + ie);
	    }
		
		try(FileReader file = new FileReader("D:\\Data.txt");){
	           file.read(); //("Chirag");
	    }
	    catch(IOException ie){
	    	System.out.println("IOException : " + ie);
	    }
		
//		Throws keyword work
		try {
			divZero dz = new divZero();
			dz.divZeroCall();	
		}
		catch(Exception e) {}
		System.out.println("End Of Main");
	}
}
