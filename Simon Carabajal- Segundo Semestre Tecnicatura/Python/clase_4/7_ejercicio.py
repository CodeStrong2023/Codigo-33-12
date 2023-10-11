# Ejercicio 2: Modificar los elementos de una lista
# Llenar una lista con los número del 1 al 10, luego modificar los
# elementos de la lista multiplicandolos por un valor ingresado por el usuarios.

print('Esta es la lista original')

lista = list(range(1, 11))
for i in lista:
    print(i, end=',')

numero = int(input('\nInsertar el número por el que se quiere multiplicar la lista: '))

for indice, i in enumerate(lista):
    lista[indice] *= numero

print(f'Lista multiplicada por {numero} :')
for i in lista:
    print(i, end=',')