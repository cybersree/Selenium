package com.d2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Setup {
	public static void main(String args[]) throws IOException
	{
		System.out.println("Welcome Back");
		try {
		File f = new File("C:/Examples/filewrite.txt");
		FileWriter fw = new FileWriter(f);
		PrintWriter pw = new PrintWriter(fw);
		pw.println("Javaiscurious");
		pw.println("JavaisInteresting");
		pw.flush();
		pw.close();
		
		
		File f1 = new File("C:/Examples/filewrite.txt");
		FileReader fr= new FileReader(f1);
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str=br.readLine())!=null )
		System.out.println(str);
		br.close();
		
		}catch (Exception e )
		{
			System.out.println(e);
		}
		
		
	}

}
