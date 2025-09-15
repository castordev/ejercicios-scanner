import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Velocidad del coche?");

        int speed = sc.nextInt();

        String spek = (speed > 120) ? "multa" : "no multa";
        System.out.println(spek);



    }
}