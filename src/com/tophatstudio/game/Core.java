package com.tophatstudio.game;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;

import com.tophatstudio.game.error.Error;
import com.tophatstudio.game.input.Key;
import com.tophatstudio.game.world.World;
import com.tophatstudio.game.world.tiles.CementTile;

public class Core extends BasicGame
{
	
	public static final String TITLE = "Game";
	public static final String VERSION = "Technical Test ~ 0.1";
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final int WORLD_WIDTH = 736;
	public static final int WORLD_HEIGHT = 448;
	public static final int TARGET_FPS = 65;
	public static final int SCALE = 2;
	
	private static Error error;
	private World world;
	
	public Core()
	{
		super(TITLE + ": " + VERSION);
		
		Core.error = new Error();
		world = new World(WORLD_WIDTH, WORLD_HEIGHT, 32, 120);
	}
	
	public static void main(String[] args)
	{
		try
		{
			AppGameContainer gc = new AppGameContainer(new Core());
			gc.setDisplayMode(WIDTH, HEIGHT, false);
			gc.setTargetFrameRate(TARGET_FPS);
			gc.start();
		}
		catch (SlickException e)
		{
			error.print(e.getMessage(), 3);
		}
	}
	
	public void init(GameContainer gc)
	{
		Key.i = gc.getInput();
		
		world.addTile(new CementTile(), 22, 13);
	}
	
	public void render(GameContainer gc, Graphics g)
	{
		g.setBackground(new Color(20, 20, 20));
		
		world.render(gc, g);
	}
	
	public void update(GameContainer gc, int delta)
	{
		world.update(gc, delta);
	}
	
}