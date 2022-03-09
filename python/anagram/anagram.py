from collections import Counter

def find_anagrams(word, candidates):
    return [w for w in candidates if
            Counter(word.lower()) == Counter(w.lower()) and
            w.lower() != word.lower()]