package recursividad;
import java.util.Scanner;

public class Factorial {
    //Complejidad algoritmica BigO(n)
    public static long factorial(int n) {
        //Caso base
        if(n <= 1){
            return 1;
        }
        //Caso recursivo                         
        return n * factorial(n - 1);       
    }


    //Complejidad algoritmica BigO(n)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero: ");
        int n = sc.nextInt();
        if (n < 0){
            System.out.println("No existe factorial de negativos");
        }else {
            System.out.println(n + "! = " + factorial(n));
        }
    }
}

