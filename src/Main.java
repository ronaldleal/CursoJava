package src;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new Main();
    }
    public Main(){
        // 1. Crear una lista
        List<Integer> numeros = crearList();
        System.out.println(numeros);

        //2. Quedarse solo con los pares
        List<Integer> pares = filtrarPares(numeros);
        System.out.println(pares);
    }

    private List<Integer> filtrarPares(List<Integer> numeros) {
    List<Integer> resultado = new ArrayList<>();

        for (Integer numero: numeros) {
            if (numero % 2 == 0){
                resultado.add(numero);
            }
        }
        return resultado;
    }


    private List<Integer> crearList() {
        return List.of(0, 1 , 2, 3, 5, 8, 13, 21, 34, 55, 89, 155);
    }
}
