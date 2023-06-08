package module06.practicing.conditionals;

public class TestBreakConditionals {

    public static void main(String[] args) {

        String dayOfTheWeek = "Thursday";

        switch (dayOfTheWeek) {
            case "Sunday" -> System.out.println("Today is Sunday.");
            case "Monday" -> System.out.println("Today is Monday.");
            case "Tuesday" -> System.out.println("Today is Tuesday.");
            case "Wednesday " -> System.out.println("Today is Wednesday .");
            case "Thursday" -> System.out.println("Today is Thursday.");
            case "Friday " -> System.out.println("Today is Friday .");
            case "Saturday " -> System.out.println("Today is Saturday .");
            default -> System.out.println("Not a valid day");
        }
    }
}
