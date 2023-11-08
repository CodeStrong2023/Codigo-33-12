#Ejercicio 5: Convertidor de temperaturas
#Realizar dos funciones para convertir de grados celsius a fahrenheit y viseversa.

#Funcion de celcius a fahrenheit
def convertidorC(celsius):
    return celsius * 9 / 5 + 32

#Funcion de fahrenheit a celcius
def convertidorF(fahrenheit):
    return (fahrenheit - 32) * 5 / 9

celsius = float(input('\nIngrese la temperatura en grados celsius: '))
resultado = convertidorC(celsius)
print(f'\t{celsius} grados Celsius equivalen a {resultado:.2f} grados Fahrenheit')

fahrenheit = float(input('\nIngrese la temperatura en grados fahrenheit: '))
resultado = convertidorF(fahrenheit)
print(f'\t{fahrenheit} grados Fahrenheit equivalen a {resultado:.2f} grados Celsius')