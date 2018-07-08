package com.game;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_ONE_MINUS_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
public class Window{
	
	private static int width,height;
    
    public Window(){
    	//Creates the window
    	try {
        	DisplayMode display = new DisplayMode(800,600);
            Display.setDisplayMode(display);
            Display.setTitle("Chili LWJGL Framework");
            Display.setResizable(false);
            width = Display.getWidth();
            height = Display.getHeight();
            Display.create();
        } catch (LWJGLException e) {
            e.printStackTrace();
            Display.destroy();
            System.exit(1);
        }
        // Initialization of lwjgl
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();
        glOrtho(0, Display.getWidth(), Display.getHeight(), 0, 1, -1);
        glMatrixMode(GL_MODELVIEW);
        //Creates Lwjgl mouse obj
        try {
			Mouse.create();
			Keyboard.create();
		} catch (LWJGLException e) {
			e.printStackTrace();
		}
        int Mousex = Mouse.getX();
    	int Mousey = Display.getHeight() - Mouse.getY() - 1;
    	MouseHandler m = new MouseHandler(Mousex,Mousey);
    	Textures textures = new Textures();
    	Game game = new Game();
    	
    	
        //The Game loop
        while (!Display.isCloseRequested()) {
        	//Handles resize events
        	if(Display.wasResized()){
        		glViewport(0,0,Display.getWidth(),Display.getHeight());
        	}
        	glEnable(GL_TEXTURE_2D);
            glEnable(GL_BLEND);
            // Render
        	glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
            glLoadIdentity();
            //Gets mouse coordinates
            Mousex = Mouse.getX();
        	Mousey = Display.getHeight() - Mouse.getY() - 1;
        	m.Update(Mousex,Mousey);
        	game.Go();
        	
        	glDisable(GL_TEXTURE_2D);
            glDisable(GL_BLEND);
            Display.update();
            Display.sync(60);
            if (Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)) {
                Display.destroy();
                System.exit(0);
            }
        }
        Display.destroy();
        System.exit(0);
    }
    
    public static void main(String[] args) {
        Window window = new Window();
    }
}
