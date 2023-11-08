# Ejercicio 1: Iterar un rango de 0 a 10 e imprimir e imprimir numeros divisibles entre 3.
# Ejemplo de ejecucion: 0,3,6,9
print("Iterar un rango de 0 a 10, divisibles entre 3: ")
for i in range(11):
    if i % 3 == 0:
        print("Número divisible entre 3:", i)
# Ejercicio 2: Crear un rango de numeros de 2 a 6 e imprimirlos
# Ejemplo de ejecución: 2,3,4,5,6
print("Crear un rango de 2 a 6:")
rango2a6 = range(2, 7)
for i in rango2a6:
    print(i)
# Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 a 2, en lygar de 1 a 1
# Ejemplo de ejecucion: 3,5,7,9
print("Crear un rango de 3 a 10 de 2 a 2: ")
for i in range(3, 11, 2):
    print(i)

