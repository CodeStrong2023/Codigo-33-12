class Vehiculo:
    
    '''
    Definir una clase padre Llamada Vehiculo y dos clases hijas lLamadas
    Auto y Bicicleta, las cuales heredan de la clase padre Vehicule. 
    La clase padre debe tener los siguientes atributos y métodos:
    
    Vehicule (clase padre)
        Atributos(color, ruedas)
        Métodos (__init__(color, ruedas) y __str__())

    Auto(clase hija de Vehiculo)
        Atributos(velocidad (km/hr))
        Métodos (__init_(color, ruedas, velocidad) y __str__())

    Bicicleta(clase hija de Vehicule)
        Atributos (tipe(urbana/montaña/etc.)
        Métodos (__init__(color, ruedas, tipe) y _str_()
        
    Crear un objete de cada clase
    '''

    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas

    def __str__(self):
        return 'Color: ' + self.color + 'Ruedas: ' + str(self.ruedas)
    

class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super(). __init__(color, ruedas)
        self.velocidad = velocidad
            
    def __str__(self):
        return super().__str__()+', Velocidad(km/hr): ' + self.velocidad


class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo
    
    def __str__(self):
        return super().__str__()+', Tipo: '+self.tipo

vehiculo = Vehiculo('rojo', 4)
print(vehiculo)
        
auto = Vehiculo('verde', 4, 120)
print(auto)

bicicleta = Bicicleta('amarillo', 2, 'Urbana')
print(bicicleta)