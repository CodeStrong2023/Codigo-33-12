from Persona2 import Persona2

print('Creacion de objetos'.center("Pepita","*"))
if __name__ == '__main__':

    persona5 = Persona2("Ursula", "Celia", 67)
    persona5.mostrar_detalles()

    print(__name__)

print("Elmininacion de objetos".center(50, "*"))
del persona5