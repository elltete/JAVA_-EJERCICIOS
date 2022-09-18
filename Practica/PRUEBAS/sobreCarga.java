package PRUEBAS;

public class sobreCarga {

	public static void main(String[] args) {
        int a=34, b=12, c=56;
 
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
        System.out.println("El mayor de a y b es: " + mayor(a,b));
        System.out.println("El mayor de a, b y c es: " + mayor(a,b,c));
    }
 
    public static int mayor (int x, int y) {
        return x>y ? x : y;
    }
 
    public static int mayor (int x, int y, int z) {
        return mayor(mayor(x,y),z);
    }

}

