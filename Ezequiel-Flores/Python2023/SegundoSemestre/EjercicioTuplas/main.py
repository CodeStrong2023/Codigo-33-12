#DEFINIR UNA TUPLA
import math

print("Definir una tupla")
cocina = ("cuchara", "cuchillo", "tenedor")
print(cocina)
print()

#CANTIDAD DE ELEMENTOS DE LA TUPLA
print("la cantidad de elementos")
print(len(cocina))
print()

#ACCEDER A UN ELEMENTO DE LA TUPLA
print(cocina[1])
print()

#ACCERDER DE MANERA INVERSA
print("ultimo elemento ubicado en la tupla")
print(cocina[-1])
print()

#ACCEDER A UN RANGO
print(cocina[0:1])
print(cocina[0:2])

#EJEMPLO
verdura = ("papa",) #SE NECESITA LA COMA PARA QUE SEA UNA TUPLA
#DE LO CONTRARIO SOLO SERIA UN TIPO STRING(CADENA)

print()

#RECORRER LOS ELEMENTOS DE LA TUPLA
for cocinar in cocina:
    print(cocinar, end=' ') #Usa los saltos de linea para negar eso se usa el end=''
print()

#NO SE PUEDE AGREGAR ELEMENTOS (MODIFICACIONES) A LA TUPLA ENTONCES SE GENERA UNA CONVERSION DEL MISMO
#MODIFICAR DE TUPLA A LISTA a LISTA A TUPLA
#NO ES BUENA PRACTICA HACER ESTE TIPO DE CONVERSIONES.
cocinaLista = list(cocina)
cocinaLista[0] = "Vaso"
cocina = tuple(cocinaLista)
print('\n', cocina)
print()

"""
#ELIMINAR LA TUPLA
del cocina
print(cocina)
"""

#EJERCICIO DE TUPLA
#DADA LA SIGUIENTE TUPLA
tupla = (13, 1, 8, 3, 2, 5, 8)
#definimos la tupla
#crear una lista que solo incluya los numeros menores a 5 e imprima por consola [1, 3, 2]

lista = [] #SE DEFINE LA LISTA Y SE FILTRA LOS ELEMENTOS MENORES A 5 DE LA TUPLA
for elementos in tupla:
    if elementos < 5:
        lista.append(elementos)
print(lista)

# Ejercicio de matematicas
# para sacar la raiz cuadrada de un numero positivo
numero = int(input("Digite un numero positivo: "))
while numero < 0:
    print("Error -> Deberia ser un numero positivo")
    numero = int(input("Digite un numero positivo: "))
print(f'\nSu raiz cuadrada es: {math.sqrt(numero):.2f}')

# Tipo set
planetas = {'Marte','Jupiter', 'Venus'}
print(len(planetas)) # Usamos la funcion len = lenght significa largo

#Revisar si un elemento existe dentro de set
print('Marte' in planetas)

# Agregar un elemento
planetas.add('Tierra') #add es una funcion para agregar
print(planetas)

#Eliminar elementos, puede arrojar un error si el elemento no existe
planetas.remove('Jupiter') # Esta funcion ante un mal ingreso u inexistencia del elemento da error
print(planetas)
planetas.discard('Tierra')# Esta funcion no nos presenta ningun error
print(planetas)

# Limpiar set o conjunto
planetas.clear()
print(planetas)

# Eliminar set o conjunto
del planetas
#print(planetas) # al eliminar nos muestra fun error

# 'Maradona':10 Un diccionario esta compuesto por dos elementos
# UNA LLAVE Y UN VALOR
# dict(key,value)
diccionario ={
    'IDE':'Integrated Development Environment',
    'POO':'Programacion Orientada a Objetos',
    'SABD':'Sistema de Administracion de Base de Datos'
}
# Verificar la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

# Acceder a un diccionario con la llave(key)
print(diccionario['IDE'])

# Otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificamos elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Como recorrer los elementos
for termino in diccionario: # Recorrer mostrando solo las llaves
    print(termino)

# Necesitamos una funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de acceder a un diccionario
for termino in diccionario.keys(): # Estamos usando una funcion
    print(termino) # Muestra solo las llaves

for valor in diccionario.values(): # Usamos una funcion para acceder al valor
    print(valor)

# Comprobar la existencia de algun elemento
print('IDE' in diccionario) # Devuelve un booleano

# Agregar un elemento
diccionario['PK'] = 'Primary Key'
print(diccionario)

# Eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
del diccionario # Elimina el diccionario

# Concatenamos  listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1+lista2 # Concatenamos
print(lista3)

lista3.extend([7, 8, 9, 1]) # Funcion para agregar varios elementos a una lista
print(lista3)

print(lista3.index(5)) # Funcion para ubicar en que indice esta el valor ingresado
# print(lista3.index(0)) # Esto daria un error por no ser el elemento parte de la lista

# Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(1)) # Cuenta cuantos valores iguales hay dentro de la lista

# Para poner nuestra lista al reves
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

# Metodos de ordenamiento
lista3.sort() # Ordena los elementos ascendentemente
print(lista3)
lista3.sort(reverse=True)
print(lista3)

tupla = (4, 'Hola', 6.78, [1, 2 , 78], 4, 'Hola') # Puede tener diferentes tipos de datos dentro
print(tupla)

