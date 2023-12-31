package o1.flappy

import o1.*

class Game:

  val bug       = Bug(Pos(ViewWidth / 10, ViewHeight / 10))
  val obstacles = Vector(Obstacle(70), Obstacle(30), Obstacle(20))

  def activateBug() =
    this.bug.flap(FlapStrength)

  def timePasses() =
    //for obstacle <- this.obstacles do
      //obstacle.approach()
    //for문 대신에 foreach함수를 사용하여 간단화하기
      obstacle.foreach(x => x.approach())
    this.bug.fall()

  def isLost =
    var isDeadAlready = !this.bug.isInBounds
    for obstacle <- this.obstacles do
      if obstacle.touches(bug) then
        isDeadAlready = true
    isDeadAlready

end Game
