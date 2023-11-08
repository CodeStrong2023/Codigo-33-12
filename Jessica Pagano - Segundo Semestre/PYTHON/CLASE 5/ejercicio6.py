#EJERCICIO 6
#MOSTRAR UNA FRASE SIN ESPACIOS Y CONTAR SU LONGITUD
#HACER UN PROGRAMA EN DONDE EL USUARIO INGRESE UNA FRASE, SE LE DEVOLVERA LA MISMA FRASE PERO SIN ESPACIOS EN BLANCO
#Y ADEMAS UN CONTADOR DE CUANTOS CARACTERES TIENE LA FRASE (SIN CONTAR LOS ESPACIOS EN BLANCO)
#EJEMPLO: FRASE = VIVIR POR SIEMPRE EN PAZ
#	      FRASE FINAL = VIVIRPORSIEMPREENPAZ
#	      NRO DE CARACTERES = 21

#se crean las variable frases

frase1 = input("DIGITE UNA FRASE: ")
frase2 = " "

#se recorre la respectiva variable
for i in frase1:
	if i != " ":
		frase2 += i

frase1 = frase2 #se vuelve a guardar en frase1

print(f"\nFRASE FINAL: {frase1}") #Se muestra la frase
print(f"Número de carácteres: {len(frase1)}") #funcion para la longitud de la frase