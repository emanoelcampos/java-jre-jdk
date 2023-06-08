package module06.practicing.conditionals;

public class TestScope {

    public static void main(String[] args) {

        System.out.println("Testing Conditionals");


        int age = 17;
        int amountPeople = 3;
        boolean accompanied;

        if(amountPeople >=2) {
            accompanied = true;
        } else {
            accompanied = false;
        }

        if(age >= 18 || accompanied) {
            System.out.println("Adult or minor but accompanied by an adult");
        } else {
            System.out.println("Minor");
        }
    }
}
