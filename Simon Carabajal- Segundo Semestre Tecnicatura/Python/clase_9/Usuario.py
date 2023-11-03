# Crear atributos desde un objeto

class Usuario:
    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs): # Init Dunter
        self.nombre =  nombre   
        self.apellido = apellido
        self._dni = dni # Se encapsula con un guión bajo, no se usa en python
        self.edad = edad
        self.args = args # Argumentos tipo tupla
        self.kwargs = kwargs # Argumentos tipo diccionario
        # Todos los atributos son publicos

    def mostrar_detalle(self):
        print(f'La clase Usuario tiene los siguientes datos: {self.nombre}, {self.apellido}, {self._dni}, {self.edad}')
        print(f'La direccion es: {self.args}')
        print(f'Los datos importantes son: {self.kwargs}')

usuario1 = Usuario('Juana', 'Fernandez', 45927583 , 23) 
print(f'Objeto 1 de la clase es -> {usuario1.nombre} {usuario1.apellido} de {usuario1.edad} años')

usuario2 = Usuario('Josefina', 'Ramos',25895734, 56)
print(f'Objeto 2 de la clase es -> {usuario2.nombre} {usuario2.apellido} de {usuario2.edad} años')

usuario1.nombre = 'Federico'
usuario1.apellido = 'Gomez'
usuario1.edad = 64
print(f'Objeto 1 (modificado) de la clase es -> {usuario1.nombre} {usuario1.apellido} de {usuario1.edad} años')

print('Mostrar detalle')
usuario1.mostrar_detalle()
usuario2.mostrar_detalle()

# Este atributo solo va a poder usarlo el objeto usuario1
usuario1.telefono = "2837497686"
print(f' Este es el telefono de {usuario1.nombre}: {usuario1.telefono}')

# print(persona.telefono) -> dara un error

usuario3 = Usuario('Marina', 'Romero', 45678424, 21, 'Telefono: ', '0123456789', 'Calle Sauces', 243, Altura=1.56, Peso=105, ColorFavorito='Azul')
usuario3.mostrar_detalle()

usuario4 = Usuario('Fernando', 'Cristaldo', 52749573, 56, 'Telefono: ', '1234567890', 'Calle Roble', 864, Altura=1.76, Peso=117, ColorFavorito='Verde')
usuario4.mostrar_detalle()

print(usuario4._dni)