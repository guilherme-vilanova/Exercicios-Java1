
import static java.lang.System.out;
import java.util.Scanner;

public class Main {
	
	public static void main (String args[]) {
		int num1, num2, num3, num4, numf, horas;
		double raio,valor,calculo;
		
		Scanner leitura = new Scanner(System.in);
			
		out.println("Digite o primeiro numero:");
		num1 = leitura.nextInt();
		out.println("Digite o segundo numero:");
		num2 = leitura.nextInt();
		out.println("Digite o terceiro numero:");
		num3 = leitura.nextInt();
		out.println("Digite o quarto numero:");
		num4 = leitura.nextInt();
		out.println("Digite o valor do raio do circulo: ");
		raio = leitura.nextDouble();
		out.println("Digite o numero de funcionarios:");
		numf = leitura.nextInt();
		out.println("Digite qual é o valor da hora trabalhada:");
		valor = leitura.nextDouble();
		out.println("Digite a quantidade de horas trabalhadas:");
		horas = leitura.nextInt();
		calculo = Calculo.salario(horas, valor);
		
		
		out.println("Soma dos dois primeiros é = " + Calculo.soma(num1,num2));
		out.println("A área do circulo é = " + Calculo.areac(raio));
		out.println("A diferença dos numeros digitados é: " + Calculo.diferenca(num1, num2, num3, num4));
		out.println("O numero de funcionarios é: " + numf);
		out.printf("O salario do funcionario é: %.2f%n", calculo );
		
		
		
		leitura.close();
		
		
	}
}