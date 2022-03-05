# Globals for the directions
# Change the values as you see fit
EAST = 0
NORTH = 1
WEST = 2
SOUTH = 3


class Robot:
    def __init__(self, direction=NORTH, x_pos=0, y_pos=0):
        self.direction = direction
        self.x = x_pos    
        self.y = y_pos
        self.coordinates = self.x, self.y        
        
    def move(self, movements):
        for movement in movements:
            if  movement == 'R': 
                self.direction = (self.direction - 1)%4
            elif movement == 'L': 
                self.direction = (self.direction + 1)%4
            elif movement == 'A': 
                if self.direction == NORTH:
                    self.y += 1
                if self.direction == SOUTH:
                    self.y += -1
                if self.direction == WEST:
                    self.x += -1  
                if self.direction == EAST:
                    self.x += 1
                self.coordinates = self.x, self.y
            else:
                raise Exception("Wrong Instruction Given To Robot!")

