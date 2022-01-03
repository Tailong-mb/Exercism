class Matrix:
    def __init__(self, matrix_string):
        self.matrix = [[int(ligne) for ligne in column.split()] for column in matrix_string.split("\n")]

    def row(self, index):
        return self.matrix[index - 1]

    def column(self, index):
        return [column[index - 1] for column in self.matrix]
