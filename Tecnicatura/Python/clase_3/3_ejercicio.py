
seleccionArgentina = { 
    10 : { 'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio':'50 Millones', 'Posicion': 'Extremo derecho'},
    11 : { 'Nombre': 'Ángel Di María', 'Edad': 34, 'Altura': 1.80, 'Precio':'12 Millones', 'Posicion': 'Extremo derecho'},
    24 : { 'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio':'35 Millones', 'Posicion': 'Media punta'},
    19 : { 'Nombre': 'Nicolás Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio':'3.5 Millones', 'Posicion': 'Defensa Central'},
    1  : { 'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio':'3.5 Millones', 'Posicion': 'Portero'},
    # Jugadores Agregados
    10 : { 'Nombre': 'Lionel Messi', 'Edad': 35, 'Altura': 1.70, 'Precio':'50 Millones', 'Posicion': 'Extremo derecho'},
    11 : { 'Nombre': 'Ángel Di María', 'Edad': 34, 'Altura': 1.80, 'Precio':'12 Millones', 'Posicion': 'Extremo derecho'},
    24 : { 'Nombre': 'Paulo Dybala', 'Edad': 28, 'Altura': 1.77, 'Precio':'35 Millones', 'Posicion': 'Media punta'},
    19 : { 'Nombre': 'Nicolás Otamendi', 'Edad': 34, 'Altura': 1.83, 'Precio':'3.5 Millones', 'Posicion': 'Defensa Central'},
    1  : { 'Nombre': 'Franco Armani', 'Edad': 35, 'Altura': 1.89, 'Precio':'3.5 Millones', 'Posicion': 'Portero'},
    }

for llave, valor in seleccionArgentina.items(): 
    # .items -> Va a mostrar los numeros de los jugadores (las llaves), si usamos .values no los mostrará
    print(llave, valor)

print('La cantidad de jugadores cargados en el diccionario es de: ',end= '')
print(len(seleccionArgentina))