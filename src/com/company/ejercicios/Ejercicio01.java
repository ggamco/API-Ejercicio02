package com.company.ejercicios;

import java.util.Arrays;

public class Ejercicio01 {

    public static void main(String[] args) {


        String[] cadenas = {
                "Esto es una cadena corta",
                "Esta cadena tiene mas caracteres",
                "No tiene muchos caracteres",
                "Esta es la corta"
        };

        int longitud = 0;
        String aux = "";
        for (String cadena : cadenas) {
            if (longitud < cadena.length()) {
                longitud = cadena.length();
                aux = cadena;
            }
        }

        //System.out.println("La cadena mas larga es: " + aux);

        //Scanner sc = new Scanner(System.in);
        //String cadena1 = sc.nextLine();
        //String cadena2 = sc.nextLine();

        /*if(cadena1==cadena2){
            System.out.println("Son el mismo objeto");
        } else {
            System.out.println("Son distintos objetos");
        }

        if(cadena1.equals(cadena2)){
            System.out.println("Son la misma cadena");
        }*/

        /*if(1 == 1);
        System.out.println(("cadena" == "cadena"));
        System.out.println("cadena");

        Integer entero = 1;

        String cadena3 = "Esto es una cadena cadena";

        int pos = cadena3.indexOf("na",cadena3.indexOf("na")+1);

        System.out.println(pos);*/


        String cadenaPrueba = "esto;es;una;cadena;grande";
        String[] array = cadenaPrueba.split("/");

        Arrays.stream(array).forEach(p -> System.out.println(p));

        cadenaPrueba = cadenaPrueba.replace('e', 'i');
        System.out.println(cadenaPrueba);

        double numero = (double) 2222222;
        System.out.println(numero);


    }

}
