#EJERCICIO 3
#CALCULADORA DE IMPUESTOS
#CREAR UNA FUNCION PARA CALCULAR EL TOTAL DE UN PAGO INCLUYENDO UN IMPUESTO APLICADO POR (IVA)
#FORMULA: PAGO_TOTAL = PAGO_SIN_IMPUESTO + PAGO_SIN_IMPUESTO * (IMPUESTO/100)
#PROPORCIONE EL PAGO SIN IMPUESTO: 1000
#PROPORCIONE EL MONTO DEL IMPUESTO: 21%
#PAGO CON IMPUESTO: XXXXX

#se crea la funcion que calcula el total del pago, incluyendo impuesto
def calcular_total_pago(pago_sin_impuesto, impuesto):
	pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto / 100)
	return pago_total

#Se ejecuta la funcion
pago_sin_impuesto = float(input("DIGITE EL PAGO SIN IMPUESTOS: "))
impuesto = float(input("DIGITE EL MONTO DEL IMPUESTO A APLICAR: "))
pago_con_impuesto = calcular_total_pago(pago_sin_impuesto, impuesto)
print(f"EL PAGO CON IMPUESTO ES DE: {pago_con_impuesto}")