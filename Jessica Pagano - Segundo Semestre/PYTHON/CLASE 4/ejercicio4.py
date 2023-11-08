#EJERCICIO 4
#LLENAR UNA LISTA
#LLENAR UNA LISTA CON LOS NUMEROS DEL 1 AL 50, LUEGO MOSTRAR LA LISTA CON EL BUCLE FOR
#LOS ELEMENTOS DEBEN MOSTRARSE DE LA SIGUIENTE MANERA: 1-2-3 ... -50

"""
lista = []
i = 1
while i <= 50:
	lista.append(i)
	i += 1
"""

#PARA RESUMIR EL CODIGO Y SEA MAS EFICAZ SE PUEDE HACER DE LA SIGUIENTE MANERA:
lista = list(range(1,51)) #se obtendra el mismo resultado.
for i in lista:
	print(i, end='-')
