package o1.flappy

import o1.*

class Game:

  // Your code goes here. Please add only what is requested in the ebook. To avoid
  // confusing our automatic assessment system, please don’t invent additions of your own
  // here (at least not before you’re done with the ebook’s official FlappyBug assignments).
  val bug = new Bug ( new Pos (100, 40))
  val obstacle = new Obstacle (70, new Pos (1000, 100))

   def timePasses() = {
    bug.fall()
    obstacle.approach()
  }

  def activateBug() = {
    bug.flap(FlapStrength)
  }


end Game
