package ObjectOrientedProgramming;

public class mouseTemplate {

    static boolean leftClicked = false;
    static boolean rightClicked = false;
    static int scrollLevel = 0;

    public static void setColor(String color) {

        String mouseRGBColor = color;
        System.out.println("Color set to " + mouseRGBColor + ".");

    }

    public static void leftClick() {

        leftClicked = true;
        System.out.println("Left Clicked!");

    }

    public static void rightClick() {

        rightClicked = true;
        System.out.println("Right Clicked!");

    }

    public static void scrollUp() {

        scrollLevel--;
        scrollMessage(scrollLevel);

    }

    public static void scrollDown() {

        scrollLevel++;
        scrollMessage(scrollLevel);

    }

    public static void scrollMessage(int scrollLevelDisplay) {

        if (scrollLevelDisplay > 0) {

            System.out.println("Scroll level is down by: " + Math.abs(scrollLevelDisplay) + " Scrolls");

        } else if (scrollLevelDisplay < 0) {

            System.out.println("Scroll level is up by: " + Math.abs(scrollLevelDisplay) + " Scrolls");

        } else {

            System.out.println("Scroll level is: " + scrollLevelDisplay + " Scrolls");

        }

        }


}