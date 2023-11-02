#EJERCICIO 3
#CREAR UNA FUNCION PARA SUMAR LOS VALORES RECIBIDOS DE TIPO NUMERICOS
#UTILIZANDO ARGUMENTOS VARIABLES COMO *ARGS COMO PARAMETROS DE LA FUNCION
#Y AGREGAR COMO RESULTADO LA SUMA DE TODOS LOS VALORES PASADOS COMO ARGUMENTOS

#se define la funcion
def sumar_valor(*args): #Se recibe una cantidad de parametros indefenidos
	resultado = 0
#iteracion de los elementos
	for valor in args:
		resultado += valor
	return resultado

#Aqui llamamos a la funcion
print(sumar_valor(3, 5, 9, 2, 1))