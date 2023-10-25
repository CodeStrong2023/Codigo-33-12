
def cuentaRegresiva(elementos):
    while elementos != 0:
        print(elementos)
        elementos = elementos - 1
n = input()
num = int (n)
if num>0:
   cuentaRegresiva(num)

