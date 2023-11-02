#EJERCICIO 2
#FACTORIAL DE UN NUMERO POSITIVO
#HACER UN PROGRAMA PARA CALCULAR EL FACTORIAL DE UN NUMERO POSITIVO

num = int(input("Digite un numero: "))

while num < 0: #mientras el numero sea negativo
	print("ERROR -> El numero tiene que ser positivo")
	num = int(input("Digite un numero: "))

factorial = 1 #Se crea la variable para calcular el factorial

for i in range(1, num + 1):
	factorial *= i
print(f"\nEl factorial del numero {num} positivo ingresado es: {factorial}")