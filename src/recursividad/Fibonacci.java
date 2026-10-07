package recursividad;

import java.util.Scanner;

public class Fibonacci {
    //Complejidad algoritmica BigO(2^n)
    public static int fib(int n){
        //Caso base
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        //Caso recursivo
        return fib(n - 1) + fib(n - 2);
    }

    //Complejidad algoritmica BigO(2^n)
    public static void imprimirSerie(int i, int limite){
        //Caso base
        if(i > limite){
            return;
        }                
        System.out.print(fib(i) + " ");
        //Caso recursivo
        imprimirSerie(i + 1, limite);
    }

    //Complejidad algoritmica BigO(2^n)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Limite: ");
        int limite = sc.nextInt();
        imprimirSerie(0, limite);
    }

}
