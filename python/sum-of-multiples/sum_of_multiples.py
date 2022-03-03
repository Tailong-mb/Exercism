def sum_of_multiples(limit, multiples):
    result_to_sum = []
    if 0 in multiples:
        multiples.remove(0)
    for i in range(limit):
        for test_multiples in multiples:
            if i%test_multiples == 0:
                result_to_sum.append(i)
                break
    
    return sum(result_to_sum)
