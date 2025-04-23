import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nombreEstudiante, documento, programa, resultado;
        int materia;

        double nota1, nota2, nota3, notaFinal;
        /* char programa; */

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");

        nombreEstudiante = sc.nextLine();

        System.out.println("Ingrese su documento: ");

        documento = sc.nextLine();

        System.out.println(
                "De la siguiente lista de programas, ingrese la opción a, b o c que corresponda a su programa: \n \n"
                        + " a) Desarrollo de software \n " + "b) Diseño gráfico \n " + "c) Gastronomía \n ");

        programa = sc.nextLine();

        notaFinal = 0;

        materia = 0;

        switch (programa) {

            case "a":
                System.out.println(
                        "Seleccione la matería que desea consultar, ingrese la opción, 1, 2 o 3, que corresponda: \n \n 1.logica \n 2.metodologías \n 3.introducción");

                materia = sc.nextInt();

                switch (materia) {
                    case 1:

                        System.out.println("La materia seleccionada fue: 1.logica\n");

                        System.out.println("ingrese nota 1 (30%)");
                        nota1 = sc.nextDouble();

                        System.out.println("ingrese nota 2 (50%)");
                        nota2 = sc.nextDouble();

                        System.out.println("ingrese nota 3 (20%)");
                        nota3 = sc.nextDouble();

                        notaFinal = (0.3 * nota1) + (0.5 * nota2) + (0.2 * nota3);

                        break;

                    case 2:

                        System.out.println("La materia seleccionada fue: 2.metodologías\n");

                        System.out.println("ingrese nota 1 (30%)");
                        nota1 = sc.nextDouble();

                        System.out.println("ingrese nota 2 (50%)");
                        nota2 = sc.nextDouble();

                        System.out.println("ingrese nota 3 (20%)");
                        nota3 = sc.nextDouble();

                        notaFinal = (0.3 * nota1) + (0.5 * nota2) + (0.2 * nota3);

                        break;

                    case 3:

                        System.out.println("La materia seleccionada fue: 3.introducción\n");

                        System.out.println("ingrese nota 1 (30%)");
                        nota1 = sc.nextDouble();

                        System.out.println("ingrese nota 2 (50%)");
                        nota2 = sc.nextDouble();

                        System.out.println("ingrese nota 3 (20%)");
                        nota3 = sc.nextDouble();

                        notaFinal = (0.3 * nota1) + (0.5 * nota2) + (0.2 * nota3);

                        break;

                    default:
                        System.out.println("Escriba una opción valida 1, 2 ó 3");

                }

                break;

            case "b":
                System.out.println(
                        "Seleccione la matería que desea consultar, ingrese la opción, 1, 2 o 3, que corresponda: \n \n 1.tipografía \n 2.iconografía \n 3.semántica");

                materia = sc.nextInt();

                switch (materia) {
                    case 1:

                        System.out.println("La materia seleccionada fue: 1.tipografía \n");

                        System.out.println("ingrese nota 1 (30%)");
                        nota1 = sc.nextDouble();

                        System.out.println("ingrese nota 2 (50%)");
                        nota2 = sc.nextDouble();

                        System.out.println("ingrese nota 3 (20%)");
                        nota3 = sc.nextDouble();

                        notaFinal = (0.3 * nota1) + (0.5 * nota2) + (0.2 * nota3);

                        break;

                    case 2:

                        System.out.println("La materia seleccionada fue: 2.iconografía  \n");

                        System.out.println("ingrese nota 1 (30%)");
                        nota1 = sc.nextDouble();

                        System.out.println("ingrese nota 2 (50%)");
                        nota2 = sc.nextDouble();

                        System.out.println("ingrese nota 3 (20%)");
                        nota3 = sc.nextDouble();

                        notaFinal = (0.3 * nota1) + (0.5 * nota2) + (0.2 * nota3);

                        break;

                    case 3:

                        System.out.println("La materia seleccionada fue: 3.semántica  \n");

                        System.out.println("ingrese nota 1 (30%)");
                        nota1 = sc.nextDouble();

                        System.out.println("ingrese nota 2 (50%)");
                        nota2 = sc.nextDouble();

                        System.out.println("ingrese nota 3 (20%)");
                        nota3 = sc.nextDouble();

                        notaFinal = (0.3 * nota1) + (0.5 * nota2) + (0.2 * nota3);

                        break;

                    default:
                        System.out.println("Escriba una opción valida 1, 2 ó 3");

                }

                break;

            case "c":

                System.out.println(
                        "Seleccione la matería que desea consultar, ingrese la opción, 1, 2 o 3, que corresponda: \n \n 1.costos \n 2.panadería dulce \n 3.cocina internacional");

                materia = sc.nextInt();

                switch (materia) {
                    case 1:

                        System.out.println("La materia seleccionada fue: 1.costos  \n");

                        System.out.println("ingrese nota 1 (30%)");
                        nota1 = sc.nextDouble();

                        System.out.println("ingrese nota 2 (50%)");
                        nota2 = sc.nextDouble();

                        System.out.println("ingrese nota 3 (20%)");
                        nota3 = sc.nextDouble();

                        notaFinal = (0.3 * nota1) + (0.5 * nota2) + (0.2 * nota3);

                        break;

                    case 2:

                        System.out.println("La materia seleccionada fue: 2.panadería dulce  \n");

                        System.out.println("ingrese nota 1 (30%)");
                        nota1 = sc.nextDouble();

                        System.out.println("ingrese nota 2 (50%)");
                        nota2 = sc.nextDouble();

                        System.out.println("ingrese nota 3 (20%)");
                        nota3 = sc.nextDouble();

                        notaFinal = (0.3 * nota1) + (0.5 * nota2) + (0.2 * nota3);

                        break;

                    case 3:

                        System.out.println("La materia seleccionada fue: 3.cocina internacional \n");

                        System.out.println("ingrese nota 1 (30%)");
                        nota1 = sc.nextDouble();

                        System.out.println("ingrese nota 2 (50%)");
                        nota2 = sc.nextDouble();

                        System.out.println("ingrese nota 3 (20%)");
                        nota3 = sc.nextDouble();

                        notaFinal = (0.3 * nota1) + (0.5 * nota2) + (0.2 * nota3);

                        break;

                    default:
                        System.out.println("Escriba una opción valida 1, 2 ó 3");

                }
        }

        resultado = "";

        if (notaFinal < 2.1) {

            resultado = "Nota final: " + Double.toString(notaFinal)
                    + " materia no aprobada y sin derecho a plan de mejoramiento";

        }

        else if (notaFinal < 3) {

            resultado = "Nota final: " + Double.toString(notaFinal)
                    + " materia no aprobada pero con derecho a plan de mejoramiento";
        }

        else {

            resultado = "Nota definitiva " + Double.toString(notaFinal);
        }

        switch (programa) {

            case "a":

                switch (materia) {
                    case 1:

                        System.out.println("El estudiante " + nombreEstudiante + "con documento " + documento
                                + " obtuvo el siguiente resultado: " + resultado + " en la materia " + "1.logica "
                                + "del programa " + "a) Desarrollo de software");

                        break;

                    case 2:

                        System.out.println("El estudiante " + nombreEstudiante + "con documento " + documento
                                + " obtuvo el siguiente resultado: " + resultado + " en la materia " + "2.metodologías "
                                + "del programa " + "a) Desarrollo de software");

                        break;

                    case 3:

                        System.out.println("El estudiante " + nombreEstudiante + "con documento " + documento
                                + " obtuvo el siguiente resultado: " + resultado + " en la materia " + "2.introducción "
                                + "del programa " + "a) Desarrollo de software");

                        break;

                    default:
                        break;
                }

                break;

            case "b":

                switch (materia) {
                    case 1:

                        System.out.println("El estudiante " + nombreEstudiante + "con documento " + documento
                                + " obtuvo el siguiente resultado: " + resultado + " en la materia " + "1.tipografía "
                                + "del programa " + "b) Diseño gráfico");

                        break;

                    case 2:

                        System.out.println("El estudiante " + nombreEstudiante + "con documento " + documento
                                + " obtuvo el siguiente resultado: " + resultado + " en la materia " + "2.iconografía "
                                + "del programa " + "b) Diseño gráfico");

                        break;

                    case 3:

                        System.out.println("El estudiante " + nombreEstudiante + "con documento " + documento
                                + " obtuvo el siguiente resultado: " + resultado + " en la materia " + "3.semántica "
                                + "del programa " + "b) Diseño gráfico");

                        break;

                    default:
                        break;
                }

                break;

            case "c":


                switch (materia) {
                    case 1:

                        System.out.println("El estudiante " + nombreEstudiante + "con documento " + documento
                                + " obtuvo el siguiente resultado: " + resultado + " en la materia " + "1.Costos "
                                + "del programa " + "c) Gastronomía");

                        break;

                    case 2:

                        System.out.println("El estudiante " + nombreEstudiante + "con documento " + documento
                                + " obtuvo el siguiente resultado: " + resultado + " en la materia " + "2.Panadería dulce "
                                + "del programa " + "c) Gastronomía");

                        break;

                    case 3:

                        System.out.println("El estudiante " + nombreEstudiante + "con documento " + documento
                                + " obtuvo el siguiente resultado: " + resultado + " en la materia " + "3.Cocina internacional "
                                + "del programa " + "c) Gastronomía");

                        break;

                    default:
                        break;
                }

                break;

            default:
                break;
        }

    }
}
