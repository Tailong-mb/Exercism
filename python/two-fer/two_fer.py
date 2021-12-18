def two_fer(name = None):
    '''
    ::param name if he is not null or equal to "" the function return a string with the param.
    If name is null the function return a standard string.
    '''
    
    if name != None:
        return "One for " + name + ", one for me."
    else:
        return "One for you, one for me."
