n = []
c = 0
t = int(input())
for i in range(0,1000):
    if c < t:
        print(f'N[{i}] = {c}')
        c += 1
    else:
        c = 0
        print(f'N[{i}] = {c}')
        c += 1
