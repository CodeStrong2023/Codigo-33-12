# Diccionarios
diccionario = {
    'IDE':'Integrated Development Enviroment',
    'POO':'Programación Orientada a Objetos',
    'SARD':'Sistema de Administración de Base de Datos',   
}
print(diccionario)
print('Cantidad de elementos en el diccionario: ',len(diccionario))

# Acceder a un diccionario con la llave(key)
print(diccionario['IDE'])

print(diccionario.get('POO'))

# Modificar elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

# Recorrer los elementos

# Acceder a las llaves  
for termino in diccionario:
    print(termino)

for termino in diccionario.keys():
    print(termino)

# Acceder a los datos
for termino, valor in diccionario.items():
    print(termino, valor)

for valor in diccionario.values():
    print(valor)

# Comprobar la existencia de algún elemento

consulta = input("Ingresa un acronimo: ")
print(consulta in diccionario)

# Agregar un elemento
diccionario['PK'] = 'Primary Key'
print(diccionario)

# Eliminar elemento
diccionario.pop('SARD')
print(diccionario)

# Vaciar diccionario
diccionario.clear()
print(diccionario)

# Eliminar diccionario
del diccionario