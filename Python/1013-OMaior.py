import math
line=input().split(" ")
a, b, c=line
maior = (int(a)+int(b)+abs(int(a)-int(b)))/2
result = (int(maior)+int(c)+abs(int(maior)-int(c)))/2
print('{:.0f} eh o maior'.format(result))
