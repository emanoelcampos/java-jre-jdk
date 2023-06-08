package module06.practicing.conditionals;

public class Aliquot {

    public static void main(String[] args) {

        //1900 até 2800 = 7.5%, e pode reduzir  142
        //2800 até 3751.0 = 15% e pode reduzir 350
        //3751.01 até 4664.0 = 22.5% e pode reduzir 636

        double salary = 3300.0;

        if(salary >= 1900.0 && salary <= 2800.0) {
            System.out.println("Your aliquot is 7.5%, and you can reduce 142.");
        } else if(salary >= 2800.01 && salary <= 3751.0) {
            System.out.println("YYour aliquot is 15%, and you can reduce 350.");
        } else if(salary >= 3751.01 && salary <= 4664.0) {
            System.out.println("Your aliquot is 22.5%, and you can reduce 636.");
        }
    }
}
