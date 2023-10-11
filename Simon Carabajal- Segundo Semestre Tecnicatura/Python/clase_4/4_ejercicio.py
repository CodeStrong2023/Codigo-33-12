import math

# Sacar raiz cuadrada
numero = int(input('Ingrese un número positivo: '))
while numero < 0:
    print('El número debe ser positivo')
    numero = int(input('Ingrese un número positivo: '))
print(f'La raiz cuadrada de {numero} es {math.sqrt(numero):.2f}')