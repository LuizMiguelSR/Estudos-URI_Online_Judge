a, b, c=map(float, input().split(" "))
if a < (b+c) and b < (a+c) and c < (a+b):
    p = a + b + c
    print(f'Perimetro = {p:.1f}')
else:
    ar = ((a+b)*c)/2
    print(f'Area = {ar:.1f}')
