#EJERCICIO 6
#INSERTAR ELEMENTOS Y ORDENARLOS
#PEDIR NUMEROS Y METERLOS EN UNA LISTA, CUANDO EL USUARIO INTRODUZCA UN NUMERO 0,
#NUESTRO PROGRAMA DEJARA DE INSERTAR.
#POR ULTIMO, MOSTRAR LOS NUMEROS ORDENADOS DE MENOR A MAYOR.

lista = []
salir = False

while not salir:
	num = int(input('Digite un numero: '))

	if num == 0:
	 salir = True
	else:
		lista.append(num)

#funcion para ordenar mas eficientemente
lista.sort()
print(f'\nLista ordenada: \n{lista}')