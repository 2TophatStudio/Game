package com.tophatstudio.game.world;

import com.tophatstudio.game.world.tiles.Tile;

public abstract class Generator
{
	
	protected Tile[][] generatedMap;
	
	public Generator()
	{
		
	}
	
	public Tile[][] getGeneratedMap()
	{
		return this.generatedMap;
	}
	
	public abstract void generate(int width, int height, int chance);
	
}