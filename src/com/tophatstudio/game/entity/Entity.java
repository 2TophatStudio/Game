package com.tophatstudio.game.entity;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

import com.tophatstudio.game.util.Direction;

public abstract class Entity
{
	
	private int x, y, health, movingStage;
	private boolean alive, burning, moving;
	private Direction dir;
	
	public Entity(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.alive = true;
		this.burning = false;
		this.movingStage = 0;
		this.dir = Direction.PLAYER_DOWN;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public int getHealth()
	{
		return this.health;
	}
	
	public int getMovingStage()
	{
		return this.movingStage;
	}
	
	public Direction getDirection()
	{
		return this.dir;
	}
	
	public boolean isAlive()
	{
		return this.alive;
	}
	
	public boolean isBurning()
	{
		return this.burning;
	}
	
	public boolean isMoving()
	{
		return this.moving;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setHealth(int health)
	{
		this.health = health;
	}
	
	public void setDirection(Direction dir)
	{
		this.dir = dir;
	}
	
	public void kill()
	{
		this.alive = false;
	}
	
	public void setBurning(boolean burning)
	{
		this.burning = burning;
	}
	
	public void setMoving(boolean moving)
	{
		this.moving = moving;
	}
	
	public void render(GameContainer gc, Graphics g)
	{
	}
	
	public void update(GameContainer gc, int delta)
	{
		if(health <= 0)
		{
			kill();
		}
		if(moving)
		{
			if(movingStage != 32)
			{
				movingStage += 2;
			}
			else
			{
				x += 1;
				movingStage = 0;
				moving = false;
			}
		}
	}
	
	public void move(Direction dir)
	{
		
	}
	
	public void startMove()
	{
		setMoving(true);
		movingStage = 0;
	}
	
}