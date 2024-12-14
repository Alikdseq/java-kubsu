package task_3;

import java.util.Arrays;

public class GroupLiterature {
    private int groupId;        // Уникальный номер группы
    private Book[] books;       // Массив объектов Book

    // Конструктор по умолчанию
    public GroupLiterature() {
        this.groupId = 0;
        this.books = new Book[0];
    }

    // Конструктор с параметрами
    public GroupLiterature(int groupId, Book[] books) {
        this.groupId = groupId;
        this.books = books;
    }

    // Геттеры и сеттеры
    public int getGroupId() { return groupId; }
    public void setGroupId(int groupId) { this.groupId = groupId; }

    public Book[] getBooks() { return books; }
    public void setBooks(Book[] books) { this.books = books; }

    // Добавление объекта в массив
    public void addBook(Book book) {
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        this.books[this.books.length - 1] = book;
    }

    // Удаление объекта по коду источника литературы
    public void removeBookBySourceCode(String sourceCode) {
        this.books = Arrays.stream(this.books)
                .filter(book -> !book.getSourceCode().equals(sourceCode))
                .toArray(Book[]::new);
    }

    // Сортировка массива по году издания
    public void sortBooksByYear() {
        Arrays.sort(this.books, (b1, b2) -> Integer.compare(b1.getYear(), b2.getYear()));
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
        GroupLiterature group = new GroupLiterature(10, new Book[]{b1, b2, b3});

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

