package com.game;
import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.Texture;


public class LWJGLGraphics {
	public void drawRect(float x, float y, float xx, float yy, Texture texture){
		texture.bind();
		glPushMatrix();
		glBegin(GL_QUADS);
		glTexCoord2f(0,0);
		glVertex2f(xx,yy);
		glTexCoord2f(0,1);
		glVertex2f(xx,y + yy);
		glTexCoord2f(1,1);
		glVertex2f(x + xx,y + yy);
		glTexCoord2f(1,0);
		glVertex2f(x + xx,yy);
		glEnd();
		glPopMatrix();
	}
	public void drawRect(float x, float y, float xx, float yy,float r,float g,float b){
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
	public void drawLine(float x,float y,float xx, float yy, float r, float g, float b){
		glPushMatrix();
		glColor3f(r,g,b);
		glBegin(GL_LINES);
		glVertex2f(x,y);
		glVertex2f(xx,yy);
		glEnd();
		glPopMatrix();
	}
	public void drawLine(float x,float y,float xx, float yy, Texture textures){
		textures.bind();
		glPushMatrix();
		glBegin(GL_LINES);
		glTexCoord2f(0,0);
		glVertex2f(x,y);
		glTexCoord2f(1,1);
		glVertex2f(xx,yy);
		glEnd();
		glPopMatrix();
	}
	public void PutPixel(float x, float y, float r, float g, float b){
		glPushMatrix();
		glColor3f(r,g,b);
		glBegin(GL_POINTS);
		glVertex2f(x,y);
		glEnd();
		glPopMatrix();
	}
}

