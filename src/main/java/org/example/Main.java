package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nombreCliente;
        String apellidoCliente;
        Integer tipomembrecia;
        Integer cantidadArticulos=0;
        Double precio=500000.0;
        Double precioTotal;

        Scanner leer =new Scanner(System.in);

        System.out.println("***** Bienvenido a Moda Express *****");

        System.out.println("cual es tu nombre");
        nombreCliente= leer.nextLine();

        System.out.println("cual es tu apellido");
        apellidoCliente= leer.nextLine();

        System.out.println("que tipo de membrecia tienes escribe  1 para regular 2 para vip");
        tipomembrecia=leer.nextInt();


        if (tipomembrecia==1){

            System.out.println("cliente regular");
            System.out.println("digie la opcion de articulos que va a llevar ");
            System.out.println("1. 1 a 3 artículos: 5% de descuento.");
            System.out.println("2. 4 a 6 artículos: 10% de descuento. ");
            System.out.println("3. Más de 6 artículos: 15% de descuento.");
            cantidadArticulos=leer.nextInt();

             if (cantidadArticulos==1){

                 System.out.println("tienes un decuento del 5%");
                 precioTotal= precio*0.05;
                 System.out.println("tu precio total es de"+precioTotal);

             }else if (cantidadArticulos==2){
                 System.out.println("tienes un decuento del 10%");
                 precioTotal= precio*0.1;
                 System.out.println("tu precio total es de"+precioTotal);


             } else if (cantidadArticulos==3) {
                 System.out.println("tienes un decuento del 15%");
                 precioTotal= precio*0.15;
                 System.out.println("tu precio total es de"+precioTotal);


             }else {
                 System.out.println("opcion invalida , intenta de nuevo");
             }


        } else if (tipomembrecia==2) {

            System.out.println("cliente VIP");
            System.out.println("digie la opcion de articulos que va a llevar ");
            System.out.println("4. 1 a 3 artículos: 10% de descuento.");
            System.out.println("5. 4 a 6 artículos: 15% de descuento. ");
            System.out.println("6. Más de 6 artículos: 20% de descuento.");

            if (cantidadArticulos==4){
                precioTotal=precio*0.1;
                System.out.println("tu precio total es de"+precioTotal);

            } else if (cantidadArticulos==5) {
                precioTotal=precio*0.15;
                System.out.println("tu precio total es de"+precioTotal);

            } else if (cantidadArticulos==6) {
                precioTotal=precio*0.2;
                System.out.println("tu precio total es de"+precioTotal);

            } else {
                System.out.println("opcion invalida , intenta de nuevo");
            }


        }else {
            System.out.println("opcion invalida");


        }

    }
}