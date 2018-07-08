package com.game;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

public class LoadTexture {
	
	//The extension Variable needs to be lower case
	public static Texture loadTexture(String key, String extension){
		try {
			return	TextureLoader.getTexture(extension, new FileInputStream(new File("res/" + key + "." + extension)));
		} catch (IOException e) {
			Logger.getLogger(Window.class.getName()).log(Level.SEVERE,null,e);
		}
		return null;
	}
}
