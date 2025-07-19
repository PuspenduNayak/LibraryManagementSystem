import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Pre-populate the library with some sample books for demonstration
        library.addBook(new Book("978-0321765723", "The C++ Programming Language", "Bjarne Stroustrup"));
        library.addBook(new Book("978-0132350884", "Clean Code", "Robert C. Martin"));
        library.addBook(new Book("978-0201633610", "Design Patterns", "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides"));
        library.addBook(new Book("978-0134685991", "Effective Java", "Joshua Bloch"));

        // Main application loop
        while (true) {
            printMenu();
            int choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    library.displayAllBooks();
                    break;
                case 2:
                    addBook(scanner, library);
                    break;
                case 3:
                    borrowBook(scanner, library);
                    break;
                case 4:
                    returnBook(scanner, library);
                    break;
                case 5:
                    System.out.println("\nThank you for using the Library Management System. Goodbye!");
                    scanner.close(); // Close the scanner before exiting
                    return; // Exit the main method, terminating the program
                default:
                    System.out.println("\nInvalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
    private static void printMenu() {
        System.out.println("\n--- Library Management System Menu ---");
        System.out.println("1. Display All Books");
        System.out.println("2. Add a New Book");
        System.out.println("3. Borrow a Book");
        System.out.println("4. Return a Book");
        System.out.println("5. Exit");
        System.out.print("Please enter your choice: ");
    }

    private static int getUserChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next(); // Discard the non-integer input
        }
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the rest of the line
        return choice;
    }

    private static void addBook(Scanner scanner, Library library) {
        System.out.println("\nEnter details for the new book:");
        System.out.print("ISBN: ");
        String isbn = scanner.nextLine();
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        library.addBook(new Book(isbn, title, author));
    }

    private static void borrowBook(Scanner scanner, Library library) {
        System.out.print("\nEnter the ISBN of the book you wish to borrow: ");
        String isbn = scanner.nextLine();
        library.borrowBook(isbn);
    }

    private static void returnBook(Scanner scanner, Library library) {
        System.out.print("\nEnter the ISBN of the book you are returning: ");
        String isbn = scanner.nextLine();
        library.returnBook(isbn);
    }

}