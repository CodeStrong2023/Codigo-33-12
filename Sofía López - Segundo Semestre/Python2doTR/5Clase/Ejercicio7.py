#Ejercicio 7: Juego adivina el número
#Realizar un juego para adivinar un número. Para ello se debe generar un número aleatorio entre 1 - 100, y luego ir pidiendo
#números indicando 'es mayor' o 'es menor' según sea mayor o menor con respecto a N. 
#El proceso termina cuando el usuario acierta y allí se debe mostrar el número de intentos.
import random
aleatorio = random.randint(0, 100)
contador = 0

print('Juego: Adivinar el número')
print('Ingresa números entre el 0 y el 100, se te daran pistas hasta adivinar el número.')

while True:
    numero = int(input('Ingrese un número: '))
    contador += 1
    if numero < aleatorio:
        print('Prueba con un número mayor: ')

    elif numero > aleatorio:
        print('Prueba con un número menor: ')
    
    else:
        print(f'\n¡Haz acertado! El número era {numero}')
        break
            
print(f'Adivinaste en tu intento número {contador}')