package recursividad;

import java.util.Scanner;

public class CocienteDivEntera {
    //Complejidad algoritmica BigO(a/b)
    public static int cociente(int a, int b){
        //Caso base
        if (a < b){
            return 0;
        }
        //Caso recursivo
        return 1 + cociente(a - b, b);
    }

    //Complejidad algoritmica BigO(a/b)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dividendo: ");
        int a = sc.nextInt();
        System.out.print("Divisor: ");
        int b = sc.nextInt();
        if(b == 0){
            System.out.println("No se puede dividir entre 0");
        }
        else{
            System.out.println("Cociente = " + cociente(a, b));
        }
    } 
}
