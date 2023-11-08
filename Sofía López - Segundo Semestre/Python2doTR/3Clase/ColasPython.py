# Método de lista 
# Estructura de datos de tipo FIFO (First Input / First Output)
# Primero en entrar, primero en salir, como en las colas en la vida real

cola = ["Ana", "José"]
print("Cola original: ", cola)

# Agregar elementos
cola.append("María")
cola.append("Fernanda")
print("Cola con elementos agregados: ", cola)

# Sacar elementos
cola.pop(0)
print("Cola con un elemento menos: ", cola)

# Sacar elemento y guardarlo
elementoBorrado = cola.pop(0)
print(f'Se quito el elemento {elementoBorrado}')
print(f'La cola ahora es: {cola}')