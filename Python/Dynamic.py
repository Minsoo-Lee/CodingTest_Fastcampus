def fibo_rec(data):
    if data <= 1:
        return data
    return fibo_rec(data - 1) + fibo_rec(data - 2)

def fibo_dp(data):
    cache = [0 for x in range(0, data + 1)]
    cache[0] = 0
    cache[1] = 1
    for index in range(2, data + 1):
        cache[index] = cache[index - 1] + cache[index - 2]
    return cache[data]

print(fibo_rec(10))
print(fibo_dp(10))
