package com.company;

public class Main {

    static String[] vocales = {"a", "e", "i", "o", "u"};

    public static void main(String[] args) {

        String cadena = "Esto es una cadena con muchas vocales"; //14 vocales

        int numeroVocales = 0;
        for(int i = 0; i < cadena.length(); i++) {

            switch (cadena.toLowerCase().charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    //si paso por aqui es vocal
                    numeroVocales++;
                    break;
                default:
                    //si paso por aqui es consonante
                    continue;
            }

        }

        System.out.println("Hemos encontrado " + numeroVocales + " vocales en la cadena");

    }


    public static boolean esVocal(String caracter){
        return false;
    }
}
