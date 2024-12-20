package task_4.zad4;

class Point{
    private double x;
    private double y;

    public Point(double x1, double y1) {
        this.x = x1;
        this.y = y1;
    }

    public double distance(Point p2){
        return Math.sqrt((p2.x - this.x) * (p2.x - this.x) + (p2.y - this.y) * (p2.y - this.y));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}