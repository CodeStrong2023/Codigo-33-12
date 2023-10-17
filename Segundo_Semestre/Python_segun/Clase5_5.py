
print ("Cajero automatico")
cuenta = 1000
opciones = {
    1 : "Ingresar dinero a la cuenta",
    2 : "Retirar dinero de la cuenta",
    3 : "Mostrar dinero disponible",
    4 : "Salir",
}
print ("Elija una opción: " ,opciones)
n = input()
num = int (n)
while num != 4:
    if num == 1:
        print("¿Cuanto desea ingresar ?")
        n1 = input()
        numin = int (n1)
        cuenta = cuenta + numin
    elif num == 2:
        print("¿Cuanto desea retirar ?")
        n1 = input()
        numin = int (n1)
        if numin <= cuenta :
            cuenta = cuenta - numin
        else :
            print("ERROR")
            print ("No cuenta con los fondos suficientes para realizar la transacción")
    else :
        print("El saldo disponible es: ", cuenta)
    print("Elija una opción: ", opciones)
    n = input()
    num = int(n)
print ("Saliendo... ")
