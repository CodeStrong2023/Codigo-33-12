
class Clase8_1:
    def __init__(self, nombre, apellido, edad):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    def mostrar_detalle(self):
        print (f'Persona: {self.nombre} {self.apellido} {self.edad} ')
persona1 = Clase8_1("Gianella","Achetoni",18)
print(f'Mi nombre es: {persona1.nombre}, Mi apellido es: {persona1.apellido} y mi edad es {persona1.edad}')
persona2 = Clase8_1("Ariel", "Bentancud", 40)
print(f'Mi profesor es: {persona2.nombre} {persona2.apellido} y su edad es {persona2.edad}')
persona1.mostrar_detalle()
persona2.mostrar_detalle()
