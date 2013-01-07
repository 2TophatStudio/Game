package com.tophatstudio.game.world;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import com.tophatstudio.game.entity.EntityPlayer;
import com.tophatstudio.game.world.tiles.Tile;

public class World
{
	
	private int width, height;
	public static int xOffset, yOffset;
	private Tile[][] tiles;
	private EntityPlayer player;
	
	public World(int width, int height, int xOffset, int yOffset)
	{
		this.width = width;
		this.height = height;
		World.xOffset = xOffset;
		World.yOffset = yOffset;
		//this.tiles = new Tile[width / Tile.TILE_SIZE][height / Tile.TILE_SIZE];
		TestGenerator testGen = new TestGenerator();
		testGen.generate(width / Tile.TILE_SIZE, height / Tile.TILE_SIZE, 9);
		this.tiles = testGen.generatedMap;
		this.player = new EntityPlayer(1, 1);
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public int getHeight()
	{
		return this.height;
	}
	
	public int getXOffset()
	{
		return World.xOffset;
	}
	
	public int getYOffset()
	{
		return World.yOffset;
	}
	
	public Tile[][] getTiles()
	{
		return this.tiles;
	}
	
	public void addTile(Tile tile, int x, int y)
	{
		this.tiles[x][y] = tile;
	}
	
	public void removeTile(int x, int y)
	{
		this.tiles[x][y] = null;
	}
	
	public void clearTileArea(int x, int y, int width, int height)
	{
		for(int i = x; i < width; i++)
		{
			for(int j = y; j < height; j++)
			{
				this.tiles[i][j] = null;
			}
		}
	}
	
	public void render(GameContainer gc, Graphics g)
	{
		g.setColor(Color.white);
		g.fillRect(xOffset, yOffset, width, height);
		
		for(int i = 0; i < width / Tile.TILE_SIZE; i++)
		{
			for(int j = 0; j < height / Tile.TILE_SIZE; j++)
			{
				if(tiles[i][j] == null) continue;
				
				tiles[i][j].render(gc, g, i * Tile.TILE_SIZE + xOffset, j * Tile.TILE_SIZE + yOffset);
			}
		}
		
		player.render(gc, g);
	}
	
	public void update(GameContainer gc, int delta)
	{
		for(int i = 0; i < width / Tile.TILE_SIZE; i++)
		{
			for(int j = 0; j < height / Tile.TILE_SIZE; j++)
			{
				if(tiles[i][j] == null) continue;
				
				tiles[i][j].update(gc, delta);
			}
		}
		
		player.update(gc, delta);
	}
	
}