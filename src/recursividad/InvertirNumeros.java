package recursividad;

import java.util.Scanner;

public class InvertirNumeros {
    //Complejidad algoritmica BigO(log(n))
    public static int invertir(int n, int acumulado){
        //Caso base
        if(n == 0){
            return acumulado;
        }
        //Caso recursivo
        return invertir(n / 10, acumulado * 10 + n % 10);
    }
    
    //Complejidad algoritmica BigO(log(n))
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int n = sc.nextInt();
        System.out.println("Invertido: " + invertir(n, 0));
    }
}
