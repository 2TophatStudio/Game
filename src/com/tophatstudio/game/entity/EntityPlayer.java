package com.tophatstudio.game.entity;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import com.tophatstudio.game.input.InputManager;
import com.tophatstudio.game.world.World;
import com.tophatstudio.game.world.tiles.Tile;

public class EntityPlayer extends Entity
{

	public EntityPlayer(int x, int y)
	{
		super(x, y);
	}
	
	public void render(GameContainer gc, Graphics g)
	{
		g.setColor(Color.orange);
		g.fillRect(getX() * Tile.TILE_SIZE + World.xOffset + getMovingStage(), getY() * Tile.TILE_SIZE + World.yOffset, Tile.TILE_SIZE, Tile.TILE_SIZE);
	}
	
	public void update(GameContainer gc, int delta)
	{
		super.update(gc, delta);
		
		if(InputManager.PLAYER_UP.isPressed() && !isMoving())
		{
			setY(getY() - 1);
		}
		if(InputManager.PLAYER_DOWN.isPressed() && !isMoving())
		{
			setY(getY() + 1);
		}
		if(InputManager.PLAYER_LEFT.isPressed() && !isMoving())
		{
			setX(getX() - 1);
		}
		if(InputManager.PLAYER_RIGHT.isHeld() && !isMoving())
		{
			// TODO: FIX MOVING
		}
	}
	
}