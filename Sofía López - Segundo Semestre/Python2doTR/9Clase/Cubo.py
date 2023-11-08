"""
Crear la clase Cubo con los atributos, ancho, alto y profundidad, con
un método calcular_ volumen que tendrá la formula:
volumen = ancho * altura * profundidad
que el usuario ingrese los valores.
"""

class Cubo:
    def __init__(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad

    def calcular_volumen(self):
        return self.ancho * self.altura * self.profundidad

print('\nVolumen de un cubo:\n')    

altura = int(input("Ingrese en centimetros la altura: "))
ancho = int(input("Ingrese en centimetros el ancho: "))
profundidad = int(input("Ingrese en centimetros la profundidad: "))

volumen = Cubo(ancho, altura, profundidad)

print(f'\n-> El volumen del cubo es de {volumen.calcular_volumen()} centimetros cubicos')