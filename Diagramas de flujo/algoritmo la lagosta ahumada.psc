Algoritmo platos
	valor<-0
	cantidad<-0
	Escribir "Ingrese cantidad de personas : "
	Leer cantidad
	Segun cantidad Hacer
		cantidad>200 y cantidad<300:
			valor=cantidad*8500
			Escribir "Su valor por plato es 8500 , valor a pagar $",valor
		cantidad>300:
			valor=cantidad*7500
			Escribir "Su valor por plato es 7500 , valor a pagar $",valor
		De Otro Modo:
			valor=cantidad*9500
			Escribir "Su valor por plato es 9500 , valor a pagar $",valor
	Fin Segun
FinAlgoritmo