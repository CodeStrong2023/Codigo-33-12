# Ejercicio 5: Factorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo

numero = int(input('Ingrese un número positivo, se devolvera su factorial: '))
while numero < 0:
    print('EL numero ingresado no es positivo')
    numero = int(input('Ingrese un número, se devolvera su factorial: '))
factorial = 1
for i in range(1, numero+1):
    factorial *= i
print(f'El factorial del numero {numero} es {factorial}')