package com.game;

// I made this class because the lwjgl mouse coordinates are not accurate.
public class MouseHandler{

	public static int Mousex, Mousey;
	
	public MouseHandler(int Mousex, int Mousey){
		this.Mousex = Mousex;
		this.Mousey = Mousey;
	}
	
	public void Update(int Mousex, int Mousey)
	{
		this.Mousex = Mousex;
		this.Mousey = Mousey;
	}

	public static int getMousex() {
		return Mousex;
	}

	public static void setMousex(int mousex) {
		Mousex = mousex;
	}

	public static int getMousey() {
		return Mousey;
	}

	public static void setMousey(int mousey) {
		Mousey = mousey;
	}
}
