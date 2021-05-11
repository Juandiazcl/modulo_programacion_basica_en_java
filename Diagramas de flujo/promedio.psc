Algoritmo sin_titulo
	a <- 0
	suma <- 0
	nalu <- 0
	Escribir 'Ingrese cantidad de alumnos: '
	Leer nalu
	Escribir 'Ingrese edades: '
	Para i<-1 Hasta nalu Hacer
		Leer a
		suma <- suma+a
		a <- 0
	FinPara
	Escribir 'Promedio de edad: ',suma/nalu
FinAlgoritmo
