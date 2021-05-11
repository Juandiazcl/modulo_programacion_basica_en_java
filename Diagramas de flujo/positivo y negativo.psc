Algoritmo posneg
	a <- 0
	suma <- 0
	nalu <- 0
	Escribir 'Ingrese cantidad de numeros: '
	Leer nalu
	Para i<-1 Hasta nalu Hacer
		Leer a
		Si a<=0 Entonces
			cneg <- cneg+1
		SiNo
			cpos <- cpos+1
		FinSi
	FinPara
	Escribir 'Total numeros negativos: ',cneg
	Escribir 'Total numeros positivos: ',cpos
FinAlgoritmo
