# Comenzamos con Funciones
#mi_funcion() # No se puede llamar antes de definir a una funcion
# Definimos una funcion
def mi_funcion(): # Para identificar a la funcion utilizamos parentesis
    print('Saludos a todos los profesores y tutores de la tecnicatura')

mi_funcion() # Estamos llamando a la funcion
mi_funcion() # Se puede llamar a una funcion N cantidad de veces

# Desempaquetado de listas o list Unpacking
def show(name, lastName):
    print(name+' '+lastName)
person = ['Ezequiel', 'Flores']
show(person[0], person[1]) # Pasamos uno por uno los datos de la lista a la funcion
show(*person) # Esto es lo mismo  que lo anterior pero le pasamos todo junto
person2 = ("Gianella", "Achetoni") # Desempaquetamos a traves de una tupla
show(*person2)
person3 = {"lastName": "Pagano", "name": "Jessica"}
show(**person3)

numbers = [1, 2, 3, 4, 5]
for n in numbers:
    print(n)
    if n == 3:
        break # Esta es la unica manera para que no se ejecute el else
else:
    print('Esto se termino')

# List comprehension, lista de comprension
names = ['Paolo','Gianella', "Jessica", 'Pablo']
alongP = [p for p in names if p[0] == 'P'] # esto regresa una nueva lista
print(alongP)

bottleC = [{"name": "Quilmes", "country": "Arg"},
           {"Name": "Corona", "country": "Mex"},
           {"name": "Stella Artois", "country": "Belgium"},
           ]
Arg = [b for b in bottleC if b["country"] == "Arg"]
print(Arg)
print(bottleC)

# Paso de argumentos (Funciones)
def mi_funcion2(name, lastName):
    print("Saludos a todos lo que vean a traves del canal de YouTube")
    print(f'Nombre: {name}, Apellido: {lastName}')
mi_funcion2('Ezequiel', 'Flores')
mi_funcion2('Gianella', 'Achetoni')
mi_funcion2('Jessica', 'Pagano')

# La palabra return en funciones
# Creamos una funcion para sumar
def sumar(a, b):
    return a + b
#resultado = sumar(78, 22)
# print(f'El resultado de la suma es: {resultado}')
print(f'El resultado de la suma es: {sumar(55, 45)}')

def sumar2(a = 0, b = 0): # Le damos un valor por default
    return a + b
resultado = sumar2()
print(f'Resultado de la suma: {resultado}')
print(f'Resultado de la suma: {sumar2(22, 66)}')

# Argumentos, variables en funciones
def listarNombres(*nombres): # Normalmente se utiliza: *args
    for nombre in nombres: # Se va a convertir en una tupla
        print(nombre)
listarNombres('Gianella', 'Jessica', 'Aldana', 'Ezequiel', 'Matias')
listarNombres('Sofia', 'Pablo', 'Claudio', 'Pedro', 'Juan')

def listarTerminos(**terminos): # Lo mas utilizado es **kwargs para recibir los argumentos
    for llave, valor in terminos.items(): # kwargs significa: Key Word Argument
        print(f'{llave} : {valor}')

listarTerminos() # No recibe nada, nada se va a mostrar
listarTerminos(IDE='Integrated Develoment Enviroment', PK='Primary Key')
listarTerminos(Nombre='Leonel Messi')

def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres2 = ['Tito', 'Pedro', 'Carlos']
desplegarNombres(nombres2)
desplegarNombres('Carla')
# desplegarNombres(10) # No es un objeto iterable
desplegarNombres((10, 11)) # La convertimos a una tupla, en un solo elemento no olvidar la coma
desplegarNombres([22, 55]) # La convertimos en una lista

# Funciones Recursivas
def factorial(numero):
    if numero == 1: # Caso base
        return 1
    else:
        return numero * factorial(numero-1) # Caso Recursivo
numeroFactorial = int(input('Digite el numero para calcular el factorial: '))
resultado = factorial(5) # Lo hacemos en codigo duro
print(f'El factorial del numero 5 es: {resultado}')

