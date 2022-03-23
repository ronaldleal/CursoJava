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

        // 3. Pasar cada numero al cuadrado

        List<Integer> cuadrado = elevarCuadrado(pares);
        System.out.println(cuadrado);

        // 4. Mostrar cada cuadrado por pantalla
        List<Integer> mostrados = mostrarLista(cuadrado);

        // 5. Obtener la suma de los cuadrados
        
        Integer total = sumaDeCuadrados(mostrados);
        System.out.println("La suma de los cuadrados es: " + total);

    }

    private Integer sumaDeCuadrados(List<Integer> numeros) {
        int total = 0;
        for (Integer numero:numeros) {
            total += numero ;
        }
        return total;
    }


    private List<Integer> mostrarLista(List<Integer> numeros) {
        for (Integer numero: numeros) {
          System.out.println(numero);
        }
        return numeros;
    }

    private List<Integer> elevarCuadrado(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();

        for (Integer numero: numeros) {
            resultado.add(numero*numero);

        }
        return resultado;
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
        return List.of(0, 1 , 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);
    }
}
