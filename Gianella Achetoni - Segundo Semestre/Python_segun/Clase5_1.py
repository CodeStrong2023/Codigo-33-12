
print("suma de numeros pares de 2 al 30")
rango = range (2,31)
suma = 0
for i in rango:
    if i % 2 == 0:
        suma = suma + i
print("La suma de los números pares es: " ,suma)
