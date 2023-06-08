package module07.controlling.loops;

public class Exercise {

    public static void main(String[] args) {

        for(int line = 0; line < 5; line++) {

            for (int column = 0; column < 5; column++) {

                if (column > line) {

                    break;
                }

                System.out.print(column+1);
            }

            System.out.println();
        }
    }
}
