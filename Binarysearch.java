/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.binarysearch;

/**
 *
 * @author secre
 */
public class Binarysearch {



    public static int busquedaBinaria(int[] arreglo, int elementoBuscado) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            // Si el elemento buscado es igual al elemento en la posición media, lo hemos encontrado.
            if (arreglo[medio] == elementoBuscado) {
                return medio;
            }

            // Si el elemento buscado es mayor, descartamos la mitad izquierda del arreglo.
            if (arreglo[medio] < elementoBuscado) {
                izquierda = medio + 1;
            }
            // Si el elemento buscado es menor, descartamos la mitad derecha del arreglo.
            else {
                derecha = medio - 1;
            }
        }

        // Si llegamos aquí, significa que el elemento no se encontró en el arreglo.
        return -1;
    }

    public static void main(String[] args) {
        int[] arreglo = {1, 3, 5, 7, 9, 11, 13, 15};
        int elementoBuscado = 7;

        int resultado = busquedaBinaria(arreglo, elementoBuscado);

        if (resultado != -1) {
            System.out.println("El elemento " + elementoBuscado + " se encuentra en la posición " + resultado);
        } else {
            System.out.println("El elemento " + elementoBuscado + " no se encuentra en el arreglo.");
        }
    }
}

    

