
def factorial(*elementos):
    factorial = 1
    pasadas = 1
    for elemento in elementos:
       while pasadas != elemento:
        pasadas = pasadas + 1
        factorial = factorial * pasadas
    print (factorial)
factorial(5)
