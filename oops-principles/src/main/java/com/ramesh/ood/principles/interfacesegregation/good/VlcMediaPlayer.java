package com.ramesh.ood.principles.interfacesegregation.good;

/**
 * VLC Media player implements both Video Media Player and Audio Media Player.
 *  Perfect, LSP is not violated here.
 * 
 * @author tirthalp
 */
public class VlcMediaPlayer implements VideoMediaPlayer, AudioMediaPlayer {

	@Override
	public void playVideo() {
		System.out.println(" Playing video ..........");
		
	}

	@Override
	public void playAudio() {
		System.out.println(" Playing audio ..........");
		
	}

}