package recursividad;

import java.util.Scanner;

public class SumaMatriz {
    //Complejidad algoritmica BigO(m*n)
    public static int sumarMatriz(int[][] m, int f, int c){
        //Caso base
        if(f == m.length){
            return 0;
        }                        
        if(c == m[f].length){
            return sumarMatriz(m, f + 1, 0);
        } 
        //Caso recursivo
        return m[f][c] + sumarMatriz(m, f, c + 1);  
    }
    
    //Complejidad algoritmica BigO(m*n)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Filas (m): ");
        int filas = sc.nextInt();
        System.out.print("Columnas (n): ");
        int cols = sc.nextInt();
        int[][] m = new int[filas][cols];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("m[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
        System.out.println("Suma = " + sumarMatriz(m, 0, 0));
    }
}
