# 동전 문제 - 지불해야 하는 값이 4720원일 때 1원, 50원, 100원, 500원 동전으로 동전의 수가 가장 적게 지불하시오 
money = [500, 100, 50, 1]
count = 0
price = 4720

for index in range(4):
    if price // money[index] != 0:
        count += price // money[index]
        price %= money[index]

print(count)

# 부분 배낭 문제 - 무게 제한이 k인 배낭에 최대 가치를 가지도록 물건을 넣는 문제 (쪼갤 수 있음)
