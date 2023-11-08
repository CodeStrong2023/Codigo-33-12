# LISTAS: PARTE 1

# Listas: conjuntos de elementos marcados con un indice que comienza en 0
# Las listas son modificables/mutables.
# Ej:  Nombres; Ana, José, Paola, Juán
#               0  , 1   , 2    , 3 
# Listas: Ordenadas, Mutables.

nombres = ['Adriana', 'Agustin', 'Gustavo', 'Juán']
# Acceder a todos los elementos de la lista
print(nombres)
# Acceder a un elemento en concreto
print(nombres[0])
# Último elemento sin saber cual es su indice
print(nombres[-1])

# LISTAS: PARTE 2

print(nombres[0:2]) # desde la posicion 0 a la posicion 2 (sin incluirla)

print(nombres[ :3]) # desde el inicio a un indice 

print(nombres[1: ]) # desde un indice hasta el final

# MODIFICAR UN VALOR
nombres[3] = 'Maríana'
print(nombres)

#  ITERAR UNA LISTA

for nombre in nombres:
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')


# LISTAS: PARTE 3

# Saber cuantos elementos hay en la lista
print(len(nombres)) # len -> funcion que devuelve la cantidad de elementos en la lista, siempre que se le de un parametro.

# Agregar elementos a la lista
nombres.append('Marcelo')
print(nombres)

# Insertar un elemento en un indice especifico
nombres.insert(1, 'Marisa')

nombres.insert(4, 'Facundo')
print(nombres)

# Eliminar un elemento de la lista
nombres.remove('Paula')
print(nombres)

# Eliminar el último elemento de la lista
nombres.pop()
print(nombres)

# Eliminar un indice específico
del nombres[3]

# Eliminar los elementos de la lista
nombres.clear()
print(nombres)

# Eliminar la lista

del nombres
print(nombres)