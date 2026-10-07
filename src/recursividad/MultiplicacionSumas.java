package recursividad;

import java.util.Scanner;

public class MultiplicacionSumas {
    //Complejidad algoritmica BigO(b)
    public static int multiplicar(int a, int b){
        //Caso base
        if(b == 0){
            return 0;
        }
        //Prevencion contra negativos
        if(b < 0){
            return -multiplicar(a, -b);
        }
        //Caso recursivo
        return a + multiplicar(a, b - 1);
    }
    //Complejidad algoritmica BigO(b)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a = sc.nextInt();
        System.out.print("b: ");
        int b = sc.nextInt();
        System.out.println("Resultado: " + multiplicar(a, b));
    }
}
