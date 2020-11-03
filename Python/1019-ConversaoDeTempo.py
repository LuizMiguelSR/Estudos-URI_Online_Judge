n=int(input())
horas=n//3600
minutos=n%3600//60
segundos=n%60//1
print('{}:{}:{}'.format(horas,minutos,segundos))
