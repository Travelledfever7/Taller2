numSuc=input('Que termino quieres de la sucesion? \n')


def fibonacci(numSuc):
    return fibonacci(numSuc-1)+fibonacci(numSuc-2) if numSuc>1 else numSuc

n_termino=fibonacci(int(numSuc))
print('El termino N°' + str(numSuc) + 'de la sucesion de fibonacci es: '+ str(n_termino))