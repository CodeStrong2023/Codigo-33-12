#Argumentos variables para un diccionario

#Definir la funcion
def terminos(**datos): # Parámetro para recibir un diccionario  -->  **kwargs -->
    for llave, valor in datos.items():
        print(f'{llave} : {valor}')

#Comprobación
terminos() # Vacío
terminos(kwargs = 'Key Word Argument') # Con valor
# terminos(10 = 'Messi') --> no va a aceptar el número
terminos(nombre='Messi')

#Lista de elementos con funciones (convertir)

#Definir la funcion
def usuarios(nombres): # Lista
    for nombre in nombres:
        print(nombre)

nombres2 = ['Ana', 'Juana', 'Martin']
usuarios(nombres2)
#usuarios('Carla') va a mostrar los caracteres separados
#usuarios(10) ERROR porque no es un objeto iterable, se debe convertir a tupla iterable
usuarios((10, 11)) #Se convierte en tupla
usuarios([22, 23]) #Se convierte en lista

#Funciones recursivas
def factorial(numero):
    if numero == 1: # Caso base
        return 1
    else:           # Caso recursivo
        return numero * factorial(numero-1)

'''
# Comprobación con codigo duro
resultado = factorial(5)
print(f'El factorial de 5 es {resultado}')
'''
#Comprobar con datos del usuario
numero = int(input('Ingresa el número para calcular su factorial: '))

if numero < 0:
    print('Ingresa un número mayor a 0')
else:
    resultado = factorial(numero)
    print(f'El factorial de {numero} es {resultado}')