public class Main {
    public static void main(String[] args) {
        // Пример использования класса Point
        Point point = new Point(2, 3);
        double distanceToLine = point.distanceToLine(1, -1, 0); // Прямая x - y = 0
        System.out.println("Расстояние от точки " + point + " до прямой: " + distanceToLine);

        // Пример использования класса Point3D
        Point3D point3D = new Point3D(1, 2, 3);
        double distanceToPlane = point3D.distanceToPlane(1, -1, 1, -4); // Плоскость x - y + z - 4 = 0
        System.out.println("Расстояние от точки " + point3D + " до плоскости: " + distanceToPlane);
    }
}
