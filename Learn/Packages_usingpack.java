package Learn;

/* Packages:
 * A java package is a group of similar types of classes, interfaces and sub-packages.
 * Package in java can be categorized in two form, built-in package and user-defined package.
 * There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.
 * Here, we will have the detailed learning of creating and using user-defined packages.
 * Remember every class must be in a new package file class, like class Axy and Bxy are in 2 different files
 * Advantage of Java Package
1) Java package is used to categorize the classes and interfaces so that they can be easily maintained.
2) Java package provides access protection.
3) Java package removes naming collision.
 * Creating packages like pack using terminal 
Step 1: Create a package like class Axy using 'package' keyword
Step 2: Save it using Ctrl+S
Step 3: Type [ javac -d . Axy.java ]  for one package at a time, to add all the available packages Type [ javac -d . *.java ]
 */

import pack.Axy;
import pack.Bxy;

public class Packages_usingpack {
	public static void main(String args[])
	{
		Axy obj = new Axy();
		Bxy obj2 = new Bxy();
		obj.show();
		obj2.show();
	}
}
