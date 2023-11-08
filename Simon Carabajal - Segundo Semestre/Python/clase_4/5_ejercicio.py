# Recorrer diccionario

diccionario = {
    'Ana'   : {'Edad' : 18, 'Altura': 1.80}, 
    'Jose'  : {'Edad' : 35, 'Altura': 1.90}, 
    'Mia'   : {'Edad' : 28, 'Altura': 1.40}
    }
# print(diccionario)

for i in diccionario:
    print(f'{i} -> {diccionario[i]}')