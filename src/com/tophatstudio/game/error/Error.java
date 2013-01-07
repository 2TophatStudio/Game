package com.tophatstudio.game.error;

import java.util.ArrayList;

public class Error
{
	
	private ArrayList<String> errors = new ArrayList<String>();
	
	public Error()
	{
	}
	
	public void print(String message, int level)
	{
		String prefix = "[NONE]";
		
		if(level == 0)
		{
			prefix = "[FINE]";
		}
		else if(level == 1)
		{
			prefix = "[DEBUG]";
		}
		else if(level == 2)
		{
			prefix = "[INFO]";
		}
		else if(level == 3)
		{
			prefix = "[SEVERE]";
		}
		else if(level == 4)
		{
			prefix = "[DEVASTATING]";
		}
		
		errors.add(prefix + message);
		System.out.println(prefix + message);
	}
	
}