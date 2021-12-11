public class Blackjack {

    public int parseCard(String card) {

        int valueCard;
        switch (card){
            case "ace":
                valueCard = 11;
                break;
            case "king": case "queen": case "jack": case "ten":
                valueCard = 10;
                break;
            case "nine": 
                valueCard = 9;
                break;
            case "eight":
                valueCard = 8;
                break;
            case "seven":
                valueCard = 7;
                break;
            case "six":
                valueCard = 6;
                break;
            case "five":
                valueCard = 5;
                break;
            case "four":
                valueCard = 4;
                break;
            case "three":
                valueCard = 3;
                break;
            case "two":
                valueCard = 2;
                break;
            default :
                valueCard = 0;
        }
        return valueCard;
    }

    

    public boolean isBlackjack(String card1, String card2) {
        if (this.parseCard(card1) + this.parseCard(card2) == 21){
            return true;
        }else
            return false;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {
       if (isBlackjack) {
		if (dealerScore < 10) {
			return "W";
		}
		return "S";
	}
	return "P";
}  
    

    public String smallHand(int handScore, int dealerScore) {
        if((handScore >= 17) || ((dealerScore < 7) && (handScore>=12))){
            return "S";
        }else
            return "H";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
