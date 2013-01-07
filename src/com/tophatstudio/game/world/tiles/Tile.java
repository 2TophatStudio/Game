package com.tophatstudio.game.world.tiles;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import com.tophatstudio.game.Core;

public abstract class Tile
{
	
	public static final int TILE_SIZE = 16 * Core.SCALE;
	
	public Tile()
	{
	}
	
	public abstract boolean isSolid();
	
	public abstract boolean isLiquid();
	
	public abstract boolean isThick();
	
	public abstract boolean isHurtful();
	
	public abstract void render(GameContainer gc, Graphics g, int x, int y);
	
	public abstract void update(GameContainer gc, int delta);
	
}