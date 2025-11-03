// made by JIBIN WILSON S7 CSE

abstract class Shape {
    abstract void numberOfSides();
}

class Rectangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Rectangle has 4 sides.");
    }
}

class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Triangle has 3 sides.");
    }
}

class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides.");
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Shape r = new Rectangle();
        Shape t = new Triangle();
        Shape h = new Hexagon();
        r.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();
    }
}


