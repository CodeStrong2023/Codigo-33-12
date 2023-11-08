class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalles(self):
        print(f'Datos: {self._nombre} {self._apellido}{self._edad}')

    @property  # Decorador
    def nombre(self):
        print("Metodo Getter")
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):
        print("Metodo Setter")
        self._nombre = nombre

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property
    def edad(self):
        return self._edad

    @edad.setter
    def edad(self, edad):
        self._edad = edad

    def __del__(self):
        print(f'Datos: {self._nombre} {self._apellido}{self._edad}')


if __name__ == '__main__':
    usuario1 = Persona2("Julia ", "Deloredo ", 50)
    print(usuario1.nombre)

    usuario1.nombre = "Pedro "
    print(usuario1.nombre)

    print(usuario1.mostrar_detalles())

    # Tarea

    usuario2 = Persona2("Sofia ", "Lopez ", 26)
    print(usuario2.nombre)

    usuario2.nombre = "Sofia "   
    usuario2.apellido = "Lopez "
    usuario2.edad = 26
    print(usuario2.mostrar_detalles())


    usuario3 = Persona2("Nicolas ", "Gian ", 27)
    print(usuario3.nombre)

    usuario3.nombre = "Nicolas "
    usuario3.apellido = "Gian "
    usuario3.edad = 27
    print(usuario3.mostrar_detalles())


    usuario4 = Persona2("Nadia ", "Roli ", 42)
    print(usuario4.nombre)

    usuario4.nombre = "Nadia "
    usuario4.apellido = "Roli "
    usuario4.edad = 34
    print(usuario4.mostrar_detalles())

    print(__name__)