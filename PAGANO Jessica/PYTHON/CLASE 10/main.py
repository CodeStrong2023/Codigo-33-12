# EJERCICIO CLASE-10
# EJERCICIO 1
# TAREA: CREAR TRES OBJETOS MAS UTILIZANDO LOS METODOS GETTER AND SETTER
# PARA MODIFICAR Y MOSTRAR LOS CAMBIOS CON EL METODO MOSTRAR_DETALLES

class Persona:
    def __init__(self, nombre, apellido, edad):
            self._nombre = nombre
            self._apellido = apellido
            self._edad = edad

    def mostrar_detalles(self):
        print(f"LOS DATOS A MOSTRAR SON LOS SIGUIENTES: {self._nombre} {self._apellido} {self._edad}")

    # metodos get y setter

    @property  # getter
    def nombre(self):
        return self._nombre

    @nombre.setter  # setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property  # getter
    def apellido(self):
        return self._apellido

    @apellido.setter  # setter
    def apellido(self, apellido):
        self._apellido = apellido

    @property  # getter
    def edad(self):
        return self._edad

    @edad.setter  # setter
    def edad(self, edad):
        self._edad = edad


# objeto 1
# metodo setter
persona1 = Persona('Sabri', 'Guti', 26)
persona1.nombre = "Sabrina"
persona1.apellido = "Gutierrez"
persona1.edad = 25

# metodo get
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)

print(persona1.mostrar_detalles())

# objeto 2
# metodo setter
persona2 = Persona('Julieta', 'Glez', 26)
persona2.nombre = "Julieta"
persona2.apellido = "Gonzalez"
persona2.edad = 26

# metodo get
print(persona2.nombre)
print(persona2.apellido)
print(persona2.edad)

print(persona2.mostrar_detalles())

# objeto 3
# metodo setter
persona3 = Persona('Cin', 'Schz', 26)
persona3.nombre = "Cintia"
persona3.apellido = "Sanchez"
persona3.edad = 27

# metodo get
print(persona3.nombre)
print(persona3.apellido)
print(persona3.edad)

print(persona3.mostrar_detalles())