print(4 in tupla) # Accion Booleana, su respuesta es de tipo booleana
# Lo que podemos usar dentro de la tupla son: index, count, lent
# En tuplas se puede convertir de tupla a lista y de lista a tupla

# Repaso de set o conjunto
# para definir un conjunto
conjunto2 = set()
conjunto1 = {'Bye', }
conjunto2.add(7)
conjunto2.add('Hola')
print(conjunto2)
conjunto1.add('hola')
print(conjunto1)
print(3 not in conjunto1) # Preguntamos si el numero 3 NO esta en el conjunto1

# Como hacer la igualdad de dos conjuntos
print(conjunto1 == conjunto2) # Nos devuelve como respuesta un booleano

# Operaciones en conjunto
conjunto3 = conjunto1 | conjunto2 # La linea une los dos conjuntos
print(conjunto3)

conjunto3 = conjunto1 & conjunto2 # Que elemento tienen en comun
print(conjunto3)

conjunto3 = conjunto1 - conjunto2 # Asigna el valor que esta en el conjunto1 y no en el conjunto2
print(conjunto3)

conjunto3 = conjunto2 - conjunto1
print(conjunto3)

conjunto3 = conjunto1 ^ conjunto2 # elementos que no comparten o que son diferentes entre ambos
print(conjunto3)

conjunto3 = conjunto1 | conjunto2
print(conjunto2.issubset(conjunto3)) # Aqui preguntamos si un conjunto es un subconjunto dentro de otro
print(conjunto1.issubset(conjunto3))
print(conjunto3.issubset(conjunto1))
print(conjunto3.issubset(conjunto2))

print(conjunto3.issuperset(conjunto1)) # Preguntamos si los elementos del conjunto1 estan dentro del 3
print(conjunto3.issuperset(conjunto2)) # Si es verdadero quiere decir que el conjunto3 es un superconjunto
print(conjunto2.issuperset(conjunto3))

# Como saber si ambos conjuntos son disconexos, esto es si no comparten elementos en comun
print(conjunto1.isdisjoint(conjunto2)) #No hay cosas en comun

# Convertir un conjunto totalmente en inmutable
conjunto1 = frozenset # Esto hace que el conjunto sea totalmente inmutable
#No se puede agregar, modificar ni eliminar elementos del conjunto

# Repaso Diccionarios
diccionarioNuevo = {'Azul': 'Blue', 'Rojo': 'Red', 'Verde': 'Green', 'Amarillo': 'Yellow'}
print(diccionarioNuevo)

# Como eliminar
del (diccionarioNuevo['Azul'])
print(diccionarioNuevo)

# Los diccionarios pueden almacenar diferentes tipos de datos
diccionario2 = {'Ezequiel': {'Edad': 35, 'Altura': 1.83}, 'Jacinto':[45, 1.85], 'Gianella': [45, 1.67]}
print(diccionario2)

seleccionArgentina = {
    10: {'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio': '50 Millones', 'Posicion': 'Extremo derecho'},
    11: {'Nombre': 'Angel Di Maria', 'Edad': 34, 'Altura': 1.80, 'Precio': '12 Millones', 'Posicion': 'Extremo derecho'},
    21: {'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio': '35 Millones', 'Posicion': 'Media Punta'},
    19: {'Nombre': 'Nicolas Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio': '3.5 Millones', 'Posicion': 'Defensa Central'},
    1: {'Nombre': 'Franco Armani', 'Edad': 37, 'Altura': 1.89, 'Precio': '3.5 Millones', 'Posicion': 'Arquero'},
    22: {'Nombre': 'Lautaro Martinez', 'Edad': 26, 'Altura': 1.75, 'Precio': '30 Millones', 'Posicion': 'Delantero'},
    9: {'Nombre': 'Julian Alvarez', 'Edad': 23, 'Altura': 1.81, 'Precio': '40 Millones', 'Posicion': 'Delantero'},
    16: {'Nombre': 'Thiago Almada', 'Edad': 22, 'Altura': 1.84, 'Precio': '25 Millones', 'Posicion': 'Medio Campo'},
    15: {'Nombre': 'Rodrigo De Paul', 'Edad': 35, 'Altura': 1.88, 'Precio': '10 Millones', 'Posicion': 'Medio Campo'}
}
for llaves in seleccionArgentina.items():
    print(llaves, valor)

# Como tarea agregar por lo menos 4 jugadores mas al diccionario: seleccionArgentina
print('Tenemos cargados en el diccionario la cantidad de jugadores: ', end=' ')
print(len(seleccionArgentina))

# Pilas usando listas
pila = [1, 2, 3]

# Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

# Sacando elementos desde el final
elementoBorrado =pila.pop() # Quita el ultimo elemento y la guarda en la variable
print(f'Sacamos el elemento {elementoBorrado}')
print(f'La pila ahora que asi: {pila}')

# Colas con listas
# Estructura de datos de tipo fifo (first input / first output)
cola = ['Ezequiel', 'Gianella', 'Jacinto', 'Lucia']

# Agregamos elementos al final de la cola
cola.append('Jessica')
cola.append('Pablo')
print(cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

seRetira = cola.pop(0)
print(f'Atendido el cliente: {seRetira}')
print(cola)

#Seguimos mostrando como recorrer un diccionario con el ciclo for
for i in seleccionArgentina:
    print(f'{i} -> {seleccionArgentina}')