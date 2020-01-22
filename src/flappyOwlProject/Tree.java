package flappyOwlProject;

import java.util.*;
import javax.swing.*;
import java.awt.*;


public class Tree {

	Random rn = new Random();
	
	private int X;
	private int Y=  rn.nextInt(290)+350;     
	private int speed = -6;
	private int wid = 118;
	private int height = 500;
    private int gap = 250;
	
	
	   
	public Random getRn() {
		return rn;
	}



	public void setRn(Random rn) {
		this.rn = rn;
	}



	public int getX() {
		return X;
	}



	public void setX(int x) {
		X = x;
	}



	public int getY() {
		return Y;
	}



	public void setY(int y) {
		Y = y;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public int getWid() {
		return wid;
	}



	public void setWid(int wid) {
		this.wid = wid;
	}



	public int getHeight() {
		return height;
	}



	public void setHeight(int height) {
		this.height = height;
	}




	public Tree (int i){
		
		this.X=i;
		
	}
	
	
	
	public void draw(Graphics g){
		
		ImageIcon tree = new ImageIcon ("Images//Treefo.png");
		
		g.drawImage(tree.getImage(), X, Y, null); //bottom tree
		
		g.drawImage(tree.getImage(), X,(Y-gap)-height , null); //top tree
		
	}
	
	public void move (){
		
		X+=speed;
		

    	Rectangle treeBounds1 = new Rectangle(X, Y,wid,height);
		Rectangle treeBounds2 = new Rectangle(X, (Y-gap)-height, wid, height);
		
		
		if ( treeBounds1.intersects(Owl.getBounds()) || treeBounds2.intersects(Owl.getBounds())){
		
			Sounds.OwlHitSound();
			Owl.deadOwl();
			
		  }
		
       		
		
		if (X <= 0 - wid){
			X = GameBoard.Width;
			Y = rn.nextInt(290) + 350;
			height = 500;
		}		
	
	}
	

	
}
