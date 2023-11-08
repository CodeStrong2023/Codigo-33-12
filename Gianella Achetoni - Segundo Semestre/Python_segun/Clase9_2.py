
class Cubo :
    def __init__(self, ancho, altura, profundidad):
        self.ancho = ancho
        self.altura = altura
        self.profundidad = profundidad 
    def volumen(self):
        return self.ancho * self.altura * self.profundidad
print ("ingrese la ancho del cubo: ")
b = input()
anch = int (b)
print ("ingrese la altura del cubo: ")
a = input()
altu = int (a)
print ("ingrese la profundidad del cubo: ")
p = input()
profun = int (p)
cubo1 = Cubo(anch, altu, profun)
print (f'EL volumen del cubo es: {cubo1.volumen()}')
