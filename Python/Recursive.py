def factorial1(n):
    if n > 1:
        return n * factorial1(n - 1)
    else:
        return 1

def factorial2(n):
    if n <= 1:
        return 1
    return n * factorial2(n - 1)

def one_two_three(data):
    if data == 1:
        return 1
    elif data == 2:
        return 2
    elif data == 3:
        return 4
    return one_two_three(data - 1) + one_two_three(data - 2) + one_two_three(data - 3)
    
print(factorial1(10))
print(factorial2(10))