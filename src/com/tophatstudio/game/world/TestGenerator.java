package com.tophatstudio.game.world;

import com.tophatstudio.game.world.tiles.CementTile;
import com.tophatstudio.game.world.tiles.Tile;

public class TestGenerator extends Generator
{
	
	public TestGenerator()
	{
		
	}
	
	public void generate(int width, int height, int chance)
	{
		generatedMap = new Tile[width][height];
		
		for(int i = 0; i < width; i++)
		{
			for(int j = 0; j < height; j++)
			{
				if(Math.random() * 100 < chance)
				{
					generatedMap[i][j] = new CementTile();
				}
			}
		}
	}
	
}