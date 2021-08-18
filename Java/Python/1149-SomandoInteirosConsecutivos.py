b=0
x, n = list(map(int,input().split(" ")))
while n <= 0:
    n = int(input())
for a in range(1, n+1):
    b+=x
    x+=1
print(f'{b}\n')