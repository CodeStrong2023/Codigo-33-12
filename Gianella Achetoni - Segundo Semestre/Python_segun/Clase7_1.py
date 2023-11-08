
def multiplicar(*args):
    resultado = 1
    for valor in args:
        resultado = resultado * valor
    return resultado
print (multiplicar(2, 10, 3))
