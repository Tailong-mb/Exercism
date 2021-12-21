def get_rounds(number):
    """
     :param number: int - current round number.
     :return: list - current round and the two that follow.
    """    
    result = [number,number+1,number+2]
    return result

def concatenate_rounds(rounds_1, rounds_2):
    """
    :param rounds_1: list - first rounds played.
    :param rounds_2: list - second set of rounds played.
    :return: list - all rounds played.
    """
    return rounds_1 + rounds_2

def list_contains_round(rounds, number):
    """
    :param rounds: list - rounds played.
    :param number: int - round number.
    :return:  bool - was the round played?
    """
    return number in rounds

def card_average(hand):
    """
    :param hand: list - cards in hand.
    :return:  float - average value of the cards in the hand.
    """
    return sum(hand)/len(hand)

def approx_average_is_average(hand):
    """
    :param hand: list - cards in hand.
    :return: bool - if approximate average equals to the `true average`.
    """
    return card_average(hand) in hand or card_average(hand) == (hand[0] + hand[-1]) / 2
     
def average_even_is_average_odd(hand):
    """
    :param hand: list - cards in hand.
    :return: bool - are even and odd averages equal?
    """
    sumEven = []
    sumOdd = []
    for i in hand:
        if(i%2 == 0):
            sumEven.append(i)
        else:
            sumOdd.append(i)
    return card_average(sumEven) == card_average(sumOdd)
    

def maybe_double_last(hand):
    """
    :param hand: list - cards in hand.
    :return: list - hand with Jacks (if present) value doubled.
    """
    if(hand[-1] == 11):
        hand[-1] = 22
    return hand