package com.ramesh.ood.principles.interfacesegregation.bad;

/**
 * Div Media player implements Media player. Perfect, 
 * LSP is not violated here.
 *  
 * @author tirthalp
 */
public class DivMediaPlayer implements MediaPlayer {

	@Override
	public void playAudio() {
		System.out.println(" Playing audio ..........");
		
	}

	@Override
	public void playVideo() {
		System.out.println(" Playing video ..........");
		
	}

}
