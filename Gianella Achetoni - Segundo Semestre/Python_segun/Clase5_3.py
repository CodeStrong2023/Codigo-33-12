
print("Tabla de multiplicar ")
print("Ingrese un número: ")
n = input()
num = int(n)
rango = range(1,11)
lista = []
for i in rango:
    tabla = num * i
    lista.append(tabla)
print("La tabla es: ", lista )
    