seleccionArgentina = {
    10 : { 'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio':'50 Millones', 'Posicion': 'Extremo derecho'},
    11 : { 'Nombre': 'Ángel Di María', 'Edad': 34, 'Altura': 1.80, 'Precio':'12 Millones', 'Posicion': 'Extremo derecho'},
    21 : { 'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio':'35 Millones', 'Posicion': 'Media punta'},
    19 : { 'Nombre': 'Nicolás Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio':'3.5 Millones', 'Posicion': 'Defensa Central'},
    1  : { 'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio':'3.5 Millones', 'Posicion': 'Portero'},
    # Jugadores agregados
    2  : { 'Nombre': 'Facundo Medina', 'Edad': 24, 'Altura': 1.84, 'Precio':'22 Millones', 'Posicion': 'Defensa'},
    23 : { 'Nombre': 'Emiliano Martínez', 'Edad': 31, 'Altura': 1.80, 'Precio':'28 Millones', 'Posicion': 'Portero'},
    3  : { 'Nombre': 'Nicolás Tagliafico', 'Edad': 31, 'Altura': 1.72, 'Precio':'9 Millones', 'Posicion': 'Lateral izquierdo'},
    7  : { 'Nombre': 'Rodrigo de Paul', 'Edad': 29, 'Altura': 1.80, 'Precio':'40 Millones', 'Posicion': 'Mediocentro'},
    22 : { 'Nombre': 'Lautaro Martínez', 'Edad': 26, 'Altura': 1.74, 'Precio':'85 Millones', 'Posicion': 'Delantero'},
    }

for llave, valor in seleccionArgentina.items():
    # Items muestra los numeros de los jugadores (las llaves)
    print(llave, valor)

print('La cantidad de jugadores cargados en el diccionario es de: ',end= '')
print(len(seleccionArgentina))