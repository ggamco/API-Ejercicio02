package com.company.ejercicios;

public class Ejercicio2 {

    public static void main(String[] args) {

        //CON SRING
        String cadena = "Esto es una cadena con espacios";
        cadena = cadena.replace(" ", "/ ");
        System.out.println(cadena);

        System.out.println("====================");

        //CON STRING BUILDER
        StringBuilder sb = new StringBuilder("Esto es una cadena con espacios");
        int pos = 0;
        while ((pos = sb.indexOf(" ", pos)) > 0) {
            sb.insert(pos, "/");
            pos += 2;
        }
        System.out.println(sb.toString());

        cadena.equals("cadena");


        double dat = test();
        System.out.println(dat);

    }

    public static double test() {
        return 0.0;
    }

}
