package lab4;

public class Books {
private String title, author, publisher;
private int copydate;



public Books (String mtitle,String mauthor, String mpublisher, int mcopydate){
	title = mtitle;
	author = mauthor;
 publisher = mpublisher;
 copydate = mcopydate;
}

public String booktitle()
{
return title;
}

public String bookauthor()
{
return author;
}

public String bookpublisher()
{
return publisher;
}
public int bookcopydate()
{
return copydate;
}

/* DPW: You are missing the setters for the Books EX:
public void setTitle(String title){
    this.title = title;
}
*/





}
