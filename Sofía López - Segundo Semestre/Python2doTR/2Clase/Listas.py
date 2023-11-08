# Clase 2 LISTAS

lista1 = [1, 2, 3]
lista2 = [4, 5, 6]
lista3 = lista1 + lista2
print("Lista original: ", lista3)

lista3.extend([1, 1, 1])
print("Lista con elementos agregados: ", lista3)

print("Saber en que indice está un elemento:", lista3.index(5))

print("Cuantos valores iguales hay en la lista", lista3.count(1))

lista3.reverse()
print("Lista en reversa: ", lista3)

# Multiplicar una lista
lista = [1, 2, 3, 4, 5] * 2
print(lista)

# Metodo de ordenamiento ascendente
lista.sort()
print(lista)
lista.sort(reverse=True)