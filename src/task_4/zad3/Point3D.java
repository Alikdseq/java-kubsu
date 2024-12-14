package task_4.zad3;

public class Point3D extends Point {
    private int z;

    // Конструктор по умолчанию (0, 0, 0)
    public Point3D() {
        super();
        this.z = 0;
    }

    // Конструктор с параметрами (x, y, z)
    public Point3D(int x, int y, int z) {
        super(x, y); // Вызов конструктора родителя
        this.z = z;
    }

    // Установка новых координат (x, y, z)
    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y); // Установка x и y через родительский метод
        this.z = z;
    }

    // Переопределение метода setLocation(int x, int y)
    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        this.z = 0; // Координата z обнуляется
    }

    // Получение координаты Z
    public int getZ() {
        return z;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }

    // Переопределение метода distanceFromOrigin
    @Override
    public double distanceFromOrigin() {
        return Math.sqrt(getX() * getX() + getY() * getY() + z * z);
    }

    // Проверка нахождения точки внутри параллелепипеда
    public boolean isInBox(Point3D corner1, Point3D corner2) {
        int x1 = Math.min(corner1.getX(), corner2.getX());
        int y1 = Math.min(corner1.getY(), corner2.getY());
        int z1 = Math.min(corner1.getZ(), corner2.getZ());

        int x2 = Math.max(corner1.getX(), corner2.getX());
        int y2 = Math.max(corner1.getY(), corner2.getY());
        int z2 = Math.max(corner1.getZ(), corner2.

                getZ());

        return (getX() >= x1 && getX() <= x2 &&
                getY() >= y1 && getY() <= y2 &&
                getZ() >= z1 && getZ() <= z2);
    }

    // Проверка нахождения точки внутри сферы
    public boolean isInSphere(Point3D center, int radius) {
        double distance = Math.sqrt(
                Math.pow(getX() - center.getX(), 2) +
                        Math.pow(getY() - center.getY(), 2) +
                        Math.pow(z - center.getZ(), 2));
        return distance <= radius;
    }
}