class Luhn:
    def __init__(self, card_num):
        self.card_num = card_num.replace(' ', '')

    def valid(self):
        
        if len(self.card_num) <= 1 or not self.card_num.isnumeric():
            return False
        else:
            result = 0
            for i,c in enumerate(self.card_num):
                if i % 2 == len(self.card_num) % 2 :
                    if int(c)*2 > 9:
                        result += int(c)*2 - 9
                    else:
                        result += int(c)*2 
                else:
                    result += int(c)

            return result%10 == 0
                            
                    
        
