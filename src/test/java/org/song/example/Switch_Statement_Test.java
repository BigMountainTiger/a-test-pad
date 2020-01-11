package org.song.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Switch_Statement_Test {
	
	private static class Entry {
		public String Weather;
		public boolean Minor;
	}
	
	private String Decide(String entry) {
		
		String result = null;
		
		switch(entry) {
		case "A":
			result = "A";
		case "B":
			result = "B";
		}
		
		return result;
	}
	
	@Test
	public void Test_Break_Is_Needed() {
		
		String result = null;
		
		switch("A") {
		case "A":
			result = "A";
		case "B":
			result = "B";
		}
		
		Assert.assertEquals(result, "B");
		
		result = null;
		int age = 28;
		
		
		switch((age > 18) ? "true":"false") {
		case "true":
			result = "A";
			break;
		case "false":
			result = "B";
			break;
		}
		
		Assert.assertEquals(result, "A");
		
		String[][] entrys = {
				{"Rain", "Strong", "1"},
				{"Rain", "Strong", "0"},
				{"Rain", "Weak"},
				{"Sun", "Strong"},
				{"Sun", "Weak"}
		};
		
		for (int i = 0; i < entrys.length; i++) {
			result = null;
			String[] entry = entrys[i];
			
			switch(entry[0]) {
			// WEATHER
			case "Rain":
				switch(entry[1]) {
				// WIND
				case "Strong":
					switch(entry[2]) {
					case "1":
						result = "Rain Strong";
						break;
					case "0":
						result = "Rain Strong";
						break;
					}
					break;
				case "Weak":
					result = "Rain Weak";
					break;
				}
				break;
			case "Sun":
				switch(entry[1]) {
				// WIND
				case "Strong":
					result = "Sun Strong";
					break;
				case "Weak":
					result = "Sun Weak";
					break;
				}
				break;
			}
			
			Assert.assertEquals(result, entry[0] + " " + entry[1]);
		}
	}
}
