
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("¿Cuantos grados de calor hace hoy?");
        int number = sc.nextInt();
        if (number > 30){
            System.out.println("Hace calor");
        }else if (number < 0){
            System.out.println("Hace frio");
        }else{
            System.out.println("Esta templado");
        }

    }
}