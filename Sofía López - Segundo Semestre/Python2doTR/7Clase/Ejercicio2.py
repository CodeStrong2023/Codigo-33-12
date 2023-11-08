#Ejercicio 2: Función con *args para multiplicar
#Crear una función para multiplicar los valores recibidos de tipo numérico,
#utilizando argumentos variables *args como parámetro de la función y regresar
#como resultado la multiplicación de todos los valores pasados como argumento

def multiplicar(*args):
    resultado = 1
    for numero in args:
        resultado *= numero
    return resultado

# Ejemplo de uso de la función multiplicar
resultado = multiplicar(2, 3, 4)
print(f'El resultado de la multiplicación es: {resultado}')