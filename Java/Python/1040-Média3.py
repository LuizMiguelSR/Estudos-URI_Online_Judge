n1, n2, n3, n4=map(float, input().split(" "))
med=((n1*2)+(n2*3)+(n3*4)+n4)/10
print('Media: {:.1f}'.format(med))
if med >= 7.0:
    print('Aluno aprovado.')
elif med >= 5.0 and med <= 6.9:
    print('Aluno em exame.')
    n5=float(input())
    print('Nota do exame: {:.1f}'.format(n5))
    med=(med+n5)/2
    if med >= 5.0:
        print('Aluno aprovado.')
        print('Media final: {:.1f}'.format(med))
    else:
        print('Aluno reprovado.')
        print('Media final: {:.1f}'.format(med))
else:
    print('Aluno reprovado.')
