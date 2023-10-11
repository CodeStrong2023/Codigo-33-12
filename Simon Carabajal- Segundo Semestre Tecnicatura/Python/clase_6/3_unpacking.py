# Desempaquetado de listas / List Unpacking

def show(name, lastName):
    print(name+' '+lastName)

person1 = ['Ana', 'García']
show(person1[0], person1[1]) # Ingresar los datos de a uno
show(*person1) # Ingresar todos los datos

# con tuplas
person2 = ('Pablo', 'Martinez')
show(*person2)

# Con diccionarios
person3 = {'Lastname':'Gonzales', 'Name':'José'}
show(**person3)

