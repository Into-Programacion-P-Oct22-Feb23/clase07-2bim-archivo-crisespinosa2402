/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList011 {

    public static void main(String[] args) {
        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.printf("%s\n", cadenaFinal);
        }
    
    public static ArrayList<String> obtenerDatos(){
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        ArrayList<String> arreglo2 = new ArrayList<>();
        String pais;
        boolean bandera = true;
        String opcion;
        while (bandera) {
            System.out.println("Ingrese por favor un nombre de un país");
            pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("Ingrese (si) para salir del ciclo");
            opcion = entrada.nextLine();
            if (opcion.equals("si")) {
                bandera = false;
            }
        }
        return arreglo2;
    }

    public static String obtenerCadenaFinal(ArrayList<String>arreglo2) {
        String cadenaFinal = "";
        for (int i = 0; i < arreglo2.size(); i++) {
            System.out.println(arreglo2.get(i));
            cadenaFinal = String.format("%s%s\n", cadenaFinal, arreglo2.get(i));
        }
        return cadenaFinal;
    }
}

