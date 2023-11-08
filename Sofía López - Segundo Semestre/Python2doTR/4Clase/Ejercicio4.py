#Sacar la raíz cuadrada
import math

num = int(input('Ingrese un número positivo: '))
while num < 0:
    print('El número debe ser positivo')
    num = int(input('Ingrese un número positivo: '))
print(f'La raiz cuadrada de {numero} es {math.sqrt(numero):.2f}')