import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Complexo numero;

        System.out.println("Want to create a complex or real number?");

        String tipo = sc.next();

        if(tipo.equals("complex")){

            System.out.println("Type the value of 'a' for a complex a + bi");

            float real = Float.parseFloat(sc.next());

            System.out.println("Type the value of 'b' for a complex a + bi");

            numero = new Complexo(real, Float.parseFloat(sc.next()));

            numero.Modulo();

            numero.Angulo();

            System.out.printf("Modulus: %.2f\n", numero.getModulo());

            System.out.printf("Argument in degrees: %.2f\n", numero.getAngulo());

        }

        if(tipo.equals("real")){

            System.out.println("Which number do you want to create ?");

            numero = new Real(Float.parseFloat(sc.next()));

            System.out.println("1 for > 0 and -1 < 0: " + numero.Sinal());

        }

    }

}
