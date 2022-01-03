def is_isogram(string):
    phrase = string.lower()
    characterUsed = []
    result = True
    for letter in phrase:
        for test in characterUsed:
            if test == letter and test != ' ' and test != '-':
                result = False
        characterUsed.append(letter)
    return result