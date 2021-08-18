a, b, c = map(float, input().split(" "))
if a >= (b+c):
    print('NAO FORMA TRIANGULO')
if a**2 == ((b**2)+(c**2)):
    print('TRIANGULO RETANGULO')
if a**2 > ((b**2)+(c**2)):
    print('TRIANGULO OBTUSANGULO')
if a**2 < ((b**2)+(c**2)):
    print('TRIANGULO ACUTANGULO')
if a == b and b == c:
    print('TRIANGULO EQUILATERO')
if (a == b and c != b) or (a == c and b != c) or (b == c and a != c):
    print('TRIANGULO ISOSCELES')