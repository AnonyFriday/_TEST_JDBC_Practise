
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

        /**
         * Test Insertion
         */
        Book book = new Book("123123123129",
                "No else i can bibibbim",
                "Dr Frog", 9, 2020);
        int isInserted = DAOBook.getInstance().insert(book);
        System.out.println("Row inserted: " + isInserted);

        /**
         * Test Selection
         */
        for (Book b : DAOBook.getInstance().selectAll()) {
            System.out.println(b.toString());
        }
    }
}
