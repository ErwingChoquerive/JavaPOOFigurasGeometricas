/*
 * Ejemplo del Principio de Encapsulamiento 
 */
package bo.usfx.sis457;

import bo.usfx.sis457.figuras.*;
import java.util.Scanner;

/**
 * Clase principal que instancia objetos de las clases del paquete figuras
 * @author Marcelo
 */
public class POOFigurasGeometricas {
        
    /**
     * Clase principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de las variables
        Scanner entradaTeclado;
        int opcion;
        double base,altura;
        char respuesta;
        do{
            limpiarConsola ();
            
        System.out.println("//////////////////////////////////////////////////////////////");
        System.out.println("/ Programa: Figuras Geometricas                              /");
        System.out.println("/ - Ejemplo de Encapsulamiento                               /");
        System.out.println("//////////////////////////////////////////////////////////////\n");
        System.out.println("+============================================================+");
        System.out.println("| Que desea realizar?                                        |");
        System.out.println("| 1) Calcular el área y perímetro de un Círculo              |");
        System.out.println("| 2) Calcular el área y perímetro de un Cuadrado             |");
        System.out.println("| 3) Calcular el área y perímetro de un Rectangulo           |");
        System.out.println("| 4) Calcular el área y perímetro de un Triángulo_Rectángulo |");
        System.out.println("| 5) Calcular el área y perímetro de un Rombo                |");
        System.out.println("| 6) Calcular el área y perímetro de un Hexágono             |");
        System.out.println("| *) Salir                                                   |");
        System.out.println("+============================================================+");
        entradaTeclado = new Scanner(System.in);
        opcion = entradaTeclado.nextInt();
        switch (opcion) {
            case 1:
                /* Se instancia un objeto de la Clase Círculo y posteriormente se modifica el valor
                   de su propiedad "Radio" a través de un método accesor o setter (setRadio). */
                Circulo circulo = new Circulo();
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Círculo                             |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor del radio: ");
                float radio = (float)entradaTeclado.nextFloat();
                circulo.setRadio(radio);
                System.out.println("El Área del Círculo es: " + circulo.getArea());
                System.out.println("El Perímetro del Círculo es: " + circulo.getPerimetro());
                break;
            case 2:
                /* Se instancia un objeto de la Clase Cuadrado y posteriormente se modifica el valor
                   de su propiedad "Lado" a través de un método accesor o setter (setRadio). */
                Cuadrado cuadrado = new Cuadrado();
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Cuadrado                            |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor del lado: ");
                cuadrado.setLado(entradaTeclado.nextDouble());
                System.out.println("El Área del Cuadrado es: " + cuadrado.getArea());
                System.out.println("El Perímetro del Cuadrado es: " + cuadrado.getPerimetro());
                break;
            case 3:
                /* Se instancia un objeto de la Clase Rectangulo y a la vez se inicilaizan los valores
                   de sus propiedades "Base" y "Altura" a través del método Constructor (Rectangulo). */
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Rectángulo                          |");
                System.out.println("+==================================================+");
                System.out.print("Introduzca el valor de la Base: ");
                base = entradaTeclado.nextDouble();
                System.out.print("Introduzca el valor de la Altura: ");
                altura = entradaTeclado.nextDouble();
                Rectangulo rectangulo = new Rectangulo(base, altura);
                System.out.println("El Área del Rectángulo es: " + rectangulo.getArea());
                System.out.println("El Perímetro del Rectángulo es: " + rectangulo.getPerimetro());
                break;
                // OPCION 4 FIGURA GEOMETRICA TRIANGULO_RECTANGULO
            case 4:
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Triángulo_Rectángulo                |");
                System.out.println("+==================================================+");
                System.out.println("Introduzca el valor de la Base: ");
                base = entradaTeclado.nextDouble ();
                System.out.println("Introduzca el valor de la Altura: ");
                altura= entradaTeclado.nextDouble ();
                Triangulo_Rectangulo triangulo_rectangulo = new Triangulo_Rectangulo(base,altura);
                System.out.println("El Área del Triángulo_Rectángulo es: " + triangulo_rectangulo.getArea());
                System.out.println("El Perímetro del Triángulo_Rectángulo es: " + triangulo_rectangulo.getPerimetro());
                System.out.println("La Hiponenusa del Triangulo_Rectángulo es: " + triangulo_rectangulo.getHipotenusa());
                break;
            //OPCION 5 FIGURA GEOMETRICA ROMBO
            case 5:
                limpiarConsola();
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Rombo                               |");
                System.out.println("+==================================================+");
                System.out.println("Introduzca el valor del Diámetro de ancho: ");
                double diametro1 = entradaTeclado.nextDouble ();
                System.out.println("Introduzca el valor del Diámetro de largo: ");
                double diametro2 = entradaTeclado.nextDouble ();
                Rombo rombo = new Rombo(diametro1,diametro2);
                System.out.println("El Área del Rombo es: " + rombo.getArea());
                System.out.println("El Perímetro del Rombo es: " + rombo.getPerimetro());
                break;
            //OPCION 6 FIGURA GEOMETRICA DE UN HEXAGONO
            case 6:
                System.out.println("+==================================================+");
                System.out.println("| SubPrograma: Hexágono                            |");
                System.out.println("+==================================================+");
                System.out.println("Introduzca el valor del Lado: ");
                double lado = entradaTeclado.nextDouble ();
                System.out.println("Introduzca el valor del Apotema: ");
                double apotema = entradaTeclado.nextDouble ();
                Hexagono hexagono = new Hexagono(lado,apotema);
                System.out.println("El Área del Hexágono es: " + hexagono.getArea());
                System.out.println("El Perímetro del Hexágono es: " + hexagono.getPerimetro());
                break;
            default : System.exit(0);
              }
        System.out.println("\n -----Desea volver a menu s/n");
        respuesta= entradaTeclado.next().charAt(0);
         }while((respuesta=='s')||(respuesta=='S'));
          System.out.println("-- Salió del programa");
    }
    
    /**
     * Método que limpia pantalla de la consola. Funciona fuera de NetBeans.
     */
    public static void limpiarConsola() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
