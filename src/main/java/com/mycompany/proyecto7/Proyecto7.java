/*

Ejercicio 8: Realiza un programa que calcule la aceptación de una solicitud en base a 
los siguientes parámetros: edad, nota y sexo.
* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
* Otros casos -> NO ACEPTADA
 */
package com.mycompany.proyecto7;

import java.util.Scanner;

public class Proyecto7 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        int nota;
        int edad;
        String sexo;

        System.out.println("dame la calificación de tu nota");
        nota = dato.nextInt();
        System.out.println("dame tu edad");
        edad = dato.nextInt();
        System.out.println("dame tu sexo");
        sexo = dato.next();
        System.out.println();

        if (edad >= 18 || nota >= 5) {
            if ("m".equals(sexo) || "M".equals(sexo)) {
                System.out.println("Felicidades estas en proceso de ser aceptada: ");
            }
        }

        if (edad >= 18 || nota >= 5) {

            if ("F".equals(sexo) || "f".equals(sexo)) {
                System.out.println("aceptada: ");
            }

        }

        if (edad <= 18 || nota <= 5) {
            if (!"m".equals(sexo) || !"M".equals(sexo) && !"f".equals(sexo) || !"F".equals(sexo)) {
                System.out.println("No cumples los requisitos mínimos de aceptación: ");
            }

        }

    }
}
