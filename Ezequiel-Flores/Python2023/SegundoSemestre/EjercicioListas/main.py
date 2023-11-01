# LISTAS: para las listas se usan los corchetes, y comillas dobles o simples.
# pueden encontrarse distintos tipos de datos.
print("crear una lista")
nombres = ['Jessica', 'Matias', 'Ezequiel', 'Aldana',]
print(nombres)
print()

# IMPRIMIR UNA POSICION ESPECIFICA
print("imprimir posicion especifica")
print(nombres[0])
print(nombres[3])
print()

#Para ver el ultimo elemento y no saber cuanto contiene la lista. Se coloca el numero negativo
#de manera inversa.
print("manera inversa o no saber cuanto contiene la lista")
print(nombres[-1])
print()


#PARA RECORRER UNA CANTIDAD DE INDICES EN LAS LISTAS SE IMPRIME
print("recorre una cierta cantidad en las listas")
print(nombres[0:2]) #muestra las dos primeras posiciones del indice sin incluir el nro2
print()

#IR AL INICIO DE LA LISTA AL INDICE (SIN INCLUIRLO)
print(nombres[ : 3])
print()

#DESDE EL INDICE INDICADO HASTA EL FINAL.
print(nombres[1 : ])
print()

#MODIFICAR UN VALOR DE LA LISTA
nombres [3] = "Simon"
nombres [0] = "Sofia"
print(nombres)
print()

#ITERAR UNA LISTA.
print("ITERACION DE LA LISTA")
for nombre in nombres:  # EL NOMBRE ES SINGULAR, LA LISTA ES PLURAL
    print(nombre)
else:
    print("**Se acabaron los elementos de la lista**")
print()

#CUANTOS ELEMENTOS TIENE UNA LISTA
print(len(nombres)) #Esta funcion nos dice cuanto elementos tiene la lista.
print()

#AGREGAR ELEMENTOS A UNA LISTA
nombres.append("Jessica") #FUNCION PARA AGREGAR EL ELEMENTO
print(nombres) #POR DEFECTO SE INGRESA AL FINAL DE LA LISTA
print()

#AGREGAR UN ELEMENTO ESPECIFICO EN UNA LISTA
nombres.insert(2,"Belen") #necesito primero ingresar el nro entero luego el elemento
print(nombres)
nombres.insert(3,"Gianella")
print(nombres)
print()

#PARA ELIMINAR UN ELEMENTO DE LA LISTA
nombres.remove("Belen") #Ingresamos el elemnto a eliminar
print(nombres)
print()

#PARA ELIMINAR EL ULTIMO ELEMENTO DE LA LISTA
nombres.pop() #ESTA FUCION ELIMINA EL ULTIMO ELEMNTO DE LA LISTA PERO NO EL ULTIMO ELEMENTO INGRESADO.
print(nombres)

#PARA ELIMINAR UN ELEMENTO ESPECIFICO
del nombres[2] #elimina un elemento especifico de la lista.
print(nombres)
print()

#ELIMINAR, BORRAR, LIMPIAR TODOS LOS ELEMENTOS
nombres.clear()
print(nombres)
print()

"""
#ELIMINAR LA LISTA
del nombres
#mostrando este codigo larga ERROR  en donde no se encuentra la lista.
#previamente eliminada
print(nombres)
"""