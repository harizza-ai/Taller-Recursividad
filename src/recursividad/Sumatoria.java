package recursividad;

import java.util.Scanner;

public class Sumatoria {
    //Complejidad algoritmica BigO(n)
    public static double suma(int n){
        //Caso base
        if(n <= 1){
            return 1;
        }
        //Caso recursivo
        return 1.0 / n + suma(n - 1);
    }
    //Complejidad algoritmica BigO(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.println("Resultado: " + suma(n));
    }
}
