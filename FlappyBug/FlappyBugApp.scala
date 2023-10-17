package o1.flappy

import o1.*

val scenery =
  val sky    = rectangle(ViewWidth, ViewHeight,  LightBlue)
  val ground = rectangle(ViewWidth, GroundDepth, SandyBrown)
  val tree =
    val trunk   = rectangle(30, 250, SaddleBrown)
    val foliage = circle(200, ForestGreen)
    trunk.onto(foliage, TopCenter, Center)
  val rootedTree = tree.onto(ground, BottomCenter, Pos(ViewWidth / 2, 30))
  sky.place(rootedTree, BottomLeft, BottomLeft)

val bugPic = Pic("ladybug.png")

def rockPic(obstacle: Obstacle) = circle(obstacle.radius * 2, Black)


val game = Game()

object flappyView extends View(game, "FlappyBug"):
  def makePic =
    val obstaclePic = rockPic(game.obstacle)
    scenery.place(obstaclePic, game.obstacle.pos).place(bugPic, game.bug.pos)


@main def launchFlappy() =
  flappyView.start()

