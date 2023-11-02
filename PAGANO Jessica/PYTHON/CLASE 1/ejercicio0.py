#EJERCICIO CLASE-1(Tuplas y Listas)
#DADA LA SIGUIENTE TUPLA
#CREAR UNA LISTA QUE SOLO INCLUYA LOS NUMEROS MENORES A 5 E IMPRIMA POR CONSOLA [1, 3, 2]

tupla = (13, 1, 8, 3, 2, 5, 8)
lista = [] #se define la lista
#se filtra los numeros menores a 5 de la tupla
for elemento in tupla:
	if elemento < 5:
		lista.append(elemento)
print(lista)