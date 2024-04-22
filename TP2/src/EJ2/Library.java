package EJ2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public void addBook (Book book){
        books.add(book);
    }
    public void booksList(){
        for (Book book : books){
            if (!book.isLoaned()){
                System.out.println("Titulo: "+book.getTitle() +" Autor: "+book.getAuthor() + " Año de publicacion: "+book.getYearPublication() );
            }
        }
    }

    public void lend(String name){
        for (Book book : books){
            if (name.equalsIgnoreCase(book.getTitle())){
                book.lend();
            }
        }
    }

    public void returnTo(String name){
        for (Book book : books){
            if (name.equalsIgnoreCase(book.getTitle())){
                book.returnTo();
            }
        }
    }



}
