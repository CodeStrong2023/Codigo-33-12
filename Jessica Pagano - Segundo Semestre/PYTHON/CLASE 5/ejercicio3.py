#EJERCICIO 3
#TABLA DE MULTIPLICAR
#HACER UN PROGRAMA QUE PIDA UN NUMERO POR TECLADO Y GUARDE EN LA LISTA SU TABLA DE MULTIPLICAR HASTA EL 10
#POR EJEMPLO: SE DIGITA EL 5 EN LA LISTA TENDRA: 5,10,15,20,25 ..

num = int(input("Digite un numero: "))
lista = [] #se crea una lista vacia
for i in range(1,11):
	lista.append(i * num)
print(f"\nTabla de multiplicar del {num}: \n {lista}")