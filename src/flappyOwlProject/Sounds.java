package flappyOwlProject;


import java.io.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.*;

public class Sounds {
	
public static void OwlJumpSound(){
		
		try{
			
			File sound = new File("Sounds//owlJump.wav");
			AudioInputStream ais =AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
		}
		catch(Exception e){
			
			
		}
		
		
	}

public static void OwlHitSound(){
	
	try{
		
		File sound = new File("Sounds//owlHit.wav");
		AudioInputStream ais =AudioSystem.getAudioInputStream(sound);
		Clip clip = AudioSystem.getClip();
		clip.open(ais);
		clip.start();
	}
	catch(Exception e){
		
		
	}
	
	
}

public static void OwlFellSound(){
	
	try{
		
		File sound = new File("Sounds//owlFell.wav");
		AudioInputStream ais =AudioSystem.getAudioInputStream(sound);
		Clip clip = AudioSystem.getClip();
		clip.open(ais);
		clip.start();
	}
	catch(Exception e){
		
		
	}
	
	
}


public static void scoreSound(){
	
	try{
		
		File sound = new File("Sounds//score.wav");
		AudioInputStream ais =AudioSystem.getAudioInputStream(sound);
		Clip clip = AudioSystem.getClip();
		clip.open(ais);
		clip.start();
	}
	catch(Exception e){
		
		
	}
	
	
}





public static void gameBSound(){
	
	try{		
		File sound = new File("Sounds//gameBs.wav");
		AudioInputStream ais =AudioSystem.getAudioInputStream(sound);
		Clip clip = AudioSystem.getClip();
		clip.open(ais);
		clip.start();
		
		clip.loop(Clip.LOOP_CONTINUOUSLY);
		
		}
	catch(Exception e){
		
		
	}

    }

}
