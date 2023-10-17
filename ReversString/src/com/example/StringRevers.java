package com.example;

import java.util.Scanner;

public class StringRevers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string..");
		String s=sc.next();
		String ns="";
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			ns=ch[i]+ns;
		}
		System.out.println(ns);
	}
}
