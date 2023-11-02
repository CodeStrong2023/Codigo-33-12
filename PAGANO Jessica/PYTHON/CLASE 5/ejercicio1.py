#EJERCICIO CLASE-5(Funciones)

#EJERCICIO 1
#SUMAR NUMEROS DE PARES DENTRO DE UN RANGO
#HACER UN PROGRAMA PARA SUMAR NUMEROS DE PARES DENTRO DE UN RANGO
#EJEMPLO: SUMA DE NUMEROS PARES DEL 2 AL 30
#	SUMA = 240

a = int(input("Digite desde donde comenzara la suma: "))
b = int(input("Digite hasta donde quiere llegar a sumar: "))

suma = 0
for i in range(a, b + 1):
	if i % 2 == 0: #si el numero es par
		suma += i
print(f"\nLa suma de numeros pares dentro del rango es: {suma}")
