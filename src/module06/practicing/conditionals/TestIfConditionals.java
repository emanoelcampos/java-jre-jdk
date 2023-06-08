package module06.practicing.conditionals;

public class TestIfConditionals {

    public static void main(String[] args) {

        System.out.println("Testing Conditionals");

        int age = 17;
        int amountPeople = 3;

        if(age >= 18) {
            System.out.println("Adult");
        } else {
            if(amountPeople >= 2) {
                System.out.println("Minor but accompanied by an adult");
            } else {
                System.out.println("Minor");
            }

        }
    }
}
