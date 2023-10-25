
def sumar (*args):
    suma = 0
    for valor in args:
        suma += valor
    return suma 
print(sumar(3, 5, 6, 6))
