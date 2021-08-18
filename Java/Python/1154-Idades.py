med = 0
i = 0
c = 0
ni = 0
while (i>=0):
    i=int(input())
    if(i>=0):
        ni+=i
        c+=1
med = ni/c
print(f'{med:.2f}')