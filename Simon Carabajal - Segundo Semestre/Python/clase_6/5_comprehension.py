# Lista de Comprensión / List Comprehension
# tomar solo lo necesario de la lista sin hacer modificaciones

nombres = ['Marcelo', 'Aldana', 'María', 'Ana']
alongA = [a for a in nombres if a[0] == 'A']  # Regresar una nueva lista
print('Nombres con A: ', alongA)

alongM = [m for m in nombres if m[0] == 'M']  # Regresar una nueva lista
print('Nombres con M: ', alongM)

# Con diccionarios

bottle = [{"name": "Quilmes", "country": "Arg"},
          {"name": "Corona", "country": "Mx"},
          {"name": "Stella Artois", "country": "Belgium"},
]
Arg = [b for b in bottle if b["country"] == "Arg"]
print(Arg)
print(bottle)