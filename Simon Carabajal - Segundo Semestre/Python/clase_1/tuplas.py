# Las tuplas son similares a las listas, pero son inmutables.
# Tuplas: Ordenadas, inmutables.

bebidas = ('jugo','agua','vino','licor','gaseosa')
print('Elementos de la tupla')
print(bebidas,'\n')

print('Cantidad de elementos de la tupla')
print(len(bebidas),'\n')

print('Acceder a un elemento')
print(bebidas[0],'\n')

print('Acceder a un elemento a la inversa')
print(bebidas[-1],'\n')

print('Acceder a un rango')
print(bebidas[0:3],'\n')

print('Recorrer los elementos de la tupla (Con salto de linea)')
for bebida in bebidas:
    print(bebida)

print('\n','Recorrer los elementos de la tupla (Sin salto de linea)')
for bebida in bebidas:
    print(bebida, end=' ')

# Modificar una tupla: no se debe hacer a menos que no halla otra opción.
# se debe convertir la tupla en lista y nuevamente a tupla.

print('\n','Modificar una tupla')
bebidasLista = list(bebidas)
bebidasLista[0] = 'café'
bebidas = tuple(bebidasLista)
print('\n',bebidas)

# del bebidas -> elimina la tupla