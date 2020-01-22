package flappyOwlProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class GameBoard extends JPanel implements KeyListener {
	
	public static int Width = 1150;
    public static int Height = 710;
    public static boolean dead = false;
    public static String deathNote="";
    public static int score=0;
    int scrollX =0;
    
    
    Owl owl = new Owl(500,70,"Images//owl.png");
	Tree tree1 = new Tree (1200);
	Tree tree2 = new Tree (1200 +450);
    
    
    
    public GameBoard(){
		
		super();
		super.addKeyListener(this);
		super.setFocusable(true);
		
		}
	
    public void paint(Graphics g){
		
        super.paint(g);	
		
        ImageIcon background = new ImageIcon("Images//background.png");
		g.drawImage(background.getImage(), scrollX, 0, null);
		g.drawImage(background.getImage(), scrollX + 1200, 0, null);
		
		
		owl.draw(g);
		
		tree1.draw(g);
		
		tree2.draw(g);

		
		
	    g.setColor(Color.GREEN);
		g.setFont(new Font("comicsans", Font.BOLD, 40));
 		g.drawString("Score : " + score, 900,80);
 	    g.drawString(deathNote, 270, 350);			
 	
 	   
}

	@Override
	public void keyPressed(KeyEvent e) {
       
		if (e.getKeyCode() == KeyEvent.VK_SPACE){
			
			
			owl.jump();
			
			Sounds.OwlJumpSound();
			
		}
		 
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	
	public void gameMove(){
       
		if(dead==false){
	    
			
		tree1.move();
        tree2.move();
		owl.moveOwl();
		
		scrollX += -6;
		
		if(scrollX == -1200){
			
			scrollX = 0;
		}	
			
		if(tree1.getX()==420|| tree1.getX()==421 ||tree1.getX()==422 ||tree1.getX()==423 ||tree1.getX()==424 || tree1.getX()==425 ||tree2.getX()==420|| tree2.getX()==421 ||tree2.getX()==422 ||tree2.getX()==423 ||tree2.getX()==424 || tree2.getX()==425){
			
			Score();
			Sounds.scoreSound();
		}      
	
      
		
	}
		
		
	}

	public static void Score(){
		
		score+=1;
		
		
	}
	
	
		   
		
	
	

}
