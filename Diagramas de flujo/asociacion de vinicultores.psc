algoritmo frutaexp
	valor<-0
	tipo<-" "
	valoruva= 0
	totaluva=0
	Escribir "Ingrese tipo y tamaño de las uvas y valor Kg : "
	Leer tipo, valor, valoruva
	Escribir "Ingrese cantidad Kg : "
	Leer totaluva
Si tipo="A" Entonces
	si valor = 1
		valoruva=valoruva+20
	SiNo
		valoruva=valoruva+30
	fin si
	sino
	si valor = 1
		valoruva=valoruva-30
	SiNo
		valoruva=valoruva-50
	fin si
	Fin Si
	Escribir "Valor final Uva kg ", valoruva
	Escribir "Valor ganacia Uva ", totaluva*valoruva
FinAlgoritmo