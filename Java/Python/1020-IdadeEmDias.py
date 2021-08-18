n=int(input())
ano=n//365
mes=n%365//30
dia=n%365%30//1
print('{} ano(s)'.format(ano))
print('{} mes(es)'.format(mes))
print('{} dia(s)'.format(dia))
