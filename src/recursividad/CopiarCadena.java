package recursividad;

import java.util.Scanner;

public class CopiarCadena {
    //Complejidad algoritmica BigO(n)
    public static void copiar(String origen, char[] destino, int i) {
        //Caso base
        if (i == origen.length()){
            return;
        }
        //Caso recursivo   
        destino[i] = origen.charAt(i);       
        copiar(origen, destino, i + 1);        
    }

    //Complejidad algoritmica BigO(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cadena: ");
        String origen = sc.nextLine();
        char[] destino = new char[origen.length()];
        copiar(origen, destino, 0);
        System.out.println("Copia: " + new String(destino));
    }
}
