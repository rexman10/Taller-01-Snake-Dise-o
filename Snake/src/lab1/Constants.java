<<<<<<< HEAD
package lab1;

import java.awt.Dimension;

/** Provides a fixed size for various games. */
public enum Constants {
	;
	// Safe Singleton pattern, prevent instantiation.
	/** An immutable Dimension object of constant size. */
	public static final Dimension SIZE = new Dimension(10, 10);
	
	/** @return an copy of the Dimension constant. */
	public static Dimension getGameSize() {
		// Dimension is a mutable class, copy to prevent mutation.
		return new Dimension(SIZE);
	}
}
=======
package lab1;

import java.awt.Dimension;

/** Provides a fixed size for various games. */
public enum Constants {
	;
	// Safe Singleton pattern, prevent instantiation.
	/** An immutable Dimension object of constant size. */
	public static final Dimension SIZE = new Dimension(10, 10);
	
	/** @return an copy of the Dimension constant. */
	public static Dimension getGameSize() {
		// Dimension is a mutable class, copy to prevent mutation.
		return new Dimension(SIZE);
	}
}
>>>>>>> 976dc9e881a526a5491a9899ef50078d13685f78
