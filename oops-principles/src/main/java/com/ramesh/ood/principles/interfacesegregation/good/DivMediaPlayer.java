package com.ramesh.ood.principles.interfacesegregation.good;

/**
 * Div Media player implements both VideoMediaPlayer,AudioMediaPlayer.
 */
public class DivMediaPlayer implements VideoMediaPlayer, AudioMediaPlayer {

	@Override
	public void playVideo() {
		System.out.println(" Playing video ..........");

	}

	@Override
	public void playAudio() {
		System.out.println(" Playing audio ..........");

	}
}
