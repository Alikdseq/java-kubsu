package task_4.zad4;

public class Helper {

    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(10,10);
        System.out.println(p1.distance(p2));
        System.out.println(p2.distance(p1));
    }

}