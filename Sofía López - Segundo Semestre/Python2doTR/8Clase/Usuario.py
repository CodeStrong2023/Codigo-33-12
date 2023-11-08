#Crear una clase
class Usuario:
    #Metodo
    def __init__(self, nombre, apellido, edad):
        '''
        # Atributos dentro del metodo con codigo duro
        self.nombre = 'Juan'   
        self.apellido = 'Lopez'
        self.edad = 22 
        '''
        self.nombre =  nombre   
        self.apellido = apellido
        self.edad = edad

    def mostrar_detalle(self):
        print(f'Usuario: {self.nombre} {self.apellido} {self.edad}')

#Crear objeto

# usuario1 = Usuario() # Los parentesisi queda vacios, la clase se llama indirectamente
usuario1 = Usuario('Juana', 'Fernandez', 23) 
print(f'Objeto 1 de la clase es --> {usuario1.nombre} {usuario1.apellido} de {usuario1.edad} años')

#Crear segundo objeto
usuario2 = Usuario('Josefina', 'Ramos', 56)
print(f'Objeto 2 de la clase es --> {usuario2.nombre} {usuario2.apellido} de {usuario2.edad} años')

#Modificar atributos
usuario1.nombre = 'Federico'
usuario1.apellido = 'Gomez'
usuario1.edad = 64
print(f'Objeto 1 (modificado) de la clase es --> {usuario1.nombre} {usuario1.apellido} de {usuario1.edad} años')

print('Mostrar detalle')
usuario1.mostrar_detalle()
usuario2.mostrar_detalle()
