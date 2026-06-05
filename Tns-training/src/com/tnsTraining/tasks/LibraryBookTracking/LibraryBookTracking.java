package com.tnsTraining.tasks.LibraryBookTracking;
abstract class Book{
	int bookId;
	String bookName;
	String authorName;
	boolean bookIssued;
	
	final String LibarayName="Aishu's Library";
	static int totalBooks=0; 
	
	
	Book(int bookId,String bookName,String authorName,boolean bookIssued){
		this.bookId=bookId;
		this.bookName=bookName;
		this.authorName=authorName;
		this.bookIssued=bookIssued;
		totalBooks++;
	}
	void display() {
		System.out.println("Library name :"+ LibarayName);
		System.out.println("Book name :"+ bookId);
		System.out.println("Book Author name :"+ authorName);
		System.out.println("Book bookIssued :"+ bookIssued);
		System.out.println("Book name :"+ bookId);
	}
	abstract void bookCategory();
	
	static void showTotalBooks() {
		System.out.println("Total number of Books :"+totalBooks);
	}
	
}

class FictionBook extends Book{
	FictionBook(int bookId,String bookName,String authorName,boolean bookIssued){
		super(bookId,bookName,authorName,bookIssued);
	}
	
	@Override
	void bookCategory() {
		System.out.print("Book category belongs to FictionBook");
	}
	
}

class ScienceBook extends Book{
	ScienceBook(int bookId,String bookName,String authorName,boolean bookIssued){
		super(bookId,bookName,authorName,bookIssued);
	}
	
	@Override
	void bookCategory() {
		System.out.print("Book category belongs to ScienceBook");
	}
	
}

class LibraryBookTracking {
	public static void main(String[]args) {
		FictionBook fictional=new FictionBook(1,"aishus world","aishu",true);
		ScienceBook Science= new ScienceBook(2,"spacex","elon musx",false);
		fictional.display();
		fictional.bookCategory();
		Science.display();
		Science.bookCategory();
		
	}
}
