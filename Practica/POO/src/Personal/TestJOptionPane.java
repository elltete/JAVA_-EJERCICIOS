package Personal;

import javax.swing.JOptionPane;

public class TestJOptionPane {

	public static void main(String[] args) {
		
		int numero, numero2;

		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
		Integer.parseInt(JOptionPane.showInputDialog("La suma es: " + numero + numero2));
		
		
	
	}

}