while True:
    while True:
        n1=float(input())
        if n1 < 0 or n1 > 10:
            print('nota invalida')
        if n1 >= 0 and n1 <= 10:
            break
    while True:
        n2=float(input())
        if n2 < 0 or n2 > 10:
            print('nota invalida')
        if n2 >= 0 and n2 <= 10:
            break
    media = (n1+n2)/2
    print(f'media = {media:.2f}')
    break
