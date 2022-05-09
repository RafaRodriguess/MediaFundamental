# Cálcuo da Média do Fundamental
## Algoritmo e fluxograma 

INÍCIO

		var
		i = 0, j = 0, ra, nota1, nota2, nota3, média;
		
		enquanto i <= 5 FAÇA
		escreva (''Digite seu RA'')
		leia (ra)
		
		SE ra for diferente de zero FAÇA
		  	j++
		  	escreva (''Aluno 'J',Digite sua primeira nota'')
			leia (nota1)
			escreva (''Aluno 'J',Digite sua segunda nota'')
		  	leia (nota2)
		  	escreva (''Aluno 'J',Digite sua terceira nota'')
		  	leia (nota3)
		  	calcular média
		  	media = (nota1 + nota2 + nota3) / 3

		  	SE média for maior ou igual a 8 FAÇA
		  		escreva (''APROVADO!'')
	  		SENÃO SE média for maior ou igual a 6 e menor que 8 FAÇA
	  			escreva (''RECUPERAÇÃO!'')
	  		SENÃO
		  		escreva (''REPROVADO!'')
        		FIMSE
		SENÃO
			escreva (''ra inválido'')
			
		FIMSE
FIM

