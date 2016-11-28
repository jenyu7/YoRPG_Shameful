# YoRPG_Shameful
## By Jennifer Yu, Aryan Bhatt, and Daniel Ju
### Feature Additions
1. Heal power in Mages and Dragonborns
	Mages are now able to heal themselves in the brunt of battle. This is to compensate for their relatively weak health as a result of their stronger attack powers. Dragonborns are also able to heal themselves; this is because they are absolute beasts and very hard to defeat in battle. Healing is just another power that makes a Dragonborn a formidable enemy. The **heal()** function provides the ability for Mages and Dragonborns to heal.
2. Attacking Twice in Dragonborns
	Now, Dragonborns are made more dominant by their ability to attack twice. An augmentation of the original **attack()** method, dragonborns inflict twice the damage that they are "supposed" to. The extensive damage dragonborns deal to monsters make them a good character to play in our RPG. 
3. Critical Chance in Rogue
	Rogues are wild; we all know that. But now they have a special functionality called critical chance, where with each attack of a Rogue, he/she has a chance of dealing an extensive amount of damage to his/her opponent. Again, the **attack()** method of Rogues is augmented in order to accomodate this added ability. 
4. Increased Defense for Gnomes
	Gnomes deal little damage, and have little health. Their selling point before was really "good for moral support", now, however, gnomes are no longer as useless as they once were. With the new method **shrinkify()**, exclusive to gnomes, they are able to become smaller and thus increase their defense substantially. Think of this as a metapod in Pokemon using "harden". In the future, it'll be hard to bully the gnomes. 

###Code Restructurings
1. Editing of Driver File
	The driver file had many errors in it, and before any new specialties could be made for any of the characters, the driver file first had to be fixed. Many of the issues within the driver file had to do with **accidentally creating a local version of an instance**. For example, when determining fighterType, if the fighterType was a certain number, then it would create a new Character that was either a Warrior, Mage, Gnome, etc. However, once actual gameplay started, the driver would **return a NullPointer error**. This error resulted because a new local Character pat was created at the determining of the fighterType, but it didn't replace the Character pat that was declared at the very top of the code. Thus, the Character pat was **never really instantiated**. This problem was fixed, and the rest of the driver was mainly syntatical errors. 
2. about() function in Character class
	Our original about() function was faulty, and returned a mass biography of all the characters in the game. The new about() method determines the object type of the object calling it (using **this**) by using the **getClass()** method built in to Java. Based on the class, the method prints out the biography of the fighter the user has picked right after he/she makes his/her decision. This was a way the about() function was made more specific to the object invoking it. 
3. Abstract functions
	A big issue we had was with abstract classes and functions. There were issues with overwriting certain abstract methods of a superclass, which we fixed promptly. Some of the errors had to do with syntax. 
	
###How to play
1. Open the game
2. The game will ask you for the difficulty, type in the number corresponding to the difficulty, which is displayed: 
	1: Easy
	2: Medium
	3: Difficult
	(Note: The choices won't look like this, and have different phrasings, but these are the translations of what the choices actually mean)
	Hit enter
3. The game will ask you for your name. Type in your name and hit enter. 
4. The game will then ask what fighter type you want to be. Again, type in the number corresponding to the fighter type. Here are their bios: 
	* Warrior: A bulky, tanky type of fighter who has a large amount of armor and health to soak up damage. They don't do much damage, but they are also very hard to kill.
	* Mage: A fragile fighter that is capable of outputting large amounts of damage with their powerful spells, but have very low health and defense, meaning they also die very quickly.
	* Rogue: A crafty fighter that can deal huge amounts of damage in short bursts. They rely on their speed to get in and out of situations without dying.
	* Dragonborn: An absolute beast that can't be stopped by any force, human or otherwise.
	* Gnome: A very weak fighter that doesn't deal much damage and doesn't have much health. They're not really that great at anything, but they're really fun and provide great moral support.
4. You will then begin play. There are a maximum of 5 encounters, the difficulty you chose will correlate to how many times you actually encounter a monster. 
5. Each time you encouter a monster, the game will ask you if you feel lucky or not. Enter your response according to the numbers, which again, link to answers. 
6. Best of luck in your quest, intrepid warrior!