package o1.flappy

import o1.*

// Define class Bug here.
  class Bug ( var pos: Pos ) {
  val radius = BugRadius
  def fall() = {
    this.pos = this.pos.addY(FallingSpeed)
  }
  def flap (WingPower: Double) = {
    this.pos = this.pos.addY(-FlapStrength)
  }
  override def toString = "center at ( " + pos.x + "," + pos.y + "), radius " + BugRadius
}
