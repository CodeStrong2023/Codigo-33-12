
class Clase10_1 :
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad
        
    def mostrardetalle(self):
        print(f'Los datos a mostrar son: {self._nombre}, {self._apellido}, {self._edad} ')
        
    @property
    def nombre(self):
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre):
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
        print(f'Persona2: {self._nombre}, {self._apellido}, {self._edad}')
        
if __name__ == "__main__":
    Persona1 = Clase10_1 ("Gianella","Achetoni", 18)
    print(Persona1.nombre)
    Persona1.nombre = "Juan Carlos"
    print(Persona1.nombre)
    print(Persona1.apellido)
    print(Persona1.edad)
    Persona1.mostrardetalle()

    Persona2 = Clase10_1("Ana","Martinez",46) 
    print(Persona2.nombre)
    print(Persona2.apellido)
    print(Persona2.edad)
    Persona2.nombre = "Claudia"
    Persona2.apellido = "López"
    Persona2.edad = 38
    Persona2.mostrardetalle()
    Persona3 = Clase10_1("Andres","Mesi",49)
    print(Persona3.nombre)
    print(Persona3.apellido)
    print(Persona3.edad)
    Persona3.nombre = "Lionel"
    Persona3.apellido = "Messi"
    Persona3.edad = 37
    Persona3.mostrardetalle()

    Persona4 = Clase10_1("Lautaro","Lopez",48)
    print(Persona4.nombre)
    print(Persona4.apellido)
    print(Persona4.edad)
    Persona4.nombre = "Emiliano"
    Persona4.apellido = "Martinez"
    Persona4.edad = 32
    Persona4.mostrardetalle()
    print(__name__)


    
    
    
    
    
    
    
    


