package com.game;

import org.lwjgl.opengl.Display;

public class Game {

	private int x = 255, y = 255;
	
	public Game(){
		
	}
	
	public void Go(){
		ComposeFrame();
	}
	
	public void ComposeFrame(){
		// Example code
		// Color values are between 0 and 1 instead of 0 and 255
		
		GFX.PutPixel(25, 25, 0.5f, 0.5f, 0);
		
		GFX.drawSolidRect(15, 110, 500, 300, 1, 0, 1);
		
		GFX.drawRect(12, 23, 150, 100, 1, 1, 1);
		
		GFX.drawLine(0, 0, Display.getWidth(), Display.getHeight(), 1, 0, 0);
		
	}
}
