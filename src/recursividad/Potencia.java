package recursividad;

import java.util.Scanner;

public class Potencia {
    //Complejidad algoritmica BigO(exp)
    public static double potencia(double base, int exp) {
        //Caso base
        if(exp == 0){
            return 1;
        }
        //Prevencion contra negativos
        if (exp < 0){
            return 1 / potencia(base, -exp);
        }
        //Caso recursivo
        return base * potencia(base, exp - 1);
    }

    //Complejidad algoritmica BigO(exp)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Base: ");
        double base = sc.nextDouble();
        System.out.print("Exponente: ");
        int exp = sc.nextInt();
        System.out.println(base + "^" + exp + " = " + potencia(base, exp));
    }
}
