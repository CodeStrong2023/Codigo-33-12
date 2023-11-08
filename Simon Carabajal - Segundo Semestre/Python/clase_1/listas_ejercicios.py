# Ejercicio 1: Iterar un rango de 0 a 10 e imprimir números divisibles entre 3
# Ejemplo de ejecución: 0,3,6,9

print('Ejercicio 1:')
for i in range(11):
    if i % 3 == 0:
        print(i)

# Ejercicio 2: Crear un rango de numeros de 2 a 6 e imprimelos
# Ejemplo de ejecución: 2,3,4,5,6

print('Ejercicio 2:')
lista2 = range(2, 7)
for i in lista2:
        print(i)

# Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2, en lugar de 1 en 1
# Ejemplo de ejecución: 3,5,7,9

print('Ejercicio 3:')
for i in range(3, 11, 2):
        print(i)