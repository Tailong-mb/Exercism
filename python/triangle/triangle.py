def isTriangle(a,b,c):
    return (a + b >= c) and (b + c >= a) and (a + c >= b) and (a > 0) and (b > 0) and (c > 0)

def equilateral(sides):
    a, b, c = sides
    if isTriangle(a,b,c):
        return (a == b) and (b == c)
    return False
    
def isosceles(sides):
    a, b, c = sides
    if isTriangle(a,b,c):
        return (a == b) or (b == c) or (a == c)
    return False
    
def scalene(sides):
    a, b, c = sides
    if isTriangle(a,b,c):
        return (a != b) and (b != c) and (a != c)
    return False