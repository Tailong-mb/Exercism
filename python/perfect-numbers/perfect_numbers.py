def classify(number):
    if number < 1:
        raise ValueError("Classification is only possible for positive integers.")
    divisor = []
    for i in range (1,int(number/2 + 1)):
        if number % i == 0:
            divisor.append(i)
    result = sum(divisor)
    if result == number:
        return "perfect"
    if result > number:
        return "abundant"
    else:
        return "deficient"
        
