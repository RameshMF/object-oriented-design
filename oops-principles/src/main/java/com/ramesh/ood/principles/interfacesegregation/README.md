*** LSP = Liskov's Substitution Principle
-----------------------------------------------

*** Description = 

	- All the time we design a program module and we create some class hierarchies. Then we extend some classes creating some derived classes. 
	  We must make sure that the new derived classes just extend without replacing the functionality of old classes. Otherwise the new classes can 
	  produce undesired effects when they are used in existing program modules. (http://www.oodesign.com/design-principles.html)
	
	- The Liskov Substitution Principle (LSP) applies to inheritance hierarchies, specifying that you should design your classes so that client 
	  dependencies can be substituted with subclasses without the client knowing about the change.

	- All subclasses must, therefore, operate in the same manner as their base classes. The specific functionality of the subclass may be different 
	  but must conform to the expected behavior of the base class. To be a true behavioral subtype, the subclass must not only implement the base 
	  class’s methods and properties, but also conform to its implied behavior. Basically, derived classes should never do less than their base class.
	  
	- Sometimes code refactoring is required to fix identified LSP violations.

-----------------------------------------------

*** Examples =

(1) Media Player (package = com.tirthal.learning.oop.design.principles.clazz.solid.lsp.mediaplayer)

	Requirement - Let's play video in list of all media players in the client program
	
	------ First let's see "bad" design and implementation (package = com.tirthal.learning.oop.design.principles.clazz.solid.lsp.mediaplayer.bad)
		
		- Refer "MediaPlayer.java" super class and its sub classes "DivMediaPlayer.java", "VlcMediaPlayer.java"
		- Refer "ClientTestProgram.java" code till line-24, before adding "WinampMediaPlayer.java"
		- Now WinampMediaPlayer.java is added, in which LSP is violated
		- Oops, it broke "ClientTestProgram.java" code line-31
	
	------ How to do code-refactoring to make "good" design using LSP? (package = com.tirthal.learning.oop.design.principles.clazz.solid.lsp.mediaplayer.good)
	
		- Refer "MediaPlayer.java" super class and its sub class "AudioMediaPlayer.java" having play audio ability
		- Refer "VideoMediaPlayer.java" extends "MediaPlayer.java" and adds play video ability
		- Refer "DivMediaPlayer.java", "VlcMediaPlayer.java". Both extends "VideoMediaPlayer.java" for play audio and video ability.
		- Refer "WinampMediaPlayer.java" which extends "AudioMediaPlayer.java" for play audio ability.
		- So client program can substitute "VideoMediaPlayer.java" super type with "DivMediaPlayer.java" or "VlcMediaPlayer.java", but not with "WinampMediaPlayer.java"   

 -----------------------------------------------
 
 Feel free to contribute code for more examples in similar fashion... :-)