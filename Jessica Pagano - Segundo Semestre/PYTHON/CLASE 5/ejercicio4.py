#EJERCICIO 4
#JUEGO ADIVINA EL NUMERO
#REALIZAR UN JUEGO PARA ADIVINAR UN NUMERO. PARA ELLO SE DEBE GENERAR UN NUMERO ALEATORIO ENTRE 1 -100
#Y LUEGO IR PIDIENDO NUMEROS INDICANDO "ES MAYOR" O "ES MENOR" SEGUN SEA MAYOR O MENOR CON RESPECTO
# a N. EL PROCESO TERMINARA CUANDO EL USUARIO ACIERTA Y ALLI SE DEBE MOSTRAR EL NUMERO DE INTENTOS.

import random

print("\t - Juego ADIVINA EL NUMERO -")
aleatorio = random.randint(0,100) #En esta funcion se toma un numero aleatorio entre 0 a 100

contador = 0 #Se inicia el contador en 0

while True:
	num = int(input("Digite un número: "))
	contador += 1

	if num > aleatorio:
		print("\nNo es el número correcto, digite otro numero menor: ")
	elif num < aleatorio:
		print("\nNo es el número correcto, digite un numero mayor: ")
	else:
		print(f"FELICIDADES!, acabas de ADIVINAR el número {aleatorio}")
		break #rompe el ciclo y el bucle

#intentos de cada jugador

print(f"\nNúmeros de intentos: {contador}")