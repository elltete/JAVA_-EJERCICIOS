package ejercicio_6;

public class Test {

	public static void main(String[] args) {

		Empresa empresa = new Empresa();
		
		for (int i=0; i<20; i++) {
			empresa.agregarVendedor(i, new Vendedor(i, "NN"));
		}
		
		empresa.agregarCliente(new Cliente("AA", "11", "TE", Pais.ARGENTINA));
		empresa.agregarCliente(new Cliente("BB", "12", "TE", Pais.ARGENTINA));
		empresa.agregarCliente(new Cliente("CC", "13", "TE", Pais.ARGENTINA));
		empresa.agregarCliente(new Cliente("DD", "14", "TE", Pais.BRASIL));
		empresa.agregarCliente(new Cliente("EE", "15", "TE", Pais.BRASIL));
		empresa.agregarCliente(new Cliente("FF", "16", "TE", Pais.BRASIL));
		empresa.agregarCliente(new Cliente("GG", "17", "TE", Pais.ARGENTINA));
		empresa.agregarCliente(new Cliente("HH", "18", "TE", Pais.ARGENTINA));
		empresa.agregarCliente(new Cliente("II", "19", "TE", Pais.ARGENTINA));
		empresa.agregarCliente(new Cliente("JJ", "20", "TE", Pais.CHILE));
		empresa.agregarCliente(new Cliente("KK", "21", "TE", Pais.CHILE));
		empresa.agregarCliente(new Cliente("LL", "22", "TE", Pais.CHILE));
		empresa.agregarCliente(new Cliente("MM", "23", "TE", Pais.URUGUAY));
		empresa.agregarCliente(new Cliente("NN", "24", "TE", Pais.URUGUAY));
		empresa.agregarCliente(new Cliente("OO", "25", "TE", Pais.URUGUAY));
		empresa.agregarCliente(new Cliente("PP", "26", "TE", Pais.URUGUAY));
		empresa.agregarCliente(new Cliente("QQ", "27", "TE", Pais.ARGENTINA));
		
		empresa.clientesPorPais();
		
		Pedido p1 = new Pedido(0,"11");
		empresa.agregarPedido(p1);
		Pedido p2 = new Pedido(1,"11");
		empresa.agregarPedido(p2);
		Pedido p3 = new Pedido(3,"12");
		empresa.agregarPedido(p3);
		Pedido p4 = new Pedido(4,"13");
		empresa.agregarPedido(p4);
		Pedido p5 = new Pedido(5,"14");
		empresa.agregarPedido(p5);
		Pedido p6 = new Pedido(6,"15");
		empresa.agregarPedido(p6);
		Pedido p7 = new Pedido(0,"16");
		empresa.agregarPedido(p7);
		Pedido p8 = new Pedido(1,"17");
		empresa.agregarPedido(p8);
		Pedido p9 = new Pedido(2,"11");
		empresa.agregarPedido(p9);
		Pedido p10 = new Pedido(3,"12");
		empresa.agregarPedido(p10);
		Pedido p11 = new Pedido(4,"13");
		empresa.agregarPedido(p11);
		Pedido p12 = new Pedido(5,"14");
		empresa.agregarPedido(p12);
		Pedido p13 = new Pedido(6,"18");
		empresa.agregarPedido(p13);
		Pedido p14 = new Pedido(7,"19");
		empresa.agregarPedido(p14);
		Pedido p15 = new Pedido(8,"20");
		empresa.agregarPedido(p15);
		Pedido p16 = new Pedido(9,"21");
		empresa.agregarPedido(p16);
		Pedido p17 = new Pedido(10,"22");
		empresa.agregarPedido(p17);
		
		Producto pr1 = new Producto(1, "1", 100);
		Producto pr2 = new Producto(2, "2", 200);
		Producto pr3 = new Producto(3, "3", 300);
		Producto pr4 = new Producto(4, "4", 400);
		
		
		p1.agregarProducto(pr1); p1.agregarProducto(pr2); p1.agregarProducto(pr3); p1.agregarProducto(pr4);	
		p2.agregarProducto(pr1); p2.agregarProducto(pr2); p2.agregarProducto(pr3);
		p3.agregarProducto(pr1); p3.agregarProducto(pr2); p3.agregarProducto(pr3);		
		p4.agregarProducto(pr1); p4.agregarProducto(pr2); p4.agregarProducto(pr3);		
		p5.agregarProducto(pr1); p5.agregarProducto(pr2); p5.agregarProducto(pr3);		
		p6.agregarProducto(pr1); p6.agregarProducto(pr2); p6.agregarProducto(pr3); p6.agregarProducto(pr4);		
		p7.agregarProducto(pr1); p7.agregarProducto(pr2); p7.agregarProducto(pr3);		
		p8.agregarProducto(pr1); p8.agregarProducto(pr2); p8.agregarProducto(pr3);		
		p9.agregarProducto(pr1); p9.agregarProducto(pr2); p9.agregarProducto(pr3);		
		p10.agregarProducto(pr1); p10.agregarProducto(pr2); p10.agregarProducto(pr3); p10.agregarProducto(pr4);	
		p11.agregarProducto(pr1); p11.agregarProducto(pr2); p11.agregarProducto(pr3);		
		p12.agregarProducto(pr1); p12.agregarProducto(pr2); p12.agregarProducto(pr3);		
		p13.agregarProducto(pr1); p13.agregarProducto(pr2); p13.agregarProducto(pr3);		
		p14.agregarProducto(pr1); p14.agregarProducto(pr2); p14.agregarProducto(pr3);		
		p15.agregarProducto(pr1); p15.agregarProducto(pr2); p15.agregarProducto(pr3); p15.agregarProducto(pr4);	
		p16.agregarProducto(pr1); p16.agregarProducto(pr2); p16.agregarProducto(pr3);		
		p17.agregarProducto(pr1); p17.agregarProducto(pr2); p17.agregarProducto(pr3);
		
		empresa.informarCantPedidos();
		
		System.out.println(empresa.paisMasRentable());
		
	}

}
