conjuntoA.add(1)
conjuntoA.add('uno')
print(conjuntoA)

# Inicializar con llaves, si se define como vacio, despues no se van a poder agregar elementos
conjuntoB = {}
# conjuntoB.add esto no se muestra
conjuntoC = {2}
conjuntoC.add('dos')
print(conjuntoB)
print(conjuntoC)

print(2 not in conjuntoA)
print(2 not in conjuntoB)
print(2 not in conjuntoC)

# Igualdad de conjuntos
print(conjuntoA == conjuntoC)

# Operaciones con conjuntos

conjuntoAc = conjuntoA | conjuntoC # Concatenar
print(conjuntoAc) # No estan ordenados

conjuntoAc = conjuntoA & conjuntoC # Elementos en común
print(conjuntoAc)

conjuntoAc = conjuntoA - conjuntoC # Asigna valores que estan en el conjunto A y no en el conjunto C
print(conjuntoAc)

conjuntoAc = conjuntoA ^ conjuntoC # Asigna elementos que no comparten o son diferentes entre ambos
print(conjuntoAc)

print(conjuntoA.issubset(conjuntoAc)) # Averiguar si un conjunto es subconjunto de otro

print(conjuntoAc.issuperset(conjuntoA)) # Averiguar si un conjunto es superconjunto de otro

print(conjuntoA.isdisjoint(conjuntoC)) # Averiguar si los conjuntos son disconexos (No comparten elementos)

conjuntoA = frozenset # Conjunto inmutable