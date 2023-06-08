package module07.controlling.loops;

public class NestedLoops {

    public static void main(String[] args) {

        System.out.println("Multiplication Tables");

        for(int multiplier = 1; multiplier <= 10; multiplier++){
            System.out.println();
            System.out.println(multiplier + "'s times tables");
            for(int count = 1; count <= 10; count++){
                System.out.println(count + "x" + multiplier +" = " + count * multiplier);
            }
        }
    }
}
