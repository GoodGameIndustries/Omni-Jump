/**
 * 
 */
package com.GGI.GamePeice;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

/**
 * @author Emmett Deen
 *
 */
public class Ball {

	public Vector2 pos, vel,acc;
	public Texture pic = new Texture(Gdx.files.internal("Ball.png"));
	
	public Ball(Vector2 pos){
		this.pos=pos;
		vel.x=0;vel.y=0;
		acc.x=0;acc.y=0;
	}
	
	public void update(float delta,Vector2 gravity){
		pos.x=pos.x+(vel.x*delta);
		pos.y=pos.y+(vel.y*delta);
		vel.x=vel.x+(acc.x*delta);
		vel.y=vel.y+(acc.y*delta);
		acc.x=acc.x+(gravity.x*delta);
		acc.y=acc.y+(gravity.y*delta);
	}
	
}
