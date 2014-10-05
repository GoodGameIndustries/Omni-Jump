package com.GGI.GamePeice;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class DPlatform extends Platform{

	public DPlatform(Vector2 pos) {
		super(pos);
		face = new Texture(Gdx.files.internal("DpFace.png")); side = new Texture(Gdx.files.internal("DpSide.png"));
	}

}
