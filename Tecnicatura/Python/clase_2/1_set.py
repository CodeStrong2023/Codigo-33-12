# Set - conjunto

planetas = {'Saturno', 'Júpiter', 'Venus', 'Plutón', 'Mercurio'}
print("Cantidad de elementos en el set: ", len(planetas))

# Revisar el set en busca del elemento
planeta = input("Preguntar por un planeta: ")
print(planeta in planetas)

# Agregar un elemento
planetas.add("Tierra")
print("Planetas en la lista: ", planetas)

# Eliminar un elemento
planetas.remove('Plutón') # Si el elemento se ingresa mal o no existe en el set marca error.
print("Planetas en la lista: ", planetas) 

planetas.dicard('Venus') # Si el elemento se ingresa mal o no existe en el set NO marca error, simplemente no hace nada.
print("Planetas en la lista: ", planetas)

# Limpiar set
planetas.clear()
print("Planetas en la lista: ", planetas)

# Eliminar set
del planetas