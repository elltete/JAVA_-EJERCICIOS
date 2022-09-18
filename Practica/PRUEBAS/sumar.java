package PRUEBAS;

import java.util.Scanner;

public class sumar {

    public static void main(String[] args) {

        //int numero1, numero2, resultado;
        //numero1 = introduce();
        //numero2 = introduce();
        //resultado = sumar(numero1, numero2);
        //imprimir(resultado);
    }

    //método sumar
    //public static int sumar(int a, int b){
    //	return (a+b);
    //}
    
    //metodo ingreso
    public static int introduce() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce número: ");                                             
        sc.close();
        return sc.nextInt();

    }
    
    //imprimir
    public static void imprimir(int a) {
        System.out.println("Suma: " + a);
    }

}