package com.GGI.GamePeice;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class RPlatform extends Platform{

	public RPlatform(Vector2 pos) {
		super(pos);
		face = new Texture(Gdx.files.internal("RpFace")); side = new Texture(Gdx.files.internal("RpSide"));
	}

}
