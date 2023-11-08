
print ("Ingrese una cadena: ")
cadena = input()
lista = []
listasinrepetir = []
for elemento in cadena :
    lista.append(elemento)
for elemento in lista:
    contador = lista.count(elemento)
    if contador > 1:
        lista.remove(elemento)
for elemento in lista :
    contador = lista.count(elemento)
    if contador >1:
        lista.remove(elemento)
print(lista)
