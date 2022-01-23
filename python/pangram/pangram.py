def is_pangram(sentence):
    list = set()
        
    for character in sentence.lower():
        if character.isalpha():
                list.add(character)

    return len(list) == 26 
