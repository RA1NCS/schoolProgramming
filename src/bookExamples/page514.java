package bookExamples;

class greeting {

    public void hello() {

        System.out.println("Hello");

    }

    public void hello(String firstName) {

        System.out.println("Hello " + firstName);

    }

    public void hello(String firstName, String lastName) {

        System.out.println("Hello " + firstName + " " + lastName);

    }

}

public class page514 {

    public static void main(String[] args) {

        greeting hilol = new greeting();

        hilol.hello();
        hilol.hello("Shreyan");
        hilol.hello("Shreyan", "Gupta");

    }

}
