def is_armstrong_number(number):
    checkNumber = str(number)
    result = sum([int(num)**len(checkNumber) for num in checkNumber])

    return result == number