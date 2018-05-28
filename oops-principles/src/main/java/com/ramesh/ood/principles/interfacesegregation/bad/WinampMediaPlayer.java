package com.ramesh.ood.principles.interfacesegregation.bad;

/**
 *  Now there is a need of launching new Winamp player to play audio,
 *   but playing video is not supported at this stage.
 *  
 *  Here , clients should not be forced to depend upon interface members they do not use.
 *  In this case , playVideo() method is not required
 *
 */
public class WinampMediaPlayer implements MediaPlayer {

	// Play video is not supported in Winamp player
	public void playVideo() {
		throw new VideoUnsupportedException();
	}

	@Override
	public void playAudio() {
		System.out.println("Playing audio ..............");
		
	}
}
