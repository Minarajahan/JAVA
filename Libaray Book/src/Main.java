public class Main {
    public static void main(String[] args) {
        class Book {
            private String title;
            private String author;
            private boolean borrowed;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                if (title != null && !title.trim().isEmpty()) {
                    this.title = title;
                } else {
                    System.out.println("Title cannot be empty");
                }
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                if (author != null && !author.trim().isEmpty()) {
                    this.author = author;
                } else {
                    System.out.println("Author cannot be empty.");
                }
            }

            public void borrow() {
                if (!borrowed) {
                    borrowed = true;
                    System.out.println("You have borrowed the book: " + title);
                } else {
                    System.out.println("This book is already borrowed");
                }
            }

            public void returnBook() {
                if (borrowed) {
                    borrowed = false;
                    System.out.println("You have returned the book: " + title);
                } else {
                    System.out.println("This book was not borrowed");
                }
            }
        }

        // Testing the Book class
        Book book = new Book();
        book.setTitle("Programming");
        book.setAuthor("John Doe");
        book.borrow();
        book.borrow();
        book.returnBook();   
    }
}
