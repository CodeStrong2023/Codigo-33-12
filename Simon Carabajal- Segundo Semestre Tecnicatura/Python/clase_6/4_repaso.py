numbers = [1, 2, 3, 4, 5, 6]
# numbers = [] # Aún con la lista vacia se ejecuta el else
for n in numbers:
    print(n)
    '''
    # La unica manera de que el else no se ejecute
    if n == 6:
        break
    '''
else:
    print('Terminado')