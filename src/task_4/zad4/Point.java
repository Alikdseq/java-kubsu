package task_4.zad4;

public class Point {
    private double x;
    private double y;

    // Конструктор
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Геттеры
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Метод для вычисления расстояния от точки до прямой, заданной уравнением Ax + By + C = 0
    public double distanceToLine(double A, double B, double C) {
        // Формула расстояния от точки (x0, y0) до прямой Ax + By + C = 0:
        // |A*x0 + B*y0 + C| / sqrt(A^2 + B^2)
        double numerator = Math.abs(A * x + B * y + C);
        double denominator = Math.sqrt(A * A + B * B);
        return numerator / denominator;
    }

    // Переопределение метода toString для удобного вывода
    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}
