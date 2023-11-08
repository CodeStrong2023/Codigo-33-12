#EJERCICIO 2
#FUNCION RECURSIVA
#IMPRIMIR NUMEROS DE 5 A 1 DE MANERA DESCENDENTE USANDO FUNCIONES RECURSIVAS
#PUEDE SER CUALQUIER VALOR POSITIVO, POR EJEMPLO, SI PASAMOS EL VALOR DE 5
#DEBE IMPRIMIR
# 5
# 4
# 3
# 2
# 1
#TAL CASO CON EL NUMERO 3
# 3
# 2
# 1
#SI SE INGRESA NUMEROS NEGATIVOS NO IMPRIME NADA

numero = int(input("DIGITE UN NUMERO: "))
def imprimir_num_recursivos(numero):
	if numero >= 1: #caso base
		print(numero)
		imprimir_num_recursivos(numero - 1)
	elif numero == 0: #se puede poner print o return
            return
	elif numero <= 0:
		print("-EL VLAOR INGRESADO ES INCORRECTO-")
imprimir_num_recursivos(numero)
