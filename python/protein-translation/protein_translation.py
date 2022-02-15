def proteins(strand):
    proteinTranslator = {
    'AUG': 'Methionine',
    'UUC': 'Phenylalanine',
    'UUU': 'Phenylalanine',
    'UUA': 'Leucine',
    'UUG': 'Leucine',
    'UCU': 'Serine',
    'UCC': 'Serine',
    'UCA': 'Serine',
    'UCG': 'Serine',
    'UAC': 'Tyrosine',
    'UAU': 'Tyrosine',
    'UGC': 'Cysteine',
    'UGU': 'Cysteine',
    'UGG': 'Tryptophan',
    'UAA': 'STOP',
    'UAG': 'STOP',
    'UGA': 'STOP',
}
    
    result = []
    for i in range(0,len(strand),3):
        test = proteinTranslator[strand[i:i+3]]
        if test == 'STOP':
            break
        else:
            result.append(test)
    return result 
