package FACENS.Lista2;

import java.util.Scanner;

public class CalculoMediaFundamental {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i, j = 0, ra;
		double ava1, ava2, ava3, media; // avaliacao

		for (i = 1; i <= 5; i++) {// repetição
			System.out.print("Digite seu RA: ");
			ra = sc.nextInt();// receber valor do RA
			if (ra != 0) { // se o RA for diferente de zero, ira receber as notas 1 , 2 e 3!
				j++;// contador aluno, para mostrar a contagem dos alunos que insesiram o ra corretamente
				// perguntando e recebendo valores dos alunos
				System.out.printf("Aluno %d, Digite sua primeira nota: ", j);
				ava1 = sc.nextDouble();
				System.out.printf("Aluno %d, Digite sua primeira nota: ", j);
				ava2 = sc.nextDouble();
				System.out.printf("Aluno %d, Digite sua primeira nota: ", j);
				ava3 = sc.nextDouble();
				media = (ava1 + ava2 + ava3) / 3;// calculando a media

				if (media >= 8) {// se for maior igual a 8
					System.out.println("Aprovado, parabéns!");
				} else if (media >= 6 && media < 8) {// maior que 6 e menor que 8
					System.out.println("Recuperação!");
				} else {// menor ou igual a 6
					System.out.println("Reprovado!");
				}
				System.out.println();

			} else {// se RA for zero, ira encerrar e comecara outra contagem
				System.out.println("RA inválido!\n");
			}
		}

		sc.close();
	}
}