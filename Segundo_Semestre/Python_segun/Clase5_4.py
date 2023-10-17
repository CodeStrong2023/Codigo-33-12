import random
print("Número aleatorio")
numaleatorio = random.randint(1 , 100)
print("ingrese un número: ")
n = input()
num = int(n)
while num != numaleatorio:
    if num > numaleatorio:
        print("Es menor")
    else :
        print("Es mayor")
    print("ingrese un número: ")
    n = input()
    num = int(n)
print("Bien hecho el número es: ",numaleatorio)
