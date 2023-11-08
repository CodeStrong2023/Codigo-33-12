# Crear atributos desde un objeto

class Usuario:
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs): # Init Dunter
        self.nombre =  nombre   
        self.apellido = apellido
        self._dni = dni #Se encapsula con un guión bajo, no se usa en python
        self.edad = edad
        self.args = args #Argumentos tipo tupla
        self.kwargs = kwargs #Argumentos tipo diccionario
        #Todos los atributos son publicos

    def mostrar_detalle(self):
        print(f'La clase Usuario tiene los siguientes datos: {self.nombre}, {self.apellido}, {self._dni}, {self.edad}')
        print(f'La direccion es: {self.args}')
        print(f'Los datos importantes son: {self.kwargs}')
usuario1 = Usuario('Sofia', 'Lopez', 40010080 , 26) 
print(f'Objeto 1 de la clase es -> {usuario1.nombre} {usuario1.apellido} de {usuario1.edad} años')

usuario2 = Usuario('Clarita', 'Lopez',25895734, 56)
print(f'Objeto 2 de la clase es -> {usuario2.nombre} {usuario2.apellido} de {usuario2.edad} años')

usuario1.nombre = 'Cristian'
usuario1.apellido = 'Liyo'
usuario1.edad = 74
print(f'Objeto 1 (modificado) de la clase es --> {usuario1.nombre} {usuario1.apellido} de {usuario1.edad} años')   
print('Mostrar detalle')
usuario1.mostrar_detalle()
usuario2.mostrar_detalle()

#Este atributo solo va a poder usarlo el objeto usuario1
usuario1.telefono = "1134305698"
print(f' Este es el telefono de {usuario1.nombre}: {usuario1.telefono}')

# print(persona.telefono) da un error

usuario3 = Usuario('Luis', 'Sanchez', 51300456, 57, 'Telefono: ', '0123456789', 'Uriburu', 432, Altura=1.56, Peso=105, ColorFavorito='Azul')
usuario3.mostrar_detalle()

usuario4 = Usuario('Maria', 'Sanchez', 51738976, 56, 'Telefono: ', '1234567890', 'Asturias', 970, Altura=1.46, Peso=67, ColorFavorito='Rojo')
usuario4.mostrar_detalle()

print(usuario4._dni)