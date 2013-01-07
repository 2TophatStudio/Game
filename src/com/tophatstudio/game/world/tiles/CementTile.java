package com.tophatstudio.game.world.tiles;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class CementTile extends Tile
{
	
	public CementTile()
	{
	}
	
	public boolean isSolid()
	{
		return true;
	}
	
	public boolean isLiquid()
	{
		return false;
	}
	
	public boolean isThick()
	{
		return false;
	}
	
	public boolean isHurtful()
	{
		return false;
	}
	
	public void render(GameContainer gc, Graphics g, int x, int y)
	{
		g.setColor(Color.green);
		g.fillRect(x, y, TILE_SIZE, TILE_SIZE);
	}
	
	public void update(GameContainer gc, int delta)
	{
		
	}
	
}