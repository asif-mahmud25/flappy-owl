package flappyOwlProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main {

	
	public static void main(String[] args) {
		
		JFrame menuFrame = new JFrame();
		Menu menu = new Menu();
		
		Sounds.gameBSound();
		
		menuFrame.add(menu);
		menuFrame.setSize(GameBoard.Width, GameBoard.Height);
		menuFrame.setLocationRelativeTo(null);
		menuFrame.setVisible(true);
		menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuFrame.setResizable(false);
		
		
		
		
		/*the owl might fall and die while the pc takes too much time to load   
		  images on the first time run, just restart the game it will run  
		  smoothly from the second time  
		 */
		
		
	}

	}


	


