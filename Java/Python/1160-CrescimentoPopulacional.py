t = int(input())
for i in range(0,t):
    tempo = 0
    pa, pb, ga, gb=map(float, input().split(" "))
    pa = int(pa)
    pb = int(pb)
    while pa<=pb:
        pa = int(pa*(1 + ga/100))
        pb = int(pb*(1 + gb/100))
        tempo = tempo + 1
        if tempo >= 101:
            print("Mais de 1 seculo.")
            break
    if tempo <= 100:
        tempo = int(tempo)
        print(f'{tempo} anos.')