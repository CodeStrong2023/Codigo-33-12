#EJERCICIO 2
#CREAR LA CLASE CUBO CON LOS ATRIBUTOS, ANCHO, ALTO Y PROFUNDIDAD
#CON UN METODO CALCULAR_VOLUMEN QUE TENDRA LA FORMULA:
#VOLUMEN = ANCHO * ALTURA * PROFUNDIDAD
#QUE EL USUARIO INGRESE LOS VALORES

#definimos la clase
class cubo:
	def __init__(self, ancho, altura, profundidad):
		self.ancho = ancho
		self.altura = altura
		self.profundidad = profundidad

#formula
	def calcular_volumen(self):
		return self.ancho * self.altura * self.profundidad

#datos ingresados por el usuario
ancho = int(input("DIGITE EL ANCHO DEL CUBO: "))
altura = int(input("DIGITE LA ALTURA DEL CUBO: "))
profundidad = int(input("DIGITE LA PROFUNDIDAD DEL CUBO: "))

cubo1 = cubo(ancho, altura, profundidad)
print(f"EL VOLUMEN DEL CUBO ES DE : {cubo1.calcular_volumen()}")