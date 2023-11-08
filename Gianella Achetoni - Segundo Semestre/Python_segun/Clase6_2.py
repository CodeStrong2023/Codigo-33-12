
print("AGENDA TELEFONICA")
agenda = {}
opciones = {
    1 : "Nuevo contacto",
    2 : "Borrar contacto",
    3 : "Ver contactos existentes",
    4 : "Salir", 
}
print("Elija una opción: ",opciones)
op = input()
opcion = int(op)
while opcion != 4:
    if opcion ==1:
        print("ingrese primero el nombre, luego ingrese el número ")
        nombre = input()
        n = input()
        num = int (n)
        agenda.setdefault(nombre, num)
    elif opcion == 2:
        print("Ingrese el nombre del numero que desea borrar: ")
        nombre = input()
        agenda.pop(nombre)
    elif opcion == 3:
        print(agenda)
    else :
        print("ERROR ")
        print("Por favor digite un número dentro de las opciones establecidas.")
    print("Elija una opción: ",opciones)
    op = input()
    opcion = int(op)
print ("Saliendo... ")
