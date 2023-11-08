# Ejercicio 11: Agenda telefonica
# Hacer un programa que simule una agenda de contactos. 
# Crear un diccionario donde la clave sea el nombre del usuario y el valor
# sea el telefono, el programa tendrá el siguiente menú de opciones
# 1. Nuevo contacto
# 2. Borrar contacto
# 3. Ver contactos existentës
# 4. Salir

agenda = {}

while True:
    print('\n\t- MENU -')
    print('1. Nuevo contacto')
    print('2. Borrar contacto')
    print('3. Ver contactos existentes')
    print('4. Salir')
    print()
    opcion = int(input('Elija una opcion: '))
    print()

    if opcion == 1:
        print('1. Nuevo contacto')
        nombre = input('Ingrese el nombre del contancto: ')
        numero = input('Ingrese el telefono del contacto: ')
        if nombre not in agenda:
            agenda[nombre] = numero
            print('Contacto agregado')
        else:
            print('El contacto ya existe')

    elif opcion == 2:
        print('2. Borrar contacto')
        nombre = input('Ingrese el nombre del contancto: ')
        if nombre in agenda:        
            agenda.pop(nombre)
            print('Contacto borrado')
        else:
            print('El contacto ingresado no existe')
    
    elif opcion == 3:
        print('3. Ver contactos existentes')
        for clave, valor in agenda.items():
            print(f'{clave}: {valor}')
        
    elif opcion == 4:
        print('4. Salir')
        break
    else:
        print('Opcion no disponible')