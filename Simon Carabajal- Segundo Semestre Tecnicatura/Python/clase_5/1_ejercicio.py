# Ejercicio 4: Sumar números pares dentro de un rango
# Hacer un programa para sumar números pares dentro de un rango, por ejemplo:
# suma de números pares del 2 al 30 suma = 240

print('Sumar los numeros pares dentro de un rango')
inferior = int(input('Ingrese el límite inferior: '))
superior = int(input('Ingrese el límite superior: '))
suma = 0

for i in range(inferior, superior+1):

    if (i % 2 == 0):
        suma += i
print(f'La suma de los números pares entre {inferior} y {superior} es {suma}.')
