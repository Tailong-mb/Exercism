def latest(scores):
    return scores[-1]


def personal_best(scores):
    result = scores[0]
    for test in scores:
        if result < test:
            result = test
    return result


def personal_top_three(scores):
    scoresBoard = scores.copy()
    result = []
    i = 0
    while i < len(scores) and i < 3:
        result.append(personal_best(scoresBoard))
        scoresBoard.remove(result[i])
        i += 1
    return result