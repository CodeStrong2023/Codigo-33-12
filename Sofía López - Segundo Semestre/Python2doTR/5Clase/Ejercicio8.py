# Ejercicio 8: Menú interactivo - Cajero automatico
# Hacer un programa que simule un cajero automatico con un saldo inicial de 1000$ y tendrá el siguiente menú de opciones:
#   1-Ingresar dinero en la cuenta
#   2-Retirar dinero de la cuenta
#   3-Mostrar dinero disponible
#   4-Salir

print('Cajero Automático')
cuenta = 0

while True:
    
    print('\n\t=MENU=')
    print('1. Ingresar dinero en la cuenta')
    print('2. Retirar dinero de la cuenta')
    print('3. Mostrar dinero disponible')
    print('4. Salir')
    print()
    opcion = int(input('Ingrese el número que corresponde a la opción que desea ejecutar: '))
    print()
    if opcion == 1:
        print('1. Ingresar dinero en la cuenta')
        ingreso = float(input('Escriba la cantidad de dinero que desea ingresar: '))
        cuenta += ingreso
        print(f'Cantidad actual de la cuenta --- {cuenta}')
    elif opcion == 2:
        print('2. Retirar dinero de la cuenta')
        egreso = float(input('Escriba la cantidad de dinero que desea retirar: '))
        if egreso > cuenta:
            print('La cuenta no tiene fondos suficientes')
        else:
            cuenta -= egreso
        print(f'Cantidad actual de la cuenta --- {cuenta}')

    elif opcion == 3:
        print('3. Mostrar dinero disponible')
        print(f'Cantidad actual en la cuenta --- {cuenta}')

    elif opcion == 4:
        print('4. Salir')
        break
    else:
        print('Opcion no disponible')