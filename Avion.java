import java.util.*;
/**
 * Write a description of class Avion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Avion
{
    
    public static void main(String[] args) {
        double kms;
        double galones;
        double galones_totales;
        
        // Todo programa hace 3 cosas: obtener datos entrada
        // obtener los datos de salida,
        // mostrar los datos de salida
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Kms hasta Miami:");
        kms = teclado.nextDouble();
        System.out.print("Galones gastados por kilometro:");
        galones = teclado.nextDouble();
        
        galones_totales = kms * galones;
        
        System.out.println("Se necesitan " + galones_totales);
        
    }
    
}

