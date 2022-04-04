package bookExamples;

class student {

    private String name;
    private String dateOfBirth;
    private int examMark;

    public void displayExamMark(int examMark) {

        System.out.println(examMark);

    }

}

    class fullTimeStudent extends student{

        fullTimeStudent(String name, String dateOfBirth, int examMark) {

        }

    }

    class partTimeStudent extends student {

        partTimeStudent(String name, String dateOfBirth, int examMark) {

        }

    }


public class page509 {

    public static void main(String[] args) {

        System.out.println("Write a short program to declare a class, student, with the private attributes name, dateOfBirth and examMark, and the public method displayExamMark.\n" + "   - Declare the derived classes fullTimeStudent and partTimeStudent.\n" + "   - Declare objects for each derived class, with a name and exam mark of your choice, and use your method to display the exam marks for these students.");

        fullTimeStudent studentOne = new fullTimeStudent("Shreyan", "8th October", 88);
        studentOne.displayExamMark(88);

        partTimeStudent studentTwo = new partTimeStudent("Priyanshu", "8th October", 12);
        studentTwo.displayExamMark(12);

    }

}
