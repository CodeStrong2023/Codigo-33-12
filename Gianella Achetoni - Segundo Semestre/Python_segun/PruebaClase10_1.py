
from Clase10_1 import Clase10_1

print(f'Creacion de objetos'.center(50, '-'))

if __name__ == "__main__":
    Persona5 = Clase10_1("Gianella","Achetoni",18)
    Persona5.mostrardetalle()

    print(__name__)

print(f'Eliminacion de objetos'.center(50,'-'))

del Persona5