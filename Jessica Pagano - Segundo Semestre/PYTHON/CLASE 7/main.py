#EJERCICIO CLASE-7

#EJERCICIO 1
#FUNCION CON *ARGS PARA MULTIPLICAR
#CREAR UNA FUNCION PARA MULTIPLICAR LOS VALORES RECIBIDOS DE TIPO NUMERICO
#UTILIZANDO ARGUMENTOS VARIABLES *ARGS COMO PARAMETRO DE LA FUNCION Y REGRESAR
#COMO RESULTADO LA MULTIPLICACION DE TODOS LOS VALORES PASADOS COMO ARGUMENTO.

#se define la funcion para multiplicar
def multiplicar_valores(*numeros): #el mas utilizado es el *args pero a modo de ejemplo utilizamos *numeros
	resultado = 1 #no inicializamos en 0 ya que no ayuda a multiplicar
	for numero in numeros:
		resultado *= numero
	return resultado

#aqui llamamos la funcion
print(multiplicar_valores(3, 5, 15)) #le pasamos los argumentos