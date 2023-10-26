"""
Crear una clase llamada Rectangulo, debe tenér 2 atributos: altura y base
el nombre del método será 'calcular_area' utilizando la formula:
area = base * altura. Pero la base y la altura deben ser ingresadas por
el usuario y los objetos deben ser tres.
"""

class Rectangulo:
    def __init__(self, altura, base):
        self.altura = altura
        self.base = base

    def calcular_area(self):
        return self.altura * self.base
    
print('\nÁrea de un rectangulo\n')

altura = int(input("Ingrese en centimetros la altura: "))
base = int(input("Ingrese en centimetros la base: "))

area = Rectangulo(base, altura)

print(f'\nEl area del rectangulo es de {area.calcular_area()} centimetros cuadrados')