package o1.flappy

import o1.*

// This class is introduced in Chapter 2.6.

class Obstacle(val radius: Int, var initialPos: Pos):

  private var currentPos = initialPos
  def pos = this.currentPos

  def approach() =
    this.currentPos = this.currentPos.addX(-ObstacleSpeed)

  override def toString = "center at " + this.pos + ", radius " + this.radius

end Obstacle
