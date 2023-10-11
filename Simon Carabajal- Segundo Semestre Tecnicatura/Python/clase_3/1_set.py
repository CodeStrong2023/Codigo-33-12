# Definir conjuntos.

# Inicializar con parentesis, si lo definimos vacío, luego se le pueden agregar más elementos.
conjuntoA = set()
conjuntoA.add(1)
conjuntoA.add('uno')
print(conjuntoA)

# Inicializar con llaves, si lo definimos vacío, no se van a poder agregar elementos después.
conjuntoB = {}
# conjuntoB.add('Esto no se va a mostrar')
conjuntoC = {2}
conjuntoC.add('dos')
print(conjuntoB)
print(conjuntoC)

print(2 not in conjuntoA)
print(2 not in conjuntoB)
print(2 not in conjuntoC)

# Igualdad entre conjuntos
print(conjuntoA == conjuntoC)

# Operaciones con conjuntos

conjuntoAc = conjuntoA | conjuntoC # Concatenar conjuntos
print(conjuntoAc) # No estan ordenados

conjuntoAc = conjuntoA & conjuntoC # Encontrar elementos en común
print(conjuntoAc)

conjuntoAc = conjuntoA - conjuntoC # Asigna valores que estan en el conjuntoA y no en el conjuntoC
print(conjuntoAc)

conjuntoAc = conjuntoA ^ conjuntoC # Asigna elementos que no comparten o son diferentes entre ambos
print(conjuntoAc)

print(conjuntoA.issubset(conjuntoAc)) # Averiguar si un conjunto es subconjunto de otro

print(conjuntoAc.issuperset(conjuntoA)) # Averiguar si un conjunto es superconjunto de otro

print(conjuntoA.isdisjoint(conjuntoC)) # Averiguar si los conjuntos son disconexos (No comparten elementos)

conjuntoA = frozenset # HAce el conjunto INMUTABLE