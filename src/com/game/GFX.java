package com.game;
import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.Texture;


public class GFX {
	public static void drawRect(float width, float height, float posx, float posy, Texture texture){
		texture.bind();
		glPushMatrix();
		glBegin(GL_QUADS);
		glTexCoord2f(0,0);
		glVertex2f(posx,posy);
		glTexCoord2f(0,1);
		glVertex2f(posx,height + posy);
		glTexCoord2f(1,1);
		glVertex2f(width + posx, height + posy);
		glTexCoord2f(1,0);
		glVertex2f(width + posx,posy);
		glEnd();
		glPopMatrix();
	}
	public static void drawSolidRect(float x, float y, float xx, float yy,float r,float g,float b){
		glPushMatrix();
		glColor3f(r,g,b);
		glBegin(GL_QUADS);
		glVertex2f(xx,yy);
		glVertex2f(xx,y + yy);
		glVertex2f(x + xx,y + yy);
		glVertex2f(x + xx,yy);
		glEnd();
		glPopMatrix();
	}
	
	public static void drawRect(float x, float y, float xx, float yy,float r,float g,float b){
		glPushMatrix();
		glColor3f(r,g,b);
		glBegin(GL_LINES);
		glVertex2f(xx,yy);
		glVertex2f(xx,yy + y);
		glEnd();
		glPopMatrix();
		
		glPushMatrix();
		glColor3f(r,g,b);
		glBegin(GL_LINES);
		glVertex2f(xx,yy);
		glVertex2f(xx + x,yy);
		glEnd();
		glPopMatrix();
		
		glPushMatrix();
		glColor3f(r,g,b);
		glBegin(GL_LINES);
		glVertex2f(xx + x,yy);
		glVertex2f(xx + x,yy + y);
		glEnd();
		glPopMatrix();
		
		glPushMatrix();
		glColor3f(r,g,b);
		glBegin(GL_LINES);
		glVertex2f(xx,yy + y);
		glVertex2f(xx + x,yy + y);
		glEnd();
		glPopMatrix();
	}
	public static void drawLine(float x,float y,float xx, float yy, float r, float g, float b){
		glPushMatrix();
		glColor3f(r,g,b);
		glBegin(GL_LINES);
		glVertex2f(x,y);
		glVertex2f(xx,yy);
		glEnd();
		glPopMatrix();
	}
	public static void PutPixel(float x, float y, float r, float g, float b){
		glPushMatrix();
		glColor3f(r,g,b);
		glBegin(GL_POINTS);
		glVertex2f(x,y);
		glEnd();
		glPopMatrix();
	}
}

