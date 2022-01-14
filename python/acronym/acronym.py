def abbreviate(words):
    add = True
    result = ''
    for testChar in words:
        if add and testChar != ' ' and testChar != '_' and testChar != '-':
            result += testChar
            add = False
        if testChar == ' ' or testChar == '-':
            add = True
            
    return result.upper()
