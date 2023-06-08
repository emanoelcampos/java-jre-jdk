package module06.practicing.conditionals;

public class TestBooleanConditionals {

    public static void main(String[] args) {

        System.out.println("Testing Conditionals");

        int age = 17;
        int amountPeople = 3;
        boolean accompanied = amountPeople >=2;

        if(age >= 18 || accompanied) {
            System.out.println("Adult or minor but accompanied by an adult");
        } else {
                System.out.println("Minor");
        }
    }
}
