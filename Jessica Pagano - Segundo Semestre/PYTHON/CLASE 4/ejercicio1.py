#EJERCICIO CLASE-4(Colecciones)

#EJERCICIO 1
#ELIMINAR DUPLICADOS DE UNA LISTA.
#ESCRIBIR UN PROGRAMA EN DONDE TENGA UNA LISTA Y QUE A CONTINUACION ELIMINE LOS ELEMENTOS REPETIDOS, POR ULTIMO MOSTRAR LA LISTA.

#SE CREA LA LISTA
lista = [1, 2, 3, "Jessica", 8, 8, 3, "Ezequiel", 2, "Jessica", 3, "Ezequiel"]

"""
#SE CONVIERTE LA LISTA AUN CONJUNTO DE TIPO SET PARA ELIMINAR ELEMENTOS REPETIDOS.
conjunto = set(lista)

#PARA MOSTRAR LA LISTA COMO CONJUNTO.
lista = list(conjunto)
"""

#PARA REALIZAR LA CONVERSION EN UNA SOLA LINEA DE CODIGO.
lista = list(set(lista))
print(lista)