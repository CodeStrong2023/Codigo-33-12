
lista = [10, 15, 9, 11, 14, 10, 10, 14, 13 ]
for elemento in lista:
    contador = (lista.count(elemento))
    if contador > 1 :
        lista.remove(elemento)
print(lista)
