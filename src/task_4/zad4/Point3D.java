packege task4

public class Point3D extends Point {
    private double z;

    // Конструктор
    public Point3D(double x, double y, double z) {
        super(x, y); // Вызов конструктора родительского класса
        this.z = z;
    }

    // Геттер для z
    public double getZ() {
        return z;
    }

    // Метод для вычисления расстояния от точки до плоскости, заданной уравнением Ax + By + Cz + D = 0
    public double distanceToPlane(double A, double B, double C, double D) {
        // Формула расстояния от точки (x0, y0, z0) до плоскости Ax + By + Cz + D = 0:
        // |A*x0 + B*y0 + C*z0 + D| / sqrt(A^2 + B^2 + C^2)
        double numerator = Math.abs(A * getX() + B * getY() + C * z + D);
        double denominator = Math.sqrt(A * A + B * B + C * C);
        return numerator / denominator;
    }

    // Переопределение метода toString для удобного вывода
    @Override
    public String toString() {
        return "Point3D(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
