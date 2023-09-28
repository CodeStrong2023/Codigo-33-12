# Ejercicio 01: Crear una función para sumar los valores recibidos de tipo numéricos, 
# utilizando argumentos variables *args como parametro de la Función y 
# agregar como resultado la suma de todos los valores pasados como argumentos

def suma(*args):
    resultado = 0
    for numero in args:
        resultado += numero
    return resultado
print(f'El resultado de la suma es {suma(5, 2, 4, 7, 12, 65)}') # con argumentos