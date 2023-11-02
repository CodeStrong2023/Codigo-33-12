#EJERCICIO 5
#MODIFICAR LOS ELEMENTOS DE UNA LISTA
#LLENAR UNA LISTA CON LOS NUMEROS DEL 1 AL 10, LUEGO MODIFICAR LOS ELEMENTOS DE LA LISTA MULTIPLICANDOLOS POR UN VALOR INGRESADO POR EL USUARIO.

lista = list(range(1, 11))
print('lista original: ')
for i in lista:
    print(i , end='-')

#se crea la variable para el usuario, ingrese el numero
num = int(input('\nDigite un valor a multiplicar: '))

#se multiplican todos los elementos de la lista
for indice, i in enumerate(lista):
	lista[indice] *= num
print(f'Lista final con los elementos multiplicados por {num}')
for i in lista:
	print(i, end='-')