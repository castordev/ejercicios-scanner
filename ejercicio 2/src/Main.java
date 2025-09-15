

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¿color?");

        Scanner sc = new Scanner(System.in);

        String color = sc.nextLine();

        if (color.equals("rojo") || color.equals("azul") || color.equals("amarillo")) {
            System.out.println(" El color " + color + " es primario");
        } else {
            System.out.println("El color " + color + " no es primario");
        }
        sc.close();
    }
}