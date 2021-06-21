v = int(input())
n = [0,0,0,0,0,0,0,0,0,0]
for i in range(len(n)):
    if(i==0):
        n[i] = v
        print(f'N[{i}] = {n[i]}')
    else:
        n[i] = n[i-1] * 2
        print(f'N[{i}] = {n[i]}')
    