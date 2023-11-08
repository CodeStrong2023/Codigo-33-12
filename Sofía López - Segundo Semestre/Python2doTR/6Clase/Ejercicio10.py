#Ejercicio 10: No repetir caracteres
#Hacer un programa que pida una cadena por teclado, luego
#meter los caracteres en una lista sin repetir caracteres

frase = input('\nIngresar una frase, se devolveran los caracteres usados sin repetir:\n')
lista = []
contador = 0
for i in frase:
    if i in lista:
        contador += 1
    else: 
        lista.append(i) #el caracter se agrega en la lista
print(f'\nLista de caracteres -> {lista}')
print(f'Caracteres repetidos -> {contador}')