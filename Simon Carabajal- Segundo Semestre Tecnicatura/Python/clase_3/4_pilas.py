
# Método de lista - pilas
# Como en una pila de objetos, solo se puede trabajar con el último elemento.

pila = [1, 2]
print('Pila original: ', pila)

# Agregar elementos
pila.append(3)
pila.append(4)
print('Pila con elementos agregados: ', pila)

# Sacar elementos
pila.pop()
print('Pila con un elemento menos: ', pila)

# Sacar elemento y guardarlo
elementoBorrado = pila.pop()
print(f'Se quito el elemento {elementoBorrado}')
print(f'La pila ahora es: {pila}')
