package com.game;

import static com.game.LoadTexture.loadTexture;

import org.newdawn.slick.opengl.Texture;

public class Textures {
	//This is an example on how to use the textures class
	public static Texture logo;
	
	public Textures(){		
		logo = loadTexture("sitelogo_small","png");
	}
}
