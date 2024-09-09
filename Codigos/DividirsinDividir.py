dividendo=input('Dame el valor del dividenso:\n')
divisor=input("Dame el valor del divisor:\n")

def dividirSindividir(dividendo, divisor):
    if dividendo % divisor!=0:
        return 0
    if(dividendo==divisor):
        return 1
    return 1+dividirSindividir(dividendo-divisor,divisor)

resultado=dividirSindividir(int(dividendo),int(divisor))
print('El resultado de la division es: ' + str(resultado) if resultado>0 else 'El resultado no es posible sin decimales')