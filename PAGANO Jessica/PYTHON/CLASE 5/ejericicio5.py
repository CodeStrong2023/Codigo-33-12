#EJERCICIO 5
#MENU INTERACTIVO - CAJERO AUTOMATICO
#HACER UN PROGRAMA QUE SIMULE UN CAJERO AUTOMATICO CON UN SALDO INICIAL DE $1000 Y TENDRA QEL SIGUIENTE MENU DE OPCIONES:
# 1. INGRESAR DINERO EN LA CUENTA
# 2. RETIRAR DINERO EN LA CUENTA
# 3. MOSTRAR DINERO DISPONIBLE
# 4. SALIR

#variable saldo inicial
saldo = 1000

#seleccion de menu
while True:
	print("\t - MENÚ -")
	print("1. INGRESAR DINERO EN LA CUENTA")
	print("2. RETIRAR DINERO EN LA CUENTA")
	print("3. MOSTRAR DINERO DISPONIBLE")
	print("4. SALIR")

#variable opcion
	opcion = int(input("DIGITE UNA DE LAS OPCIONES DEL MENÚ: "))
	print()
	if opcion == 1:
		extra = float(input("CUANTO DINERO DESEA INGRESAR A LA CUENTA -> "))
		saldo += extra
		print(f"DINERO EN LA CUENTA DISPONIBLE: ${saldo}")
	elif opcion == 2:
		retirar = float(input("CUANTO DINERO DESEA RETIRAR DE LA CUENTA -> "))
		if retirar > saldo:
			print("NO TIENE DINERO SUFICIENTE")
		else:
			saldo -= retirar
			print(f"DINERO EN LA CUENTA DISPONIBLE: ${saldo}")
	elif opcion == 3:
		print(f"DINERO EN LA CUENTA DISPONIBLE: ${saldo}")
	elif opcion == 4:
		print("GRACIAS! POR UTILIZAR NUESTROS CAJEROS AUTOMATICOS (:")
		break
	else:
		print("OPCION INCORRECTA")
		print()