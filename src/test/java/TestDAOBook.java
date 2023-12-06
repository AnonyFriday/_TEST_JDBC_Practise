
import dao.DAOBook;
import model.Book;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author duyvu
 */
public class TestDAOBook {

    public static void main(String[] args) {
        Book book = new Book("123123123123",
                "No else i can fly",
                "Dr Frog", 5, 2004);
        int isInserted = DAOBook.getInstance().insert(book);
        System.out.println("Row inserted: " + isInserted);
    }
}
