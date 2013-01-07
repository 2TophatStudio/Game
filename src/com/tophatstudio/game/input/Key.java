package com.tophatstudio.game.input;

import org.newdawn.slick.Input;

public class Key
{
	
	private int[] keyCodes;
	public static Input i = null;
	
	public Key(int ... keyCodes)
	{
		this.keyCodes = keyCodes;
	}
	
	public boolean isPressed()
	{
		for(int k: keyCodes)
		{
			if(i.isKeyPressed(k)) return true;
		}
		
		return false;
	}
	
	public boolean isHeld()
	{
		for(int k: keyCodes)
		{
			if(i.isKeyDown(k)) return true;
		}
		
		return false;
	}
	
}