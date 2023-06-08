package module07.controlling.loops;

public class NestedLoops2 {

    public static void main(String[] args) {

        for(int line = 1; line <= 10; line++){
            for(int column = 1; column <= line; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
