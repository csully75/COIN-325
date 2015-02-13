package lab4;
import java.util.Scanner;
public class Book {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int numbook;
		
		
		System.out.println("Enter the interger of how many books you want in the bookshelf"); 
		numbook = scan.nextInt();
		if (numbook == 0){
			System.out.println(Bookshelf.nobooks());
		}
				if (numbook > 0 && numbook <= 5){
					
					System.out.println(Bookshelf.numBooks(numbook));
				}
				

			
			
		
		
	}

	

}
