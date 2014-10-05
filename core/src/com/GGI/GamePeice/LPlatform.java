package com.GGI.GamePeice;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class LPlatform extends Platform{

	public LPlatform(Vector2 pos) {
		super(pos);
		face = new Texture(Gdx.files.internal("LpFace.png")); side = new Texture(Gdx.files.internal("LpSide.png"));
	}

}
