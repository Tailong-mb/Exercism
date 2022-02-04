class School:
    def __init__(self):
        self.rosterGrade = dict()
        self.studentList = list()
        

    def add_student(self, name, grade):
        if name not in self.rosterGrade.keys():
            self.studentList.append(True)
            self.rosterGrade[name] = grade
        else:
            self.studentList.append(False)

    def roster(self):
         return [students for students, grade in sorted(self.rosterGrade.items(), key=lambda item: (item[1],item[0]))]

    def grade(self, grade_number):
        return sorted([students for students,grade in self.rosterGrade.items() if grade == grade_number])

    def added(self):
        return self.studentList;
