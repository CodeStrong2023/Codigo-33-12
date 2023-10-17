
lista = []
n = input("Inserte un número: ")
num = int (n)
while (num != 0):
    lista.append (num)
    n = input("Inserte un número: ")
    num = int (n)
lista.sort()
print("Lista de menor a mayor: ",lista)
lista.reverse()
print ("Lista de mayor a menor: ",lista)


    