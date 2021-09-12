package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;
    private int y;
    private int z;
    private boolean is3D = false;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.is3D = true;
    }

    public double distance(Point that) {
        if (this.is3D || that.is3D) {
            return -1D;
        }
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        if (!(this.is3D && that.is3D)) {
            return -1D;
        }

        return Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.x, 2) + Math.pow(that.z - this.z, 2));
    }

    public void info() {
        System.out.println("Point[" + this.x + ", " + this.y + "]");
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);

        Point c = new Point(0, 0, 0);
        Point d = new Point(0, 2, 0);
        double dist3D = c.distance3d(d);
        System.out.println(dist3D);
    }
}