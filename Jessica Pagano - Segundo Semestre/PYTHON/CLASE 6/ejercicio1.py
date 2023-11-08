#EJERCICIO CLASE-6(Funciones)

#EJERCICIO 1
#NO REPETIR CARACTERES
#HACER UN PROGRAMA EN DONDE PIDA UNA CADENA POR TECLADO, LUEGO
#METER LOS CARACTERES EN UNA LISTA SIN REPETIR CARACTERES-

cadena = input("Digite una cadena: ")
lista = []
for i in cadena:
	if i not in lista: #Si el caracter no se encuentra en la lista
		lista.append(i) #Se agrega a la lista
print(f"\nLista de caracteres sin repetir ninguno: \n {lista}")
