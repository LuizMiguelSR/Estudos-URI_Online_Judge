p = 0
im = 0
par = []
impar = []
for i in range(0, 14+1):
    x = int(input())
    if (x%2==0):
        par.append(x)
        p = p + 1
        if(p==5):
            for j in range(0, 5):
                print(f'par[{j}] = {par[j]}')
            par = []
            p = 0
    else:
        impar.append(x)
        im = im + 1
        if(im==5):
            for k in range(0, 5):
                print(f'impar[{k}] = {impar[k]}')
            impar = []
            im = 0
    if(i==14):
        for k in range(im):
            print(f'impar[{k}] = {impar[k]}')
        for j in range(p):
            print(f'par[{j}] = {par[j]}')