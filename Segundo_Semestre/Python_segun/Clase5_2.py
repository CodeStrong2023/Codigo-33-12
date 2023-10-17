
print("Factorial de un número")
print("Ingrese un número: ")
n = input()
num = int(n)
factorial = 1
if num > 0 :
    print("permitido")
    for i  in range (num + 1):
        if i >= 1:
         factorial = factorial * i
else:
    print("ERROR")
print("La factorial del número es :", factorial)
