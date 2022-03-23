import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.Arrays;

public class HolaMundo {
    public static void main(String[] args) {
//        var contador = 0;
//        while (contador < 3){
//            System.out.println("contador = " + contador);
//            contador++;
//        }

//        var contador = 0;
//        do{
//            System.out.println("contador = " + contador);
//            contador++;
//        }while (contador < 0);

//        for (var contador= 0; contador < 3; contador++){
//            if(contador % 2 == 0) {
//                System.out.println("contador = " + contador);
//                break;
//            }
//        }

//        for (var contador= 0; contador <= 3; contador++){
//            if(contador % 2 == 0) {
//                continue;
//            }
//            System.out.println("contador = " + contador);
//        }

        int[] valores = { 1 , 3, 5, 8, 9, 2, 7, 4 , 6, 10};
        IntStream.of(valores)
                .forEach(value -> System.out.printf("%d " +
                        "" +
                        "", value));
        System.out.println();
    }
}
