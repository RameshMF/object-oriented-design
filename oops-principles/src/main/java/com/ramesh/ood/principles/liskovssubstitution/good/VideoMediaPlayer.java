package com.ramesh.ood.principles.liskovssubstitution.good;

/**
 * This class has ability to play video as well as getting audio ability from super class
 * 
 * @author tirthalp
 */
public class VideoMediaPlayer extends MediaPlayer {

	// Play video implementation
	public void playVideo() {
		System.out.println("Playing video...");
	}
	
}
