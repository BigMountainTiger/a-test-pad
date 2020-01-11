package org.song.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class myCode {
	public static void main (String[] args) throws java.lang.Exception
	  {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String input = br.readLine();
	    
	    int loopCount = Integer.parseInt(input);
	    for (int i = 0; i < loopCount; i++) {
	      System.out.println("Hello");
	    }
	    
	    //System.out.println(input);
	  }
}
