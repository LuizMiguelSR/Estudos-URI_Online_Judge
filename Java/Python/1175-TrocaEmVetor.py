n = []
for i in range(4):
    c = int(input())
    n.append(c)
x = 0
z = 3
for i in range(2):
    temp1 = 0
    temp2 = 0
    temp1 = n[x]
    temp2 = n[z]
    n[x] = temp2
    n[z] = temp1
    x = x+1
    z = z-1
for i in range(4):
    print(f'N[{i}] = {n[i]}')
