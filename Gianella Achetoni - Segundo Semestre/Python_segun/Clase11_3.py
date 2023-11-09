
class vehiculo:
    def __init__(self, color, ruedas):
        self.color = color
        self.ruedas = ruedas
    def __str__(self):
        return f'Vehiculo: [ Color {self.color}, Ruedas {self.ruedas}]'
    
class auto(vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self.velocidad = velocidad
        
    def __str__(self):
        return f'Auto: [ Velocidad: {self.velocidad}], {super().__str__()}'
    
class bicicleta(vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self.tipo = tipo
    
    def __str__(self):
        return f'Bicicleta: [ Tipo: {self.tipo}], {super().__str__()} '

vehiculo1 = vehiculo("Rojo", 4)
auto1 = auto("Azul", 4, 200)
bicicleta1 = bicicleta("Violeta", 2, "Montaña")
print(vehiculo1)
print(auto1)
print(bicicleta1)