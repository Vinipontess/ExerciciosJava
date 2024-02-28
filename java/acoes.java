import java.text.DecimalFormat;
import java.util.Scanner;


public class acoes{
	double dividendo;
	double valor;
	double lpa; //Lucro por a��o
	double vpa; //Valor patrimonial por a��o
	double valorpre; //Valor das a��es 1 ano atras

	public static void calcYeild(double dividendo, double valor){
		double dividendoYeild = dividendo/valor*100;
		System.out.printf("O dividendo Yeild desta a��o � %.2f", dividendoYeild);
		System.out.println("%");
	}
	
	public static void calcpl(double valor, double lpa){
		double pla = valor/lpa;
		System.out.printf("E o P/L (Pre�o sobre o lucro) � de R$" + "%.2f", pla);
	}

	public static void calcpvp(double valor, double vpa){
		double pvp = valor/vpa;
		System.out.printf("O P/VP da a��o (Pre�o sobre o valor patrimonial) � R$" + "%.2f", pvp);
	}

	public static void calcanos(double valorpre, double valor){
		double acoespre = 1000/valorpre;
		double vendaatual = acoespre*valor;
		System.out.println("");
		System.out.printf("Fizemos uma an�lise para voc� e se voc� tivesse investido R$1000 a 1 ano, hoje voc� teria R$" + "%.2f", vendaatual);
	}
	
	
	public static void main(String[] args){

		int x;
		int y;
		boolean ok = true;
		Scanner ler = new Scanner(System.in);
		while(ok == true){
			System.out.println("Ol� senhor(a), qual a��o n�s veremos hoje?");
			System.out.println("1 - ENAT3");
			System.out.println("2 - ITSA4");
			System.out.println("3 - WEGE3");
			System.out.println("Digite 1, 2 ou 3");
			x = ler.nextInt();
			while(x<1 || x>3){
				System.out.println("N�o entendi senhor(a), tente novamente");
				System.out.println("Digite 1, 2 ou 3");
				x = ler.nextInt();
			}
			while(x!=0){
				if(x==1){
					acoes enat3 = new acoes();
					System.out.println("");
					enat3.calcYeild(0.15, 25.37);
					enat3.calcpl(25.37, 0.26);
					System.out.println("");
					enat3.calcpvp(25.37, 14.58);
					System.out.println("");
					enat3.calcanos(13.85, 25.37);
					System.out.println("");
					System.out.println("O que voc� deseja agora:");
					System.out.println("1 - Comprar uma a��o por R$25,37");
					System.out.println("2 - An�lisar outra a��o");
					System.out.println("Digite 1 ou 2");
					y = ler.nextInt();
					while(y<1 || y>2){
						System.out.println("N�o entendi senhor(a), tente novamente");
						System.out.println("Digite 1 ou 2");
						y = ler.nextInt();
					}
					if(y==1){
						x=0;
						ok=false;
					}
					else{
						x=0;
					}
				}
				else if(x==2){
					acoes itsa4 = new acoes();
					System.out.println("");
					itsa4.calcYeild(0.18, 10.50);
					itsa4.calcpl(10.50, 1.34);
					System.out.println("");
					itsa4.calcpvp(10.50, 7.72);
					System.out.println("");
					itsa4.calcanos(7.26, 10.50);
					System.out.println("");
					System.out.println("O que voc� deseja agora:");
					System.out.println("1 - Comprar uma a��o por R$10,50");
					System.out.println("2 - An�lisar outra a��o");
					System.out.println("Digite 1 ou 2");
					y = ler.nextInt();
					while(y<1 || y>2){
						System.out.println("N�o entendi senhor(a), tente novamente");
						System.out.println("Digite 1 ou 2");
						y = ler.nextInt();
					}
					if(y==1){
						x=0;
						ok=false;
					}
					else{
						x=0;
					}
				}
				else{
					acoes wege3 = new acoes();
					System.out.println("");
					wege3.calcYeild(0.43, 36.96);
					wege3.calcpl(36.96, 1.37);
					System.out.println("");
					wege3.calcpvp(36.96, 4.13);
					System.out.println("");
					wege3.calcanos(38.28, 36.96);
					System.out.println("");
					System.out.println("O que voc� deseja agora:");
					System.out.println("1 - Comprar uma a��o por R$38,28");
					System.out.println("2 - An�lisar outra a��o");
					System.out.println("Digite 1 ou 2");
					y = ler.nextInt();
					while(y<1 || y>2){
						System.out.println("N�o entendi senhor(a), tente novamente");
						System.out.println("Digite 1 ou 2");
						y = ler.nextInt();
					}
					if(y==1){
						x=0;
						ok=false;
					}
					else{
						x=0;
					}
				}				
				
			}
		}
	System.out.println("Agora voc� � um investidor! Obrigado pela preferencia e volte sempre :)");
	}

}