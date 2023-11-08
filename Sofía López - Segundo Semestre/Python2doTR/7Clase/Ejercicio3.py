#Ejercicio 3: Función Recursiva
#Imprimir números de 5 a 1 de manera descendente usando funciones recursivas
#Puede ser cualquier valor positivo, por ejemplo, si pasamos el valor de 3, debe imprimir:
#3
#2
#1
#Si se ingresan números negativos no imprime nada


def cuenta_regresiva(numero):
    #Numero correctos
    if numero >= 1:
        print(numero)
        cuenta_regresiva(numero-1)
    #Numeros incorrecto
    elif numero == 0:
        return 0
    elif numero <= 0:
        print('Valor ingresado incorrecto')

#El usuario ingresa el numero
numero = int(input("Ingrese un número: "))
cuenta_regresiva(numero)