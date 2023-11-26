from turtle import Turtle

class Scoreboard(Turtle):
    def __init__(self):
        super().__init__()
        self.score = 0
        self.high_score = 0
        self.hideturtle()
        self.goto(-100, 290)
        self.pencolor('white')
        self.update_score()
        
    def update_score(self):
        self.clear()
        self.read_score()
        self.write(f"score: {self.score}  high score: {self.high_score}", font=("Arial", 15, 'normal'))

    def read_score(self):
        with open("my_score",mode="r") as f:
            h_score = f.read()
        self.high_score = int(h_score)


    def reset(self):
        self.read_score()
        if self.score > self.high_score:
            self.high_score = self.score
            with open("my_score",mode="w") as f:
                self.high_score = f.write(str(self.score))
        self.score = 0


    def increase_score(self):
        self.score += 1
        self.update_score()
       