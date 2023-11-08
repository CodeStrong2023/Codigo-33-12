
lista1 = ["sol", "casa", "girasol", "auto", "boca", "hada", "pez", "gato"]
lista2 = ["luna", "boca", "perro", "carcel", "auto", "gato", "ojos", "pez"]
lista3 = lista1 + lista2
listaigual = []
lista = [] 
listadesololista1 = []
listadesololista2 = []
for elemento in lista3:
    contador = lista3.count(elemento)
    if contador > 1:
        listaigual.append(elemento)
        lista3.remove(elemento)
lista1 = lista1 + listaigual
for elemento in lista1:
    contador = lista1.count(elemento)
    if contador == 1:
        listadesololista1.append(elemento)
lista2 = lista2 + listaigual
for elemento in lista2:
    contador = lista2.count(elemento)
    if contador == 1 :
        listadesololista2.append (elemento)
print("Las palabras que se repiten son: ")
print (listaigual)
print("Las palabras que solo estan en la lista uno son: ")
print(listadesololista1)
print("Las palabras que solo aparecen en la lista 2 son: ")
print(listadesololista2)