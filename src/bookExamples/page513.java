package bookExamples;

class shape {

    public void area() {

    }

}

class circle extends shape {

    circle (int radius) {

    }

    static void area (int radius){

        System.out.println(Math.PI * (radius * radius));

    }

}

class rectangle extends shape {

    rectangle (int length, int breadth) {

    }

    static void area (int length, int breadth) {

        System.out.println(length * breadth);

    }

}

class square extends shape {

    square (int length) {
    }

    static void area (int length) {

        System.out.println(length * length);

    }

}

public class page513 {

    public static void main(String[] args) {

        circle newCircle = new circle(3);
        rectangle newRectangle = new rectangle(2,4);
        square newSquare = new square(5);

        circle.area(3);
        rectangle.area(2,4);
        square.area(5);

    }

}
