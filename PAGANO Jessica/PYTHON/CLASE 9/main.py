#EJERCICIO CLASE-9
#EJERCICIO 1
#CREAR UNA CLASE LLAMADA RECTANGULO, DEBE DE TENER 2 ATRIBUTOS: ALTURA Y BASE-
#EL NOMBRE DEL METODO SERA CALCULAR AREA UTILIZANDO LA FORMULA:
# AREA = BASE * ALTURA
#PERO LA BASE Y LA ALTURA DEBEN SER INGRESADAS POR EL USUARIO Y LOS OBJETOS DEBEN SER TRES.

class Rectangulo: #se crea la clase rectangulo

	def __init__(self, base, altura):
		self.altura = altura
		self.base = base

#METODO PARA CALCULAR
	def calcular_area(self):
		return self.base * self.altura

#PEDIR DATOS AL USUARIO
base = int(input("DIGITE EL NUMERO PARA LA BASE DEL RECTANGULO: "))
altura = int(input("DIGITE EL NUMERO PARA LA ALTURA DEL RECTANGULO: "))

#ASIGNACION DEL OBJETO + clase
rectangulo1 = Rectangulo(base,altura)
print(f'EL AREA DEL RECTANGULO ES: {rectangulo1.calcular_area()}')