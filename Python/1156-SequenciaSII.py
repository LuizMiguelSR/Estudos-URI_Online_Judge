s=0
b=1
for i in range (1, 39+1, 2):
    c = i/b
    s += c
    b *= 2
print(f'{s:.2f}')