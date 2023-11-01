class Persona:  # Creamos una clase

    def __init__(self, nombre, apellido, dni, edad, *args, **kwargs):
        self.nombre = nombre
        self.apellido = apellido
        self._dni = dni # Este atributo esta encapsulado de una manera sugerida
        self.edad = edad
        self.args = args
        self.wkargs = kwargs

    def mostrar_detalle(self): # self es igual a this
        print(f'La clase Persona tiene los siguientes datos: {self.nombre} {self.apellido} {self._dni} {self.edad}, la direccion es: {self.args}, los datos importantes son: {self.wkargs}')


persona1 = Persona('Ezequiel', 'Flores', 12312312321, 35)  # Necesitamos enviar argumentos
# print(persona1.nombre)
# print(persona1.apellido)
# print(persona1.edad)
print(f'El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')
persona2 = Persona('Jessica', 'Pagano', 23123234, 30)
print(f'El objeto2 de la clase persona es: {persona2.nombre} {persona2.apellido} Su edad es: {persona2.edad}')

persona1.nombre = 'Gianella'
persona1.apellido = 'Achetoni'
persona1.edad = 18
print(
    f'El objeto1 modificado de la clase persona es: {persona1.nombre} {persona1.apellido} Su edad es: {persona1.edad}')

# Los atributos son: caracteristicas
# Los metodos son: el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle() # La referencia en este caso se pasa de manera automatica
persona2.mostrar_detalle()

# Persona.mostrar_detalle(persona1) # Debemos pasarle una referencia para el self sino dara error
persona1.telefono = 4444455555289
print(f' Este es el telefono de: {persona1.nombre} {persona1.telefono}') # Hemos creado un atributo de un objeto

#print(persona2.telefono) el objeto persona2 no tiene este atributo, da error
persona3 = Persona('Gianella', 'Achetoni', 213123123, 18, 'Telefono', '2131243242', 'Calle San Martin', 456, 'Manzana', 15, 'Casa', 18, Altura=1.75, Peso=50, CFavorito='Azul', Auto='Citroen', Modelo=2022)
persona3.mostrar_detalle()
#print(persona3._dni) # Esto no se debe utilizar (esta encapsulado), esto dice que lo desconocemos Python
#persona3.__nombre # Esta totalmente encapsulado






