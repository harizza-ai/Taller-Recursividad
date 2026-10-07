package recursividad;

import java.util.Scanner;

public class MaximoComunDivisor {
    //Complejidad algoritmica BigO(log(min(m, n)))
    public static int mcd(int m, int n) {
        //Caso base
        if (n == 0){
            return m;
        }
        //Caso recursivo
        return mcd(n, m % n);
    }
    
    //Complejidad algoritmica BigO(log(min(m, n)))
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("M: ");
        int m = sc.nextInt();
        System.out.print("N: ");
        int n = sc.nextInt();
        System.out.println("MCD = " + mcd(m, n));
    }
}
