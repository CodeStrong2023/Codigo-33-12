#Ejercicio 2: Operaciones de conjuntos con listas
#Escriba un programa que tenga 2 listas y que a continuación
#cree las siguientes listas (No debe haber repetición)

listaA = (13, 19, 15, 8, 4, 9, 12, 5, 18, 6)
listaB = (14, 1, 6, 7, 4, 10, 8, 15, 13, 19)

conjuntoA = set(listaA)
conjuntoB = set(listaB)

conjunto1 = conjuntoA | conjuntoB
print(f'1) Lista de elementos que aparecen en las listas: {conjunto1}')

conjunto2 = conjuntoA - conjuntoB
print(f'2) Lista de elementos que aparecen en la primera lista, pero no en la segunda: {conjunto2}')

conjunto3 = conjuntoB - conjuntoA
print(f'3) lista de elementos que aparecen en la segunda lista, pero no en la primera: {conjunto3}')

conjunto4 = conjuntoA & conjuntoB
print(f'4) lista de elementos que aparecen en ambas listas: {conjunto4}')