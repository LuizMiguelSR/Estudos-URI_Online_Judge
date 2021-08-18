total = c = r = s = 0
nt=int(input())
for i in range(1,nt+1):
    x = input().split(" ")
    a, b =x
    if b in 'Cc':
        c = c + int(a)
    elif b in 'Rr':
        r = r + int(a)
    elif b in 'Ss':
        s = s + int(a)
total = c + r + s
pc = (c/total) * 100
pr = (r/total) * 100
ps = (s/total) * 100
print(f'Total: {total} cobais')
print(f'Total de coelhos: {c}')
print(f'Total de ratos: {r}')
print(f'Total de sapos: {s}')
print(f'Percentual de coelhos: {pc:.2f} %')
print(f'Percentual de ratos: {pr:.2f} %')
print(f'Percentual de sapos: {ps:.2f} %')
