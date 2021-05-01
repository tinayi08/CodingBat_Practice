package Warmup1;

public class Greeting {

    public static void main(String[] args) {
        //Greetings - Good morning, Good Afternoon, Goodnight
        String time = "Hello World";
        System.out.println(greeting(time));

    }

    public static String greeting(String time) {

        try {
            int hour = Integer.parseInt(time.substring(0,2));

            if (hour < 13) { // before noon
                return "Good morning";
            } else if (hour < 18 && hour >= 13) { // between noon and 5pm
                return "Good afternoon";
            } else if (hour >= 18 && hour < 24) {// between 5pm to midnight
                return "Good Evening";
            } else
                return "Not a valid time";
        } catch (NumberFormatException exc) {
            return exc.getMessage();
        }

    }
}
