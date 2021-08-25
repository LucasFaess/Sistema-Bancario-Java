
public class Main {

	public static void main(String[] args) {
		Banco c1 = new Banco();
		
		c1.criarcor(); // Criar conta corrente
		c1.depcor(); // Depositar conta corrente
		c1.depcor(); // ""
		c1.saccor(); // Sacar conta corrente
		c1.fecharcor();   // Fechar conta corrente
		c1.saccor();  // Sacar conta corrente = erro 
		
		Banco c2 = new Banco();
		
		c2.criarpou();   
		c2.deppou(); 
		c2.deppou();
		c2.fecharpou();
		c2.sacpou();
	}

}
