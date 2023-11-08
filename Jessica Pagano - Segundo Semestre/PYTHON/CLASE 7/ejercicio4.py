#EJERCICIO 4
#CONVERTIDOR DE TEMPERATURAS
#REALIZAR DOS FUNCIONES PARA CONVERTIR DE GRADOS CELSIUS A FAHRENHEIT Y VISEVERSA
#INVESTIGAR LAS FORMULAS

#FUNCION QUE CONVIERTE DE CELSIUS A FAHRENHEIT
def celsius_fahrenheit(celsius):
	return celsius * 9 / 5 + 32 #presendencia: multiplicacion, division y suma

#FUNCION QUE CONVIERTE DE FAHRENHEIT A CELSIUS
def fahrenheit_celsius(fahrenheit):
	return(fahrenheit - 32) * 5 / 9 #respetan la presedencia

celsius = float(input("DIGITE EL VALOR DE °CELSIUS: "))
resultado = celsius_fahrenheit(celsius)
print(f"{celsius} C a F -> {resultado:.2f}")

fahrenheit = float(input("DIGITE EL VALOR DE °FAHRENHEIT: "))
resultado = fahrenheit_celsius(fahrenheit)
print(f"{fahrenheit} F a C -> {resultado:.2f}")