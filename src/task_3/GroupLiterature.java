package task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GroupLiterature {
    private int groupId;        // Уникальный номер группы
    private List<Book> books;   // Список объектов Book

    // Конструктор по умолчанию
    public GroupLiterature() {
        this.groupId = 0;
        this.books = new ArrayList<>();
    }

    // Конструктор с параметрами
    public GroupLiterature(int groupId, List<Book> books) {
        this.groupId = groupId;
        this.books = new ArrayList<>(books); // Создаем копию списка
    }

    // Геттеры и сеттеры
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    // Возвращаем неизменяемый список книг
    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    // Добавление книги
    public void addBook(Book book) {
        this.books.add(book);
    }

    // Удаление книги по коду источника литературы
    public void removeBookBySourceCode(String sourceCode) {
        books.removeIf(book -> book.getSourceCode().equals(sourceCode));
    }

    // Сортировка книг по году издания
    public void sortBooksByYear() {
        books.sort(Comparator.comparingInt(Book::getYear));
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group ID: ").append(groupId).append("\nBooks:\n");
        for (Book book : books) {
            sb.append(book.toString()).append("\n");
        }
        return sb.toString();
    }

    // Главный метод для тестирования
    public static void main(String[] args) {
        // Создание книг
        Book b1 = new Book("Война и мир", "Лев Толстой", 1869, "Роман", 1225, "Эксмо", "R001");
        Book b2 = new Book("Преступление и наказание", "Федор Достоевский", 1866, "Роман", 671, "Азбука", "R002");
        Book b3 = new Book("Мастер и Маргарита", "Михаил Булгаков", 1967, "Фэнтези", 470, "АСТ", "R003");

        // Создание группы литературы
        GroupLiterature group = new GroupLiterature(10, List.of(b1, b2, b3));

        // Тестирование функционала
        System.out.println("Исходная группа:");
        System.out.println(group);

        // Добавление книги
        group.addBook(new Book("Евгений Онегин", "Александр Пушкин", 1833, "Поэма", 300, "Современник", "R004"));
        System.out.println("После добавления книги:");
        System.out.println(group);

        // Удаление книги
        group.removeBookBySourceCode("R002");
        System.out.println("После удаления книги:");
        System.out.println(group);

        // Сортировка книг
        group.sortBooksByYear();
        System.out.println("После сортировки по году издания:");
        System.out.println(group);
    }
}
