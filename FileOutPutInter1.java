package com.tricky;

import java.io.FileOutputStream;

public class FileOutPutInter1 {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream out = new FileOutputStream("E:\\abc.txt");
		String str = "Hello World";
		String str2 = "Dummy Bawa";
		out.write(str.getBytes());
		
		out.close();
		out.flush();
		
		//Exception in thread "main" java.io.IOException: Stream Closed (Interview Questions) if out.close(); called
		//No Exception is thrown (Interview Questions) if out.flush(); called
		out.write(str2.getBytes());
		
	}

}
