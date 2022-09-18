package miExcepcion;

public class Test {

	public static void main(String[] args) {

		int num = 5;
		
		try {
            if (num >= 0 && num <= 10) {
                throw new MiExcepcion(111);
            } else if (num > 10 && num <= 20) {
                throw new MiExcepcion(222);
            } else if (num > 20 && num <= 30) {
                throw new MiExcepcion(333);
            }
		}catch(MiExcepcion e) {
			System.out.println(e.getMessage());
		}

	}

}
