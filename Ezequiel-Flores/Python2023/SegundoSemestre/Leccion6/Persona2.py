class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad

    def mostrar_detalle(self):
        print(f'Los datos a mostrar son los siguientes: {self._nombre} {self._apellido} {self._edad}')

    @property  # Decorador
    def nombre(self):  # Metodo Getter
        print('Estamos utilizando el metodo Get')
        return self._nombre

    @nombre.setter
    def nombre(self, nombre):  # Metodo Setter
        print('Estamos utilizando el metodo Set')
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
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')

if __name__ == '__main__':
    persona1 = Persona2('Ezequiel', 'Flores', 35)
    print(persona1._nombre)  # Llamamos al metodo Getter
    persona1.nombre = 'Juan Perez' # Llamamos el metodo Setter
    print(persona1.nombre) # otra vez con el metodo Setter
    print(persona1.mostrar_detalle()) # Llamamos al metodo mostrar detalles
    # Atributo read_only seria la edad porque no tiene el metodo Set
    print(persona1.edad)
    # Tarea crear 3 objetos mas utilizando los metodos Getter and Setter
    # para modificar, y mostrar los cambios con el metodo mostrar detalles

    # Objeto numero 1 de la tarea
    persona2= Persona2('Giane', 'Ache', 22)
    print(persona2.nombre)
    print(persona2.apellido)
    print(persona2.edad)
    persona2.nombre = 'Gianella'
    persona2.apellido = 'Achetoni'
    persona2.edad = 18
    print(persona2.mostrar_detalle())

    # Objeto numero 2 de la tarea
    persona3 = Persona2('Jessi', 'Paga', 28)
    print(persona3.nombre)
    print(persona3.apellido)
    print(persona3.edad)
    persona3.nombre = 'Jessica'
    persona3.apellido = 'Pagano'
    persona3.edad = 30
    print(persona3.mostrar_detalle())

    # Objeto numero 3 de la tarea
    persona4 = Persona2('Richard', 'For', 45)
    print(persona4.nombre)
    print(persona4.apellido)
    print(persona4.edad)
    persona4.nombre = 'Ricardo'
    persona4.apellido = 'Fort'
    persona4.edad = 50
    print(persona4.mostrar_detalle())

    print(__name__)