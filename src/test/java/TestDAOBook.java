
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
        new Thread(() -> {
            Book book = new Book("123123123128",
                    "No else i can bibibbim",
                    "Dr Frog", 9, 2020);
            int noInserted = DAOBook.getInstance().insertStatement(book);
            System.out.println("Row inserted: " + noInserted);
        }).start();

        /**
         * Test Insertion using prepared statement
         */
        Book book1 = new Book("098098098092",
                "What in the hell is that",
                "Midjourney",
                9, 2012);
        int noInserted1 = DAOBook.getInstance().insertPreparedStatement(book1);
        System.out.println("Row inserted: " + noInserted1);

        /**
         * Test Deletion using PreparedStatement
         */
        new Thread(() -> {
            int noDeleted = DAOBook.getInstance().delete(new Book("123123123128"));
            System.out.println("Row deleted: " + noDeleted);
        }).start();

        /**
         * Test Selection
         */
        for (Book b : DAOBook.getInstance().selectAll()) {
            System.out.println(b.toString());
        }
    }
}
