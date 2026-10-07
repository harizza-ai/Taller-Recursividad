package recursividad;

import java.util.Scanner;

public class SumaDigitos {
    //Complejidad algoritmica BigO(log(n))
    public static int sumaDigitos(int n) {
        //Caso base
        if(n == 0){
            return 0;
        }
        //Caso recursivo
        return n % 10 + sumaDigitos(n / 10);
    }

    //Complejidad algoritmica BigO(log(n))
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc.nextInt();
        System.out.println("Resultado: " + sumaDigitos(n));
    }
}
