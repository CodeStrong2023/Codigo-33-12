# Ejercicio 3: Agregar persomajes a una lista
# Escribir un programa donde crea una lista con los siguientes personajes del señor de los anillos
# Nombre: Aragon
# Clase: Guerrero
# Raza: Dunadan del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase: Arquero
# raza: Elfo Sindar

personajes = [] # Creamos una lista vacia
# Creamos diccionarios
P = {"Nombre": "Aragon", "Clase": "Guerrero", "Raza": "Dunadan del Norte"}
personajes.append(P) # Agregamos a la lista un personaje
P = {"Nombre": "Gandalf", "Clase": "Mago", "Raza": "Istar"}
personajes.append(P)
P = {"Nombre": "Legolas", "Clase": "Arquero", "Raza": "Elfo Sindar"}
personajes.append(P)
P = {"Nombre": "Boromir", "Clase": "Guerrero", "Raza": "Dunedain"}
personajes.append(P)
P = {"Nombre": "Saruman", "Clase": "Mago", "Raza": "Istari y Ainur"}
personajes.append(P)
P = {"Nombre": "Galadrier", "Clase": "Mago", "Raza": "Noldor"}
personajes.append(P)
print(personajes) # Tarea: Agregar por lo menos otros tres personajes, que sean a tu eleccion
