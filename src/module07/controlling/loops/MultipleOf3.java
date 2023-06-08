package module07.controlling.loops;

public class MultipleOf3 {

    public static void main(String[] args) {

        //laço for para imprimir todos os números múltiplos de 3, entre 1 e 100:

        //usando o módulo para saber se o resto da divisão por 3 da zero:
        for(int number = 1; number < 100; number++) {
            if(number % 3 == 0) {
                System.out.println(number);
            }
        }

        //usando contador começando com com 3 e somando mais 3 a cada iteração
        for(int number = 3; number < 100; number +=3) {
                System.out.println(number);

        }

    }
}
