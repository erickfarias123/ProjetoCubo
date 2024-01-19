package MagoBank;

import java.util.Scanner;

public class ContaEspecial {
	
	private static void menu(int resposta, ContaBanco cc) {
		//ContaBanco cc = new ContaBanco();		
		String nomeCliente;
        String cpf;
		Scanner sc = new Scanner(System.in);
		int op = 0;
		double valor;
		String pix;
		int er = 0;
		
/*----------------------------------------------------------------------------------------------------------------------------------------------------*/      
		if (resposta != 1) {
			System.out.println("Nome do cliente:");
			cc.setNomeCliente(sc.next());
		    System.out.println("Numero CPF:");
		    cpf = sc.next();
		}
        
		System.out.println("**************************************");
		System.out.println("BOA TARDE SR. "+cc.getNomeCliente());
		System.out.println("AGENCIA....: "+cc.getNumAgencia());
		System.out.println("CONTA....: "+cc.getNumConta());
		System.out.println("CHEQUE ESPECIAL: "+cc.getSnEspecial()+" / VALOR: R$"+cc.getLimite());
		System.out.println("**************************************");
		System.out.println("Abaixo, selecione as opções desejadas:");
		System.out.println("**************************************");
		System.out.println("(1) - Saque");
		System.out.println("(2) - Deposito");
		System.out.println("(3) - Consulta Saldo");
		System.out.println("(4) - Solicitar Cheque");
	    System.out.println("(5) - Doação");
	    System.out.println("(6) - Chat");
		System.out.println("(7) - PIX");
		System.out.println("(8) - Sair");
		System.out.println("**************************************");
    

	}
	
	private static void retorno(ContaBanco cc) {
		
		int resposta = 1;
		Scanner sc = new Scanner(System.in);		
		System.out.println("========================================================");
		System.out.println("Deseja realizar mais alguma operação? 1 - Sim ou 2 - Não");				
		resposta = sc.nextInt();
		if (resposta == 1){
            menu(1, cc);	            
         }
         else if (resposta == 2){
        	 cc.Sair();
	}
	}
		public static void main(String[] args) {

			ContaBanco cc = new ContaBanco();		
			String nomeCliente = null;
	        String cpf = null;
			Scanner sc = new Scanner(System.in);
			int op = 0;
			double valor;
			String pix;
			int resposta = 1;
			int er = 0;
			
			Scanner teclado = new Scanner(System.in); 
/*----------------------------------------------------------------------------------------------------------------------------------------------------*/      		
		menu(2, cc);        
		while (op !=8){
			op = sc.nextInt();
			switch(op){
			case 1:
				System.out.println("Informe o valor para saque:");
				System.out.print("R$:");
				valor = sc.nextDouble();
				cc.Saque(valor);
				retorno(cc);
				break;
			case 2:
				System.out.println("Informe o valor para deposito:");
				System.out.print("R$:");
				valor = sc.nextDouble();
				retorno(cc);
				break;
			case 3:
				cc.Consulta();
				retorno(cc);
				break;
			case 4:
				System.out.println("Prezado " + nomeCliente + " para solicitação de cheque você deve possuir 6 (seis) meses de conta ativa!");
				retorno(cc);
				break;
			case 5:
				System.out.println("Prezado " + nomeCliente + " para liberação da função doação, favor entrar em contato com a central "
	        			+ "de atendimento atráves do telefone 0800 281 1100!");
				retorno(cc);
				break;
			case 6:
				System.out.println("Prezado " + nomeCliente + ", a função de CHAT está sendo implementada, dessa forma, entrar em contato  "
	            		+ "com a central de relacionamento atráves do telefone 0800 281 1100");
				retorno(cc);
				break;
			case 7:
				System.out.println("Prezado " + nomeCliente + ",no momento só temos a opção de transferencia. Favor informar a chave PIX para transferencia!");
				System.out.print("Chave:");
				pix = sc.next();
				System.out.print("Digite o valor de transferencia:");
				System.out.print("R$:");
				valor = sc.nextDouble();
				cc.Tranferencia(valor);
				retorno(cc);
				break;
			case 8:
				cc.Sair();
				break;
			default:
			       System.out.println("Valor invalido");
				}
			}
		}
	}


