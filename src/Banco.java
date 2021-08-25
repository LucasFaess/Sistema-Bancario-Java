import java.util.Scanner;
public class Banco {
	
	Scanner tec = new Scanner(System.in);
	
	protected boolean cntcor=false;
	protected boolean cntpou=false;
	private float saldocor = 0;
	private float saldopou = 0;
	public String dono;
	
	public void criarcor() {
		this.cntcor = true;
		System.out.println("Insira seu nome: ");
		this.dono = tec.nextLine();
		System.out.println("\n"+this.dono+" abriu uma conta corrente");
	}
	public void criarpou() {
		this.cntpou = true;
		System.out.println("Insira seu nome: ");
		this.dono = tec.nextLine();
		System.out.println("\n"+this.dono+" abriu uma conta poupança");
	}
	public void depcor() {
		if(this.cntcor==true) {
			System.out.println("Insira o valor do depósito: ");
			float valordepcor = tec.nextFloat();
			this.saldocor+= valordepcor;
			System.out.println("Cliente: "+this.dono+"\nValor depositado: "+valordepcor+"\n Saldo atual: "+this.saldocor);
		}else {
			System.out.println(this.dono+" não tem uma conta corrente");
		}
	}
	public void deppou() {
		if(this.cntpou==true) {
			System.out.println("Insira o valor do depósito: ");
			float valordeppou = tec.nextFloat();
			this.saldopou += valordeppou;
			System.out.println("Cliente: "+this.dono+"\nValor depositado: "+valordeppou+"\n Saldo atual: "+this.saldopou);
		}else {
			System.out.println(this.dono+" não tem uma conta poupança");
		}
	}
	public void saccor() {
		if(this.cntcor==true) {
			System.out.println("Insira o valor de saque: ");
			float valorsaccor = tec.nextFloat();
			if(this.saldocor>=valorsaccor) {
				saldocor-=valorsaccor;
				System.out.println("Valor do saque: "+valorsaccor+"\n Saldo atual: "+this.saldocor);
			}else {
				System.out.println(this.dono+" não possui saldo suficiente para o saque dessa quantia\nSaldo atual: "+this.saldocor+"\n Saldo necessário: "+valorsaccor);
			}
		}else {
			System.out.println(this.dono+" não tem uma conta corrente");
		}
	}
	public void sacpou() {
		if(this.cntpou==true) {
			System.out.println("Digite o valor de saque: ");
			float valorsacpou = tec.nextFloat();
			if(this.saldopou>=valorsacpou) {
				this.saldopou -= valorsacpou;
				System.out.println("Valor do saque: "+valorsacpou+"\n Saldo atual: "+this.saldopou);
			}else {
				System.out.println(this.dono+" não possui saldo suficiente para o saque dessa quantia\nSaldo atual: "+this.saldopou+"\n Saldo necessário: "+valorsacpou);
			}
		}else {
			System.out.println(this.dono+" não possui uma conta poupança");
		}
	}
	public void fecharcor() {
		if(this.cntcor==true) {
			if(this.saldocor==0) {
				this.cntcor = false;
				System.out.println(this.dono+" fechou sua conta corrente com sucesso");
			}else {
				System.out.println("A conta precisa estar zerada para ser fechada");
			}
		}else {
			System.out.println(this.dono+" não possui conta corrente");
		}
	}
	public void fecharpou() {
		if(this.cntpou==true) {
			if(this.saldopou==0) {
				this.cntpou = false;
				System.out.println(this.dono+" fechou sua conta poupança com sucesso");
			}else {
				System.out.println("A conta precisa estar zerada para ser fechada");
			}
		}else {
			System.out.println(this.dono+" não possui uma conta poupança");
		}
	}
}
