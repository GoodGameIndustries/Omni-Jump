/**
 * 
 */
package com.GGI.GamePeice;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * @author Emmett Deen
 *
 */
public class Platform {
	
	
	protected Texture face = new Texture(Gdx.files.internal("pFace")), side = new Texture(Gdx.files.internal("pSide"));
	protected Vector2 pos;
	protected Rectangle bounds;
	
	
	public Platform(Vector2 pos){
		pos=pos;
		bounds.x=.2f;
		bounds.y=.02f;
	}
	
	public Texture getFace(){
		return face;
	}
	
	public Texture getSide(){
		return side;
	}
	
	public Vector2 getPos(){
		return pos;
	}
	
	public Rectangle getBounds(){
		return bounds;
	}
	
}
