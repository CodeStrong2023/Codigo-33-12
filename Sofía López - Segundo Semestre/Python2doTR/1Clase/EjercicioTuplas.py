# Dada la siguiente tupla
tupla = (13, 1, 8, 3, 2, 5, 8)
# Crear una lista que solo incluya los numeros menores a 5
# e imprima por consola [1, 3, 2]
lista = []
for numeros in tupla:
    if numeros < 5:
        lista.append(numeros)
print(lista)