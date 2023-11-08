# Listas
nombres = ['Naty', 'Osvaldo', 'Lily', 'Ariel']
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[0:2])  # Solo muestra el indice 0, 1 pero no el indice 2
# ir del inicio de la lista al indice (sin incluirlo)
print(nombres[:3])  # Indices a mostrar 0,1,2
# Desde el indice indicado hasta el final
print(nombres[1:])
# Modificar un valor
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)
# Iterar una lista
for nombre in nombres:
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

# Preguntanos cuantos elementos tiene
print(len(nombres))  # le pasamos como parametro la lista

# Agregar un elemento
nombres.append('Marcelo')
nombres.append([1, 2, 3])
nombres.append(True)
nombres.append(10.45)
nombres.append(4.5)
nombres.append(7)
print(nombres)

# Insertar un elemento en un indice especifico
nombres.insert(1, 'Alberto')
print(nombres)
nombres.insert(3, 'Debora')
print(nombres)

# Eliminamos un elemento
nombres.remove('Alberto')
print(nombres)

# Eliminar el último elemento
nombres.pop()
print(nombres)

# Eliminar un indice especifico
del nombres[2]
print(nombres)

# Eliminar la lista
del nombres
# print(nombres) #Error

# Definir tupla
cocina = ('cuchara', 'cuchillo', 'tenedor')
print(len(cocina))

# Acceder a un elemento, se utiliza corchete no parentesis
print(cocina[0])
# Mostrar de manera inversa
print(cocina[-1])

# Acceder a un rango
print(cocina[0:2])

# Ejemplo
verduras = ('papas',)  # Una tupla necesita coma aunque sea un elemento
# de lo contrario seria un tipo str cadena

# Recorrer los elementos de una tupla
for cocinar in cocina:  # print esta usando \n para saltos de linea
    print(cocinar, end=' ')  # Usamos end= para eliminar los saltos de lineas

cocinaLista = list(cocina)
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

# del cocina

# Tipo set
planetas = {'Marte', 'Júpiter', 'Venus'}
print(len(planetas))

# Revisar si un elemento existe dentro de set( no se pueden repetir elementos)
print('Júpiter' in planetas)

# Agregar un elemento
planetas.add('Tierra')  # Add es una función
print(planetas)

# Eliminar elementos, arroja error si el elemento no existe
planetas.remove('Júpiter')
print(planetas)
# No da error si no existe
planetas.discard('Tierra')
print(planetas)

# Limpiar set
planetas.clear()
print(planetas)

# Eliminar set/conjunto
# del planetas
# print(planetas)

# 'Maradona':10 Un diccionario esta compuesto por dos elementos
# Una LLAVE Y UN VALOR
# dict(key,value)
diccionario = {
    'IDE': 'Integrated Development Enviroment',
    'POO': 'Programacion Orientada a Objetos',
    'SABD': 'Sistema de Administración de Base de Datos'
}
# Verificar la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

# Acceder a un diccionaarion con la llave(key)
print(diccionario['IDE'])

# Otra forma de recuperar un elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificamos elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Como recorrer los elementos
for termino in diccionario:  # Recorremos mostrando solo las llaves
    print(termino)

# Necesitamos una función para recorrer in diccionario
for termino, valor in diccionario.items():
    print(termino, valor)

# Otras maneras de accedr a un diccionario
for termino in diccionario.keys():
    print(termino)  # Muestra solo las llaves

for valor in diccionario.values():  # Usamos una función para acceder al valor
    print(valor)

# Comprobar la existencia de algun elementos
print('IDE' in diccionario)  # Devuelve booleano

# Agregar un elemento
diccionario['PK'] = 'Primary key'
print(diccionario)

# Eliminar un elemento
diccionario.pop('SABD')
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
# del diccionario

# Concatenamos listas
lista1 = [1, 2, 3, 1]
lista2 = [4, 5, 6, 1]
lista3 = lista1 + lista2  # Concatenamos
print(lista3)

lista3.extend([7, 8, 9])  # Función para agregar varios elementos a una lista
print(lista3)

print(lista3.index(5))  # Función para ubicar en que indice esta el valor ingresado

# Como saber cuantos valores repetidos hay dentro de una lista
print(lista3.count(1))  # Cuenta cuantos valores iguales hay dentro de la lista

# Para poner al reves una lista
lista3.reverse()
print(lista3)

# Para que una lista se multiplique repitiendo sus elementos
lista3 = lista3 * 2
print(lista3)

# Metodos de ordenamiento, en Python es una funcion
lista3.sort()  # ascendente
print(lista3)
lista3.sort(reverse=True)  # descendente
print(lista3)

# Repaso tuplas
tupla = (4, 'Hola', 6, 78, [1, 2, 78], 4, 'Hola')  # Diferentes tipos de datos dentro
print(tupla)

print(4 in tupla)  # Accion booleana
