matriz = []
soma = 0.0
c = 0
opecacao = input()
for i in range(12):
  linha = []
  for j in range(12):
    numero = float(input())
    linha.append(numero)
  matriz.append(linha)

for a in range(12):
  for b in range(12):
    if a < b:
      soma+=matriz[a][b]
      c+=1

if opecacao == "S":      
  print("%.1f"%soma)      
elif opecacao == "M":
  print("%.1f"%(soma/c))