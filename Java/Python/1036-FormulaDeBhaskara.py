#a, b, c=map(float, input().split(" "))
#delta=(b**2)-(4*a*c)
#y=delta**(1/2)
#if y < 0 or a == 0:
#   print('Impossivel calcular')
#elif delta == 0:
#    r1=(-b+y)/(2*a)
#    r2=r1
#    print('R1 = {:.5f}'.format(r1))
#    print('R2 = {:.5f}'.format(r2))
#else:
#    r1=(-b+y)/(2*a)
#    r2=(-b-y)/(2*a)
#    print('R1 = {:.5f}'.format(r1))
#    print('R2 = {:.5f}'.format(r2))
v = input().split()
a, b, c = v

a = float(a)
b = float(b)
c = float(c)

if a == 0.0  or (b ** 2 - 4 * a * c) < 0:
    print('Impossivel calcular')
else:
    x1 = (- b + (b ** 2 - 4 * a * c) ** (1/2) )/(2 * a)
    x2 = (- b - (b ** 2 - 4 * a * c) ** (1/2) )/(2 * a)
    print('R1 = {:.5f}'.format(x1))
    print('R2 = {:.5f}'.format(x2))