package advance_java1;

import java.util.ArrayList;

class Book {// create the class is book
    int bookId;
    String bookName;
    String authorName;

    Book(int bookId, String bookName, String authorName) {//method is created
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String toString() {
        return bookId + "  " + bookName + "  " + authorName;
    }
}

public class lab6_1 {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		Book b1=new Book(101, "Java", "James Gosling");//call the object with the constructor 
		Book b2=new Book(102, "Python", "Guido van Rossum");
		Book b3=new Book(103, "C++", "Bjarne Stroustrup");
		
        list.add(b1);// adding to the list
        list.add(b2);
        list.add(b3);

        System.out.println("BookId   BookName   AuthorName");
        for (Book b : list) { // for each loop
            System.out.println(b);//display the list...

	}

}
}
