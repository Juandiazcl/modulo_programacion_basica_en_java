Algoritmo trajes
	valor <- 0
	Escribir 'Ingrese valor del traje : '
	Leer valor
	Si valor>=250000 Entonces
		valor <- valor-(valor*0.15)
		Escribir 'Tiene un descuento de 15% , valor a pagar $',valor
	SiNo
		valor <- valor-(valor*0.08)
		Escribir 'Tiene un descuento de 8% , valor a pagar $',valor
	FinSi
FinAlgoritmo
