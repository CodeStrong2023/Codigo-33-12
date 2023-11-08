# Ejercicio 4: Calculadora de Impuestos
# Crear una función para calcular el total de un pago incluyendo un impuesto aplicado. (IVA)
#       Formula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
# Proporcione el pago sin impuesto: 1000
# Proporcione el monto del impuesto: 21%
# Pago con impuesto: XXXXX

# Definir la función
def pago(compra):
    # Calculos
    impuesto = (compra / 100)*21
    total = compra + impuesto

    # Mostrar en pantalla los totales
    if compra > 0:
        print(f'\n\tMonto del pago sin impuesto {compra}$')
        print(f'\tMonto del impuesto {impuesto}$')
        print(f'\tMonto del pago con impuesto {total}$')

# definir variables
compra = 0
contador = 0
cantidad = int(input('\nIngrese la cantidad de compras: '))

# ingresar cada monto de la compra
while contador < cantidad:
    monto = float(input('Ingrese el monto de la compra: '))
    contador += 1
    compra += monto
pago(compra)