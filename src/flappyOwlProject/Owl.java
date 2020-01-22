package flappyOwlProject;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Owl {

	
	private static int diameter = 80;
	private static int X ; 
	private static int Y ;
	private String Ip;
	private static  int speed = 1;
	private static  int acceleration = 1;
	
	
	public Owl(){}
	
	
	
	 public Owl(int x, int y, String ip) {
		
		
		X = x;
		Y = y;
		Ip = ip;
	}



	public int getDiameter() {
		return diameter;
	}



	public void setDiameter(int diameter) {
		this.diameter = diameter;
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



	public String getIp() {
		return Ip;
	}



	public void setIp(String ip) {
		Ip = ip;
	}



	public int getSpeed() {
		return speed;
	}



	public void setSpeed(int speed) {
		this.speed = speed;
	}



	public int getAcceleration() {
		return acceleration;
	}



	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}

	public void jump(){
		speed = -15;			
	}
		
		public void moveOwl(){
			
			if((Y>-30 ) && (Y<730)){
				speed+=acceleration;
				Y+=speed;
				}
			else{
				deadOwl();
				
				Sounds.OwlFellSound();
				
			}
			
		}
		
	public static void deadOwl(){
		
		GameBoard.dead=true;
		
		
			Timer animationDeath = new Timer(30, new ActionListener(){		
			  public void actionPerformed(ActionEvent event){
				
				     X+=-2;
				     speed+=acceleration;
						Y+=speed;
						
			
				  		
			 }});
		
			animationDeath.start();
			

		GameBoard.deathNote ="You Died!  Restart To Try Again";

		
			}
	

	public void draw (Graphics g){
			
			ImageIcon owl = new ImageIcon(Ip);
			g.drawImage(owl.getImage(), X, Y, null);
			
			
	}

	public static Rectangle getBounds(){
		
		return new Rectangle(X,Y,diameter,diameter);
	}
	
}
