#EJERCICIO 2
#AGENDA TELEFONICA
#HACER UN PROGRAMA QUE SIMULE UNA AGENDA DE CONTACTOS.
#CREAR UN DICCIONARIO DONDE LA CLAVE SEA EL NOMBRE DEL USUARIO Y EL VALOR SEA EL TELEFONO.
#EL PROGRAMA TENDRA EL SIGUIENTE MENU DE OPCIONES:

# 1. NUEVO CONTACTO
# 2. BORRAR CONTACTO
# 3. VER CONTACTOS EXISTENTES
# 4. SALIR

agenda = {}

while True:
	print("\n- MENU -")
	print("1. NUEVO CONTACTO")
	print("2. BORRAR CONTACTO")
	print("3. VER CONTACTOS EXISTENTES")
	print("4. SALIR")

	opcion = int(input("DIGITE LA OPCION CORRESPONDIENTE: "))
	if opcion == 1:
		nombre = input("DIGITE NOMBRE Y APELLIDO: ")
		tel = input("DIGITE EL NUMERO DE TELEFONO: ")
		if nombre not in agenda:
			agenda[nombre] = tel
			print("CONTACTO AGENDADO EXITOSAMENTE-")
		else:
			print("CONTACTO EXISTENTE-")

	elif opcion == 2:
		nombre = input("NOMBRE DEL CONTACTO: ")

		if nombre in agenda:
			del (agenda[nombre]) #se borrará el contacto
			print("SE ELIMINÓ EL CONTACTO EXITOSAMENTE-")
		else:
			print("EL CONTACTO NO EXISTE EN LA AGENDA")

	elif opcion == 3:
		print("-AGENDA DE CONTACTOS-")
		for clave, valor in agenda.items():
			print(f"NOMBRE: {clave}, TELEFONO: {valor}")

	elif opcion == 4:
		print("HASTA LUEGO")
		break
	else:
		print("LA OPCION DE MENÚ NO EXISTE")
		print()