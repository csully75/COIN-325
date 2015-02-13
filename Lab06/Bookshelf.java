package lab4;

public class Bookshelf {

		static Books book1 = new Books("Cat and the hat","Dr. Sucess","New York Print",1950);
		static Books book2 = new Books("Patton","Greneral Patton", "Boston Pation", 1945);
		static Books book3 = new Books("Harry Potter","J.K. Rolling", "CSU Prints ", 1990);
		static Books book4 = new Books("Decleration of Indepence","Thomas Jefferson", "Jefferson Prints", 1776);
		static Books book5 = new Books("Common Sence","Thomas Pain", "Painless Prints", 1779);
		
	

	public static String nobooks(){
		String nothing = "There are no books in the bookshelf";
		return nothing;
		
	}
	
		
	
	public static String numBooks(int num1){
		String str = null;
		if (num1 <= 5){
			
	switch (num1)
	{
	case 1:
		str = ("The number of books in the bookshelf is "+ num1 +" and this book is "
	+ book1.booktitle() + ", by  " + book1.bookauthor() + ",  and printed by "   + book1.bookpublisher()+ ", in " + book1.bookcopydate()+ ".");
		break;
	case 2:
		str = ("The number of books in the bookshelf is "+ num1 +" and those books are "
				+ book1.booktitle() + ", by  " + book1.bookauthor() + ",  and printed by "   + book1.bookpublisher()+ ", in " + book1.bookcopydate()+
				"." + "\n" + " The book" + book2.booktitle() + ", by  " + book2.bookauthor() + ",  and printed by "   + book2.bookpublisher()+ ", in " + 
				book2.bookcopydate() + ".");
		break;
	case 3:
		str = ("The number of books in the bookshelf is "+ num1 +" and those books are "
				+ book1.booktitle() + ", by  " + book1.bookauthor() + ",  and printed by "   + book1.bookpublisher()+ ", in " + book1.bookcopydate()+ 
				"." + "\n" + "  The book " + book2.booktitle() + ", by  " + book2.bookauthor() + ",  and printed by "   + book2.bookpublisher()+ ", in " + book2.bookcopydate() + 
				 "." + "\n" + "  The book " + book3.booktitle() + ", by  " + book3.bookauthor() + ",  and printed by "   + book3.bookpublisher()+ ", in " + book3.bookcopydate() + 
				 ".");
					break;
	case 4:
	str = ("The number of books in the bookshelf is "+ num1 +" and those books are "
						+ book1.booktitle() + ", by  " + book1.bookauthor() + ",  and printed by "   + book1.bookpublisher()+ ", in " + book1.bookcopydate()+ 
						"." + "\n" + "  The book " + book2.booktitle() + ", by  " + book2.bookauthor() + ",  and printed by "   + book2.bookpublisher()+ ", in " + book2.bookcopydate() + 
						 "." + "\n" + "  The book " + book3.booktitle() + ", by  " + book3.bookauthor() + ",  and printed by "   + book3.bookpublisher()+ ", in " + book3.bookcopydate() + 
						 "."+ "\n" + "  The book " + book4.booktitle() + ", by  " + book4.bookauthor() + ",  and printed by "   + book4.bookpublisher()+ ", in " + book4.bookcopydate() +"." );
	break;
	case 5:
		str = ("The bookshelf is full and those books are "
				+ book1.booktitle() + ", by  " + book1.bookauthor() + ",  and printed by "   + book1.bookpublisher()+ ", in " + book1.bookcopydate()+ 
				"." + "\n" + "  The book "+ book2.booktitle() + ", by  " + book2.bookauthor() + ",  and printed by "   + book2.bookpublisher()+ ", in " + book2.bookcopydate() + 
				 "." + "\n" + "  The book " + book3.booktitle() + ", by  " + book3.bookauthor() + ",  and printed by "   + book3.bookpublisher()+ ", in " + book3.bookcopydate() + 
				 "."+ "\n" + "  The book " + book4.booktitle() + ", by  " + book4.bookauthor() + ",  and printed by "   + book4.bookpublisher()+ ", in " + book4.bookcopydate() + "." +
			"\n" + "  The book " + book5.booktitle() + ", by  " + book5.bookauthor() + ",  and printed by "   + book5.bookpublisher()+ ", in " + book5.bookcopydate()+ "." );
	break;
	}
		
		}
		return str;
	}
}
			

	
	
	
	

