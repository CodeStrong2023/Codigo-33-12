# Ejercicio 9: Mostrar una frase sin espacios y contar su longitud
# Hacer un programa donde el usuario ingrese una frase, se le devolverá la misma frase pero sin espacios en blanco,
# y además un contador de cuántos caracteres tiene la frase (sin contar los espacios en blanco)
# Ejemplo:
#       frase = vivir por siempre en paz
#       frase final = vivirporsiempreenpaz
#       Na de caracteres = 20

print('Ingresar una frase, se devolvera la frase si espacios y la cantidad de caracteres.')
fraseA = input('Escribe la frase: ')
fraseB = ''
for i in fraseA:
    if i != ' ':
        fraseB += i
fraseA = fraseB
print(f'\nFrase final: {fraseA}')
print(f'Cantidad de caracteres: {len(fraseB)}')