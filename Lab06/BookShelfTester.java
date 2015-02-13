package lab4;


import static org.junit.Assert.*;

import org.junit.Test;

public class BookShelfTester {

	@Test
	public void test() {
		assertEquals(Bookshelf.nobooks(),"There are no books in the bookshelf");
	equals((Bookshelf.numBooks(1).equals ("The number of books in the bookshelf is 1 and this book is Cat and the hat, by  Dr. Sucess,  and printed by New York Print, in 1950.")))
	;
	equals((Bookshelf.numBooks(2).equals ("The number of books in the bookshelf is 2 and those books are Cat and the hat, by  Dr. Sucess,  and "
			+ "printed by New York Print, in 1950. The bookPatton, by  Greneral Patton,  and printed by Boston Pation, in 1945.")));
	equals((Bookshelf.numBooks(3).equals ("The number of books in the bookshelf is 3 and those books are Cat and the hat, by  Dr. Sucess,  and printed by New "
			+ "+ York Print, in 1950. The book Patton, by  Greneral Patton,  and printed by Boston Pation, in 1945. The book Harry Potter, by  J.K. Rolling,  and printed by CSU Prints , in 1990."
	)));
	equals((Bookshelf.numBooks(4).equals ("The number of books in the bookshelf is 4 and those books are Cat and the hat, by  Dr. Sucess,  and printed by New York Print, in 1950."
 + "The book Patton, by  Greneral Patton,  and printed by Boston Pation, in 1945."
 + "The book Harry Potter, by  J.K. Rolling,  and printed by CSU Prints , in 1990."
  +"The book Decleration of Indepence, by  Thomas Jefferson,  and printed by Jefferson Prints, in 1776.")));
	
equals((Bookshelf.numBooks(5).equals ("The bookshelf is full and those books are Cat and the hat, by  Dr. Sucess,  and printed by New York Print, in 1950."
	+  "The book Patton, by  Greneral Patton,  and printed by Boston Pation, in 1945."
	 + "The book Harry Potter, by  J.K. Rolling,  and printed by CSU Prints , in 1990."
	 + "The book Decleration of Indepence, by  Thomas Jefferson,  and printed by Jefferson Prints, in 1776."
	 + "The book Common Sence, by  Thomas Pain,  and printed by Painless Prints, in 1779.")))
	 ;

	
	
	}

	
}
