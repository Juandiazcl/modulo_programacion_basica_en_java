Algoritmo ahorro
	a <- 0
	suma <- 0
	nalu <- 0
	Escribir 'Ingrese ahorro del mes: '
	Para i<-1 Hasta 12 Hacer
		Leer a
		suma <- suma+a
		Escribir 'Total acumulado al mes',i,' $ ',suma
		a <- 0
	FinPara
	Escribir 'Total Anual acumulado: ',suma
FinAlgoritmo
