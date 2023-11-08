
def celsius(elemento):
    grados = (elemento - 32) *(5/9)
    print (grados)
def Fahrenheit(elemento):
    grados = (elemento * (9/5)) + 32
    print(grados)
    
print("convertidor de temperaturas")
print("Que tipos de grados va a insertar?")
print ("1 para celsius, 2 para Fahrenheit")
n = input()
num = int (n)
if num == 1:
    print("Ingrese la cantidad de grados: ")
    a = input()
    grado = int(a) 
    Fahrenheit(grado)
    
else:
    print("Ingrese la cantidad de grados: ")
    a = input()
    grado = int(a) 
    celsius(grado)
    