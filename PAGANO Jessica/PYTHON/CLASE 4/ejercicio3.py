#EJERCICIO 3
#AGREGAR PERSONAJES A UNA LISTA
#ESCRIBIR UN PROGRAMA EN DONDE CREE UNA LISTA CON LOS SIGUIENTES PERSONAJES DEL SEÑOR DE LOS ANILLOS
#NOMBRE: ARAGORN
#CLASE: GUERRERO
#RAZA: DÚNAN DEL NORTE

#NOMBRE: GANDALF
#CLASE: MAGO
#RAZA: ISTAR

#NOMBRE: LEGOLAS
#CLASE: ARQUERO
#RAZA: ELFO SINDAR

personajes = [] #SE CREA UNA LISTA VACIA PARA AGREGAR A LOS PERSONAJES
#SE CREA LOS DICCIONARIOS CORRESPONDIENTES-
p ={'Nombre': 'Aragorn', 'Clase' : 'Guerrero', 'Raza': 'Dúnadan del Norte'}
personajes.append(p)
p ={'Nombre': 'Gandalf', 'Clase' : 'Mago', 'Raza': 'Istar'}
personajes.append(p)
p ={'Nombre': 'Legolas', 'Clase' : 'Arquero', 'Raza': 'Elfo Sindar'}
personajes.append(p)

p ={'Nombre': 'Arwen', 'Clase' : 'Maga', 'Raza': 'Peredhil(medio-elfo)'}
personajes.append(p)
p ={'Nombre': 'Galadriel', 'Clase' : 'Maga', 'Raza': 'Elfo Noldor'}
personajes.append(p)
p ={'Nombre': 'Gollum', 'Clase' : 'Ladrón', 'Raza': 'Hobbit'}
personajes.append(p)

#SE PUEDE REULTILIZAR LA VARIABLE "PERSONAJES" SIN NECESIDAD DE PONER "p1,p2,p3.."
print(personajes)