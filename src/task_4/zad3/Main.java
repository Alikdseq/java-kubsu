package task_4.zad3;

public class Main {
    public static void main(String[] args) {
        Point3D p1 = new Point3D(1, 2, 3);
        System.out.println(p1); // (1, 2, 3)

        p1.setLocation(4, 5);
        System.out.println(p1); // (4, 5, 0)

        p1.setLocation(7, 8, 9);
        System.out.println(p1); // (7, 8, 9)

        System.out.println("Distance from origin: " + p1.distanceFromOrigin());

        Point3D boxCorner1 = new Point3D(0, 0, 0);
        Point3D boxCorner2 = new Point3D(10, 10, 10);

        System.out.println("Is in box: " + p1.isInBox(boxCorner1, boxCorner2));

        Point3D sphereCenter = new Point3D(0, 0, 0);
        System.out.println("Is in sphere: " + p1.isInSphere(sphereCenter, 10));
    }
}