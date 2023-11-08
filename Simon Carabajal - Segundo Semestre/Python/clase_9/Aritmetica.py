class Aritmetica:

    def __init__(self, operandoA, operandoB):
        self.operandoA = operandoA
        self.operandoB = operandoB
    
    # Método -> Sumar
    def sumar(self):
        return self.operandoA + self.operandoB
    
aritmetica1 = Aritmetica(7, 9) # Ingresamos los argumentos
print(f'La suma de {operandoA} y {operandoB} {aritmetica1.sumar()}')
