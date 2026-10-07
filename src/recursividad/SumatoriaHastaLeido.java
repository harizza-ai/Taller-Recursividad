package recursividad;

import java.util.Scanner;

public class SumatoriaHastaLeido {
    //Complejidad algoritmica BigO(n)
    public static int sumatoriaLeido(int n){
        //Caso base
        if(n <= 0){
            return 0;
        }
        //Caso recursivo
        return n + sumatoriaLeido(n - 1);
    }

    //Complejidad algoritmica BigO(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.println("Resultado: " + sumatoriaLeido(n));
    }
}
