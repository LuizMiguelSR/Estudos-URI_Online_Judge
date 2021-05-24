x, y = list(map(int,input().split(" ")))
for i in range(1, y+1):
    if i % x != 0:
        print(f'{i}', end=' ')
    else:
        print(f'{i}', end='\n')
        

        