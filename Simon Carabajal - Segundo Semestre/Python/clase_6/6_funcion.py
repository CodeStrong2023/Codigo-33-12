
#   Paso de Argumentos (funciones)

def funcion2(name, lastName):
    print(f'Nombre: {name}, Apellido: {lastName}')
    print("Se ha subscripto\n")

funcion2('Simon', 'Carabajal')
funcion2('Raul', 'Gonzales')
funcion2('Mariana', 'Martinez')


#   Return en funciones
# Hay dos opciones para tener el resultado, asignarlo a una variable o usar return
def sumar1(a, b):
    return a + b
resultado = sumar1(34, 76) #Acá se ingresan los numeros a sumar
print(f'El resultado de la suma es {resultado}')
# print(f'El resultado de la suma es {sumar1(55, 12)}')

#   Valores por Default en Argumentos

def sumar2(a = 0, b = 0): # Se agrega un valor por default
# def sumar2(a, b): Al no tener valor por default va a dar un error
    return a + b
resultado = sumar2() # sin argumentos
print(f'El resultado de la suma es {resultado}')
print(f'El resultado de la suma es {sumar2(5, 2)}') # con argumentos

# Argumentos, Variables en Funciones

def listaNombres(*nombres): # Al no saber cuantos datos se van a ingresar --> sintaxis *args
    for nombres in nombres: # Se convierte en una tupla
        print(nombres)
listaNombres('Lucas', 'Emiliano', 'Rosa') # Se ingresan como argumentos
listaNombres('Mia', 'Julia') # Se pueden agregan más elementos después