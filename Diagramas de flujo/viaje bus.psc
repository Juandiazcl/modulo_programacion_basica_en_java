Algoritmo viajebus
	valor2 <- 0
	valorxa <- 0
	totalg <- 0
	Escribir 'Ingrese cantidad de alumnos : '
	Leer valor2
	Segun valor2  Hacer
		valor2>100:
			valorxa <- 6500
			totalg <- valorxa*valor2
		valor2<100 Y valor2>50:
			valorxa <- 7000
			totalg <- valorxa*valor2
		valor2<50 Y valor2>30:
			valorxa <- 9500
			totalg <- valorxa*valor2
		De Otro Modo:
			totalg <- 400000
			valorxa <- 1
	FinSegun
	Escribir 'Valor x alumno ',valorxa
	Escribir 'Valor x grupo ',totalg
FinAlgoritmo
