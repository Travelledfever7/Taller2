num=input('Dame el valor del numero a multiplicar:\n')
mult=input("Dame el valor del multiplicador:\n")

def multiplicarSinmultiplicar(num, mult):
    if num==0 or mult==0:
        return 0
    return num+multiplicarSinmultiplicar(num,mult-1)

resultado=multiplicarSinmultiplicar(int(num),int(mult))
print('El resultado de la multplicacion es: ' + str(resultado))