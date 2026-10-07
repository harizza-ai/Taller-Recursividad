package recursividad;

import java.util.Scanner;

public class SumaArreglo {
    //Complejidad algoritmica BigO(n)
    public static int sumar(int[] v, int i){
        //Caso base
        if (i == v.length){
            return 0;
        }
        //Caso recursivo
        return v[i] + sumar(v, i + 1);
    }

    //Complejidad algoritmica BigO(n)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantos valores? ");
        int n = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("v[" + i + "]: ");
            v[i] = sc.nextInt();
        }
        System.out.println("Suma = " + sumar(v, 0));
    }
}
