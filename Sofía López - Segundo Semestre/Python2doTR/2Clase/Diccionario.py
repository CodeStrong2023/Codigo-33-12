diccionario = {
    'IDE':'Integrated Development Enviroment',
    'POO':'Programación Orientada a Objetos',
    'SARD':'Sistema de Administración de Base de Datos',
}
print(diccionario)
print('Cantidad de elementos en el diccionario: ',len(diccionario))

# Acceder a un diccionario con la "llave"
print(diccionario['IDE'])

print(diccionario.get('POO'))

# Modificar los elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

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

# Comprobar si existe un elemento

consulta = input("Ingresa un acronimo: ")
print(consulta in diccionario)

# Agregar un elemento
diccionario['PK'] = 'Primary Key'
print(diccionario)

# Eliminar el elemento
diccionario.pop('SARD')
print(diccionario)

# Vaciar el diccionario
diccionario.clear()
print(diccionario)

# Eliminar el diccionario
del diccionario