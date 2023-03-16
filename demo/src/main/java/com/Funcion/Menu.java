package com.Funcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public Menu() {
    }

    /**
     * 
     */
    public static void mostrar(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de x: ");
        int x = sc.nextInt();
        System.out.println("Introduce el valor de y: ");
        int y = sc.nextInt();
        boolean salir = false;

        Funcion funcion = new Funcion();
        do {
            int opcion;

            System.out.println("1.- Funcion 1");
            System.out.println("2.- Funcion 2");
            System.out.println("3.- Salir \n");

            opcion = sc.nextInt();

            try {
                switch (opcion) {
                    case 1:
                        funcion.funcion1(x, y);
                        break;
                    case 2:
                        funcion.funcion2(x, y);
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Debe ingresar un numero entre el 1 y 3");
                }
            } catch (InputMismatchException ex) {
                System.out.println("Debes ingresar un numero.");
                sc.next();
                salir = false;
            }

        }while (!salir);
        sc.close();

    }

    @Override
    public String toString() {
        return "Menu []";
    }
}
