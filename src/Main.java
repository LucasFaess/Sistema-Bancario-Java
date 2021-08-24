
public class Main {

	public static void main(String[] args) {
		Banco c1 = new Banco();
		
		c1.dono = "Lucas";
		c1.criarcor(); // Criar conta corrente
		c1.depcor(100.7f); // Depositar conta corrente
		c1.depcor(43f); // ""
		c1.saccor(143.7f); // Sacar conta corrente
		c1.fecharcor();   // Fechar conta corrente
		c1.saccor(143f);  // Sacar conta corrente = erro 
		
		Banco c2 = new Banco();
		
		c2.dono = "Luiza";
		c2.criarpou();   
		c2.deppou(149.58f); 
		c2.deppou(94f);
		c2.fecharpou();
		c2.sacpou(194f);
	}

}
