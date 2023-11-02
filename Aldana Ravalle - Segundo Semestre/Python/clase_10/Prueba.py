from Persona2 import Persona2

print("Creacion de objetos" .center(50, ' - '))
if __name__ == '__main__':

    usuario5 = Persona2("Maria", "Celeste", 78)
    usuario5.mostrar_detalles()

    print(__name__)

print("Elmininacion de objetos" .center(30, " - "))
del usuario5