package pro.sky.java.course1.hw_object;

public class HomeWork1 {
    public static void main(String[] args) {
        Author blok = new Author("Александр", "Блок");
        Author gogol = new Author("Николай", "Гоголь");
        Book stranger = new Book("Незнакомка", blok, 1906);
        Book viy = new Book("Вий", gogol, 1833);
        System.out.println("\"" + stranger.getTitle() + "\"" + " " + stranger.getAuthor().getName() + " " + stranger.getAuthor().getSurname() + " " + stranger.getPublishingYear());
        System.out.println("\"" + viy.getTitle() + "\"" + " " + viy.getAuthor().getName() + " " + viy.getAuthor().getSurname() + " " + viy.getPublishingYear());
        viy.setPublishingYear(1900);
        System.out.println("\"" + viy.getTitle() + "\"" + " " + viy.getAuthor().getName() + " " + viy.getAuthor().getSurname() + " " + viy.getPublishingYear());
    }
}