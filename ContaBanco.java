package MagoBank;

import java.util.Scanner;

public class ContaBanco {

	private String nomeCliente, SnEspecial;
	double numConta;
	private double saldo, limite, stotal;
		
		//Construtor
		ContaBanco(){
			numConta =(1000 + Math.random() * (9999));
			SnEspecial = "SIM";
			saldo = 100;
			limite = 500;
			}
		Scanner sc = new Scanner(System.in);
	 	String numAgencia = "0001";

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public int getNumConta() {
			return (int) numConta;
		}
		
		public String getNumAgencia() {
			numAgencia = "0001";
			return numAgencia;
		}

		public void setNumConta(double numConta) {
			this.numConta = numConta;
		}

		public String getSnEspecial() {
			return SnEspecial;
		}

		public void setSnEspecial(String snEspecial) {
			SnEspecial = snEspecial;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public double getLimite() {
			return limite;
		}

		public void setLimite(double limite) {
			this.limite = limite;
		}

		public double getStotal() {
			return stotal;
		}

		public void setStotal(double stotal) {
			this.stotal = stotal;
		}		
		public void Deposito(double valor) {
			
			saldo += valor;
			System.out.println("---------------------------------");
			System.out.println("Dep�stito realizado com Sucesso!");
			System.out.println("---------------------------------");
			System.out.println("Saldo em conta � de R$"+saldo);
			System.out.println("Saldo do cheque especial � de R$"+limite);
			stotal += saldo + limite;
			System.out.println("Saldo total em conta � de R$"+ stotal);
		}
		
		public void Saque(double valor) {
			
			if (valor < saldo) {
				
				saldo -= valor;
				System.out.println("---------------------------------");
				System.out.println("Saque realizado com Sucesso!");
				System.out.println("---------------------------------");
				System.out.println("Saque de R$"+valor);
				System.out.println("Saldo em conta � de R$"+saldo);
				System.out.println("Saldo do cheque especial � de R$"+limite);
				stotal += saldo + limite;
				System.out.println("Saldo total em conta � de R$"+stotal);
			
			}else{
				stotal += saldo + limite;
					if (valor <= stotal) {
						
						 double r = valor - saldo;   
						 double x = limite - r;
						
						System.out.println("--------------------------------------");
						System.out.println("Saque realizado com Sucesso!");
						System.out.println("Voc� utilizou o seu cheque especial");
					    System.out.println("--------------------------------------");
						System.out.println("Saque de R$"+valor);
					    System.out.println("Seu saldo em conta � de R$0,00");
					    System.out.println("Saldo do cheque especial � de R$"+x);
					    System.out.println("Saldo total em conta � de R$"+x);
					}else{
						System.out.println("---------------------------------");
						System.out.println("Saldo Insuficiente!");
						System.out.println("---------------------------------");
						
						System.out.println("Saldo total em conta dispon�vel � de R$"+stotal);
					}
			}
		}
		
		public void Consulta() {
			System.out.println("---------------------------------");
			System.out.println("CONSULTA SALDO");
			System.out.println("---------------------------------");
			System.out.println("Saldo em conta � de R$"+saldo);
			System.out.println("Saldo do cheque especial � de R$"+limite);
			System.out.println("Saldo total em conta � de R$"+stotal);
		}
	    public static void Sair(){
	       	System.out.println("=====Banco ERP agradece sua visita.=====");
	    }
		public void Tranferencia(double valor) {
			if (valor < saldo) {
				saldo -= valor;
				System.out.println("---------------------------------");
				System.out.println("Pix realizado com Sucesso!");
				System.out.println("---------------------------------");
				System.out.println("Pix de R$"+valor);
				System.out.println("Saldo em conta � de R$"+saldo);
				System.out.println("Saldo do cheque especial � de R$"+limite);
				stotal += saldo + limite;
				System.out.println("Saldo total em conta � de R$"+stotal);
			}else{
				stotal += saldo + limite;
					if (valor <= stotal) {
						 double r = valor - saldo;   
						 double x = limite - r;					
						System.out.println("--------------------------------------");
						System.out.println("Pix realizado com Sucesso!");
						System.out.println("Voc� utilizou o seu cheque especial");
					    System.out.println("--------------------------------------");
						System.out.println("Pix de R$"+valor);
					    System.out.println("Seu saldo em conta � de R$0,00");
					    System.out.println("Saldo do cheque especial � de R$"+x);
					    System.out.println("Saldo total em conta � de R$"+x);
					}else{
						System.out.println("---------------------------------");
						System.out.println("Saldo Insuficiente!");
						System.out.println("---------------------------------");					
						System.out.println("Saldo total em conta dispon�vel � de R$"+stotal);

					}

			}

		}
		
}
