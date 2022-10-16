public class Main {
    public static void main(String[] args) {

        int number = 3;

        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Voyna i Mir", author1,1800);

        Author author2 = new Author("Aлександр" , "Пушкин");
        Book book2 = new Book("Парус", author2,1789);

        Book book3 = new Book("Anna Karenina", author1, 1810);

        System.out.println(book1.getYear());
        book1.setYear(1865);
        System.out.println(book1.getYear());
        System.out.println("Год написания: " + book3.getYear());
    }
}