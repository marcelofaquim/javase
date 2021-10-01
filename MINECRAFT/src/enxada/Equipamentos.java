package enxada;



public class Equipamentos extends Enxadaacoes {
	
	public static void main(String[] args) {
		
		Equipamentos enxada = new Equipamentos();
		
		enxada.conquista = true;
		System.out.println("Item Enxada");
		 enxada.arar();
		if(enxada.conquista == true) {
			System.out.println("---------");
			System.out.println("Conquista Obtida");
			System.out.println("Hora do plantio");
			System.out.println("-------");
		}
		else {
			enxada.minerar();
		}
	

}	
}











