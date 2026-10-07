package recursividad;

import java.util.Scanner;

public class Ackermann {
    //Crece mas rapido que cualquier exponencial
    public static int ackermann(int m, int n){
        //Caso base
        if(m == 0){
            return n + 1;
        }
        if(n == 0){
            return ackermann(m - 1, 1);
        }
        //Caso recursivo
        return ackermann(m - 1, ackermann(m, n - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("m: ");
        int m = sc.nextInt();
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.println("Ackermann(" + m + "," + n + ") = " + ackermann(m, n));
    }
}
