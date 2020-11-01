linea=input().split(" ")
lineb=input().split(" ")
cod1, qtde1, value1 = linea
cod2, qtde2, value2 = lineb
total = (int(qtde1) * float(value1) + int(qtde2) * float(value2))
print('VALOR A PAGAR: R$ {:.2f}'.format(total))