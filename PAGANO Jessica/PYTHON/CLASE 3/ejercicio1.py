#EJERCICIO CLASE-3(Diccionario)
#INGRESAR ELEMENTOS AL DICCIONARIO LLAMADO SELECCION ARGENTINA, SE DEBEN INGRESAR COMO MINIMO 4 ELEMENTOS, ESTOS ELEMENTOS SON LOS JUGADORES DE LA SELECCION CON SU NUMERO DE CAMISETA, NOMBRE, APELLIDO, EDAD, ALTURA, PRECIO Y POSICION DEL JUGADOR.

seleccionArgentina = {
    10: {'Nombre': 'Lionel', 'Apellido': 'Messi', 'Edad': 36, 'Altura': 1.7, 'Precio': 'Entre €50.0M', 'Posicion': 'Delantero o Centrocampista'},
    7 : {'Nombre': 'Rodrigo', 'Apellido': 'De Paul', 'Edad': 29, 'Altura': 1.8, 'Precio': 'Entre €37.0M', 'Posicion': 'Centrocampista' },
    11 : {'Nombre': 'Angel', 'Apellido': 'Di Maria', 'Edad': 35, 'Altura': 1.8, 'Precio': 'Entre €75.0M', 'Posicion': 'Centrocampista' },
    9 : {'Nombre': 'Julian', 'Apellido': 'Alvarez', 'Edad': 23, 'Altura': 1.7, 'Precio': 'Entre €60.0M', 'Posicion': 'Delantero' },
    23 : {'Nombre': 'Emiliano', 'Apellido': 'Martinez', 'Edad': 31, 'Altura': 1.95, 'Precio': 'Entre €17.0M', 'Posicion': 'Portero' },
}
for llave, valor in seleccionArgentina.items():
    print(llave, valor)

print()
print('Tenemos cargados en el diccionario la cantidad de jugadores: ', end='' )
print(len(seleccionArgentina))
