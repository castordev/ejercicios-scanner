import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Nombre del animal?");

        String animal = sc.nextLine();

        String ani = (animal.equals("perro") || animal.equals("gato")) ? "Domestico": (animal.equals("tigre")  || animal.equals("leon") ) ? "salvaje": "No clasificado";

        System.out.println(ani);



    }
}