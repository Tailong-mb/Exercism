def find(search_list, value):
    found = False
    bot = 0
    up = len(search_list) - 1
    while found == False and bot <= up:
        middle = (bot + up) // 2
        if search_list[middle] == value:
            found = True
            return middle
        else:
            if value < search_list[middle]:
                up = middle - 1
            else:
                bot = middle + 1
                
    if found == False:
        raise ValueError("value not in array")
