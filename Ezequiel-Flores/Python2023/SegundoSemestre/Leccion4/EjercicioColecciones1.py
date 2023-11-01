# Ejercicio 1: Eliminar duplicados de una lista
# Escriba un programa donde tenga una lista y que a acontinuacion
# elimine los elementos repetidos, por ultimo mostrar la lista

# Creamos una lista
lista = [1, 2, 3, "Ezequiel", 7, 7, 3, "Gianella", 1, "Ezequiel", 2, "Gianella"]
conjunto = set(lista) # Convertimos la lista a un conjunto de tipo set
lista = list(conjunto) # Convertimos el conjunto a una lista
lista = list(set(lista)) # Conversion hecha en una sola linea de codigo (eficiente)
print(lista)

