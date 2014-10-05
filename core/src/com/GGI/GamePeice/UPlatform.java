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
public class UPlatform extends Platform{

	public UPlatform(Vector2 pos) {
		super(pos);
		face = new Texture(Gdx.files.internal("UpFace.png")); side = new Texture(Gdx.files.internal("UpSide.png"));
	}

}
