
class Clase11_1 :
    def __init__(self, nombre, edad):
        self._nombre = nombre
        self._edad = edad
    
    @property
    def nombre(self):
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @property
    def edad(self):
        return self._edad
    
    @edad.setter
    def edad(self, edad):
        self._edad = edad
    
    def __str__(self):
        return f'Persona: [Nombre: {self._nombre}, edad: {self._edad}]'


class Empleado(Clase11_1):
    def __init__(self, nombre, edad, sueldo):
        super().__init__(nombre, edad)
        self._sueldo = sueldo
    
    @property
    def sueldo(self):
        return self._sueldo
    @sueldo.setter
    def sueldo(self,sueldo):
        self._sueldo = sueldo
        
    def __str__(self):
        return f'Empleado: [ Sueldo: {self._sueldo}] {super().__str__()}'
    
    
Empleado1 = Empleado("Gianella", 18, 100000)
print(Empleado1.nombre)
print(Empleado1.edad)
print(Empleado1.sueldo)
Empleado2 = Empleado("Raul", 40, 90)
print(Empleado2.nombre)
print(Empleado2.edad)
print(Empleado2.sueldo)
Empleado2.edad = 50
Empleado2.nombre = "José Luis"
Empleado2.sueldo = 100
print(Empleado2.nombre)
print(Empleado2.edad)
print(Empleado2.sueldo)