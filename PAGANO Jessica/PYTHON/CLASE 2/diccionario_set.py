#SET- NO TIENE ORDEN
planetas = {"marte", "jupiter", "tierra"}
print(planetas) #Al actualizarlo no mantiene el orden
print()

#funcion len = que significa largo
print(len(planetas))
print()

#REVISAR SI UN ELEMENTO EXISTE DENTRO DEL SET
print("¿Esta el elemento en el SET?")
#si esta dentro del SET
print("marte" in planetas) #ELEMENTO BOOLEANO (PREGUNTA) - OJO MAYUSCULAS Y MINUSCULAS AL ESCRIBIR
#TAMBIEN ACENTOS -
print()
print("marte" not in planetas) #si no esta dentro del SET
print()

#AGREGAR ELEMENTOS DUPLICADOS
planetas.add("saturno")
planetas.add("saturno")
# no se pueden agregar elementos duplicados o repetidos.
# no hay error de sintaxis.

#ELIMINAR ELEMENTOS - PUEDE ARROJAR UN ERROR SI EL ELEMENTO NO EXISTE O ESTAMAL ESCRITO.
planetas.remove("tierra")
print(planetas)
print()
#Hay error si "tierra" esta mal escrito. MAYUS-mins-Acento

#OTRA FORMA DE ELIMINAR ELEMENTOS
planetas.discard("Marte") #esta funcion no presenta errores ni ejecuta el comando.
print(planetas)
print()

#LIMPIAR SET
planetas.clear()
print(planetas)
print()

#Elinar conjunto.
"""
del planetas
print(planetas)
"""
# se muestra error al eliminar el set


#diccionarios en python-
#CONJUNTO DE DOS ELEMENTOS. UNA LLAVE Y UN VALOR.
diccionario = {
    "IDE": "Integrated Development Environment", #finalizar la cadena de strings con COMA-
    "POO": "Programacion Orientada a Objetos",
    "SABD": "Sistema de Administracion de Base de Datos"
}
print(diccionario)
print()

#cantidad de elemntos
print("muestra la cantidad de elementos")
print(len(diccionario))
print()
#acceder a un diccionario con llave(KEY)
print(diccionario["IDE"]) #OJO MAYUS-MINUS-ACENTOS!
print()

#otra forma de recuperar un elemento - ACCEDER A UNO DE LOS ELEMENTOS.
print(diccionario.get("POO"))
print(diccionario.get("SABD"))
print()

#MODIFICAR LOS ELEMENTOS - se puede modificar los elementos del mismo
diccionario["IDE"] = "Entorno de Desarrollo Integrado"
print(diccionario)
print()

#RECORRER LOS ELEMENTOS DEL DICCIONARIO
for termino in diccionario:
    print(termino) #Se recorre solo mostrando las llaves
    print()

"""
for termino, valor in diccionario:
    print(termino, valor) #En este comando no se puede acceder
"""
#Se necesita de esta funcion para recorrer un diccionario
for termino, valor in diccionario.items():
    print(termino, valor)
print()

#Otras maneras de acceder un diccionario
for termino in diccionario.keys():
    print(termino) #SE MUESTRAN SOLO LAS LLAVES-
print()
for valor in diccionario.values():
    print(valor) #SE MUESTRAN SOLO LOS VALORES-
print()

#Comprobar la existencia de algun elemento.
print("¿Esta el elemento en el diccionario?")
print("IDE" in diccionario) #DEVUELVE UN BOOLEANO (SI O NO)
print()

#Agregar un elemento
diccionario ["PK"] = "Primary Key"
print(diccionario)

#Eliminar un elementro del diccionario
diccionario.pop("SABD")
print(diccionario)
print()

#limpiar un diccionario
diccionario.clear()
print(diccionario)
print()

"""
#Eliminar diccionario
del diccionario
"""