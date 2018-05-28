package com.ramesh.ood.principles.liskovssubstitution.bad;

/**
 *  Now there is a need of launching new Winamp player to play audio, but playing video is not supported at this stage.
 *  
 *  Oops... LSP is violated here! Why? Logically winamp player only supports playing audio. So what's wrong in overriding playVideo method of super class?
 *
 *  Well, see how it broke the client program (ClientTestProgram.java)
 *
 * @author tirthalp
 */
public class WinampMediaPlayer extends MediaPlayer {

	// Play video is not supported in Winamp player
	public void playVideo() {
		throw new VideoUnsupportedException();
	}
}
