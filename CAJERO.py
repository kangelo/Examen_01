'''
Ejercicio 1
'''

def retirar_saldo(saldo):
    try:
        retirar = int(input("""\t. : Favor de introducir la cantidad de efectivo que desea retirar : $"""))
        diferencia_saldo = saldo - retirar
        if diferencia_saldo < 0:
            print('Favor de insertar una cantidad menor o igual al saldo que tiene')
            fecha = str(datetime.today().strftime('%A, %B %d, %Y %H:%M:%S'))
            movimientos[fecha] = "Se INTENTO retirar $"+str(retirar)+" de tu cuenta (fallido), el saldo final es de: $" + str(saldo)
        elif diferencia_saldo > saldo:
            print('Favor de insertar una cantidad menor o igual al saldo que tiene, los números negativos no cuentan')
            fecha = str(datetime.today().strftime('%A, %B %d, %Y %H:%M:%S'))
            movimientos[fecha] = "Se INTENTO retirar $"+str(retirar)+" de tu cuenta (fallido), el saldo final es de: $" + str(saldo)
        else:
            saldo = diferencia_saldo
            fecha = str(datetime.today().strftime('%A, %B %d, %Y %H:%M:%S'))
            movimientos[fecha] = "Se retiro $"+str(retirar)+" de tu cuenta, el saldo final es de: $" + str(saldo)


        print('Su saldo por el momento es de: $' + str(saldo))
        return saldo
    except ValueError:
        print("Error -> Digite correctamente los valores numéricos ENTEROS (no alphanuméricos, no  con decimales, no símbolos)")
        return saldo

def consultar_saldo(saldo):
    fecha = str(datetime.today().strftime('%A, %B %d, %Y %H:%M:%S'))
    movimientos[fecha] = "Se consulto saldo, el saldo final es de: " + str(saldo)
    print('Su saldo por el momento es de: $' + str(saldo))

def consultar_movimientos(movimientos):
    '''movimientos = {"Alejando":22,"Maria":23,"Jose":45}'''
    if movimientos:
        print('Sus movimientos que ha registrado el día de hoy son los siguientes')
        for i in movimientos:
            print(f"{i} -> {movimientos[i]}")
    else:
        print('No ha hecho movimientos el día de hoy')



def continuar_finalizar_programa():
    continuidad = 2
    while (continuidad < 0 or continuidad > 1):
        '''continuidad = int(input("""\t. : Seleccione una opción por favor :.
            0. Salir del programa
            1. Continuar"""))'''
        print("""\t. : Seleccione una opción por favor :.
            0. Salir del programa
            1. Continuar""")
        print()
        try:
            integer_value = int(input())
            return integer_value
        except ValueError:
            print("Error -> Digite correctamente los valore numéricos ENTEROS (no alphanuméricos, no  con decimales, no símbolos)")

        if (continuidad < 0 or continuidad > 1):
            print("Favor de teclear una de las dos opciones que se le solicitan")
    return continuidad

def input_excepcion_integers():
    try:
        integer_value = int(input())
        return integer_value
    except ValueError:
        print("Error -> Digite correctamente los valore numéricos ENTEROS (no alphanuméricos, no  con decimales, no símbolos)")

from datetime import datetime
'''print(datetime.today().strftime('%A, %B %d, %Y %H:%M:%S'))'''

intento = 0
movimientos = {}
saldo = 1000
while intento < 3:
    '''password = int(input("Bienvenido :), inserte su contraseña por favor para poder ayudarle"))'''
    print("Bienvenido :), inserte su contraseña por favor para poder ayudarle")
    print()
    password = input_excepcion_integers()

    intento += 1

    if password == 1235:
        intento ==3
        while True:
            print("""\t. : MENU :.
        1. Consultar saldo
        2. Retirar saldo
        3. Histórico de movimientos
        4. Salir""")
            '''opcion = int(input("Digite una opción: "))'''
            print("Digite una opción: ")
            print()
            opcion = input_excepcion_integers()

            print()

            if opcion == 1:

                consultar_saldo(saldo)

                if  continuar_finalizar_programa()== 0:
                    intento = 3
                    break

            elif opcion == 2:
                saldo = retirar_saldo(saldo)
                if  continuar_finalizar_programa()== 0:
                    intento = 3
                    break

            elif opcion == 3:

                consultar_movimientos(movimientos)

                if  continuar_finalizar_programa()== 0:
                    intento = 3
                    break

            elif opcion ==4:
                print("Fue un placer ayudarle :)")
                intento = 3
                break

            else:
                print("Se equivoco de opción de menú")
    else:
        print("Contraseña Incorrecta")
        print()
print("El programa se ha terminado")