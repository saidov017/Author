package Author;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Александр Костылев", "Dolk@gmail.com", 'м');
        System.out.println(author);

        author.setEmail("newSasha@gmail.com");
        System.out.println(author);
    }

}
