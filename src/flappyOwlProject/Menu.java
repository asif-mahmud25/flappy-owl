package flappyOwlProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Menu extends JPanel implements KeyListener,Runnable {

	
    static JFrame gameFrame = new JFrame();
	static GameBoard gbfo = new GameBoard();
   
	
	 public  Menu (){
		
		
		super.setFocusable(true);
		super.addKeyListener(this);
		
		
		
		}
			
			
	public void paint(Graphics g){
		
		super.paint(g);
		
		
		ImageIcon menuImage = new ImageIcon("Images//menu.png");
		g.drawImage(menuImage.getImage(), 0, 0, null);
		
		
		
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
      
		if(e.getKeyCode()== KeyEvent.VK_ENTER){
	
			
		
			
			gameFrame.setTitle("FLAPPY OWL");
			gameFrame.setSize(GameBoard.Width , GameBoard.Height);
			gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			gameFrame.setLocationRelativeTo(null);
			gameFrame.setVisible(true);
			gameFrame.setResizable(false);
				
	
			gameFrame.add(gbfo);
	
			(new Thread(new Menu())).start();
			
	
		}
		
		
	}



	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void run() {
		
		while(true){
			try{
				
				Thread.sleep(30);
			}
			catch(Exception e){}
			
			
		    gbfo.repaint();
		    gbfo.gameMove(); 

			}

		
	}


}
	
	

