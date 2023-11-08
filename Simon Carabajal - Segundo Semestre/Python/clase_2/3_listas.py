# Concatenar listas

listaA = [1, 2, 3]
listaB = [4, 5, 6]
listaC = listaA + listaB
print("Lista original: ", listaC)

listaC.extend([1, 1, 1])
print("Lista con elementos agregados: ", listaC)

print("Saber en que indice está un elemento:", listaC.index(5))

print("Cuantos valores iguales hay en la lista", listaC.count(1))

listaC.reverse()
print("Lista en reversa: ", listaC)

# Multiplicar una lista
lista = [1, 2, 3, 4, 5] * 2
print(lista)

# Metodo de ordenamiento ascendente
lista.sort()
print(lista)
lista.sort(reverse=True)
