import java.util.Scanner;
import java.lang.String;

public class clase2A {

    public void ejercicio1() {

        String cadena1 = "Hola";
        String cadena2 = "Adios";

        if (cadena1.equals(cadena2)) {

            System.out.println("Las cadenas son iguales");

        } else {

            System.out.println("Las cadenas son distintas");

        }
    }

    public void ejercicio2() {

        Integer num1 = 2;
        Integer num2 = 2;
        int comparacion = num1.compareTo(num2);

        if(num1.equals(num2)) {

            System.out.println("Son iguales");

        }
        else {

            if(comparacion>0) {

                System.out.println("num1 es mayor que num2");

            }
            else {

                System.out.println("num2 es mayor que num1");

            }
        }

    }

    public void scanner() {

        Scanner lector = new Scanner(System.in);
        String nombre;
        String apellido;
        char inicialNombre;
        char inicialApellido;
        String iniciales;

        System.out.println("Ingresar nombre");
        nombre = lector.nextLine();

        System.out.println("Ingresar apellido");
        apellido = lector.nextLine();

        inicialNombre = nombre.charAt(0);
        inicialApellido = apellido.charAt(0);
        iniciales = String.valueOf(inicialNombre) + String.valueOf(inicialApellido);

        System.out.println(iniciales);

    }

}
