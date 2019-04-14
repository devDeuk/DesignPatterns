package com.templateEx2;

import com.templateEx2.abst.Game;

public class TemplatePatternDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	
		//args[0] = com.templateEx2.Chess 

		Class c=Class.forName(args[0]);
		Game game1=(Game) c.newInstance();
		game1.play();
		
		System.out.println("==================================");
		
		Game game = new Chess();
		game.play();
		 
		 
		System.out.println("==================================");
		 
		game = new Soccer();
		game.play();
		 
	}
	
}
