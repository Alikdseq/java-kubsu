package task_4.zad3;

public class Point {
    private int x;
    private int y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Установка новых координат
    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Получение координаты X
    public int getX() {
        return x;
    }

    // Получение координаты Y
    public int getY() {
        return y;
    }

    // Вывод координат в строку
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Расстояние от начала координат
    public double distanceFromOrigin() {
        return Math.sqrt(x * x + y * y);
    }

    // Проверка нахождения внутри прямоугольника
    public boolean isInRectangle(Point topLeft, Point bottomRight) {
        return (x >= topLeft.getX() && x <= bottomRight.getX() &&
                y >= topLeft.getY() && y <= bottomRight.getY());
    }

    // Проверка нахождения внутри окружности
    public boolean isInCircle(Point center, int radius) {
        double distance = Math.sqrt(Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2));
        return distance <= radius;
    }
}