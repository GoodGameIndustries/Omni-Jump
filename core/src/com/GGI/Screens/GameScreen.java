/**
 * 
 */
package com.GGI.Screens;

import com.GGI.Omni.Omni;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

/**
 * @author Emmett Deen
 *
 */
public class GameScreen implements Screen{
	
	private Omni om;
	private int dir = 0; //0=down,1=up,2=left,3=right
	
	public GameScreen(Omni om){
		this.om=om;
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(.8f, .8f, .8f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		if(dir==0){checkDown(delta);}
		if(dir==1){checkUp(delta);}
		if(dir==2){checkLeft(delta);}
		if(dir==3){checkRight(delta);}
		
		
	}

	private void checkRight(float delta) {
		// TODO Auto-generated method stub
		
	}

	private void checkLeft(float delta) {
		// TODO Auto-generated method stub
		
	}

	private void checkUp(float delta) {
		// TODO Auto-generated method stub
		
	}

	private void checkDown(float delta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
