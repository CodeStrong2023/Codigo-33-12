#Ejercicio 1: Eliminar duplicados de una lista
#Escriba un programa donde tenga una lista y que a continuación
#elimine los elementos repetidos, por último mostrar la lista.

print("Estas son las edades de un grupo de 50 personas")
edad = [40, 20, 29, 48, 18, 56, 15, 43, 29, 20,
        57, 17, 39, 21, 21, 25, 52, 17, 37, 17,
        39, 58, 21, 54, 34, 31, 28, 51, 18, 21,
        16, 33, 15, 24, 40, 27, 33, 19, 42, 40, 
        30, 30, 45, 28, 24, 46, 56, 29, 56, 23]

#Lista ordenada
edad.sort()
print(edad)

#Eliminar elementos de la lista
datos = set(edad)
edad = list(datos)
print(f'Las edades que aparecen en el grupo son: {edad}') 