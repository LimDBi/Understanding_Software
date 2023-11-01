package o1.football1

/** The class `Match` represents match results in a football match statistics program.
  * A match is played between teams from two clubs: a home club and an away club.
  * Goals scored by either team can be added to the match object.
  *
  * The class is expected to be used so that a match object with no goals is initially
  * created as a real-life match starts. Goals are added incrementally as the match
  * progresses. (A match object has mutable state.)
  *
  * @param home  the club whose team plays at home in the match
  * @param away  the club whose team plays away in the match */
class Match(val home: Club, val away: Club):    //String을 Club으로

  private var homeCount = 0    // stepper: starts at zero and increases as goals are scored
  private var awayCount = 0    // stepper: starts at zero and increases as goals are scored


  /** Returns the number of goals that have been scored (so far) by the home team. */
  def homeGoals = this.homeCount


  /** Returns the number of goals that have been scored (so far) by the away team. */
  def awayGoals = this.awayCount


  /** Returns the total number of goals scored by the two teams. */
  def totalGoals = this.homeGoals + this.awayGoals


  /** Records a goal as having been scored in the match by the home team. */
  def addHomeGoal() =
    this.homeCount = this.homeCount + 1


  /** Records a goal as having been scored in the match by the away team. */
  def addAwayGoal() =
    this.awayCount = this.awayCount + 1


  /** Returns a Boolean value indicating whether the home team won (or would win
    * if the match ended with the current score). Tied scores produce `false`. */
  def isHomeWin = this.homeGoals > this.awayGoals   //def들여쓰기 앞으로 땡기기


  /** Returns a Boolean value indicating whether the away team won (or would win
    * if the match ended with the current score). Tied scores produce `false`. */
  def isAwayWin = this.homeGoals < this.awayGoals


  /** Returns a Boolean value indicating whether the game ended in a draw (or
    * would do so if the match ended with the current score). */
  def isTied = this.homeGoals != this.awayGoals


  /** Determines whether this match is entirely goalless, that is, whether neither
    * team has scored a single goal. */
  def isGoalless = if this.totalGoals > 0 then false else if this.totalGoals == 0 then true else false


  /** Determines whether this match has a higher total score than another given match.
    * @return `true` if more goals were scored in total in this match than in the given match, `false` otherwise */
  def isHigherScoringThan(anotherMatch: Match) =
    this.totalGoals > anotherMatch.totalGoals //error: method totalGoals in class Match does not take parameters. --> totalGoals의 파라미터 anotherMatch를 빼기.


  /** Returns the goal difference of the match. The sign of the number indicates
    * which team scored more goals.
    * @return the goal difference as a positive number if the home team won, a
    *         negative number if the away team won, or zero in case of a tied match */
  def goalDifference =    //equal(=)이 빠짐
    this.homeGoals - this.awayGoals

  //시합이 일어난 경기장의 이름(home team's stadium)을 리턴
  def location =
    home.stadium

  //toString함수짜기
  override def toString =
    if this.isGoalless
      then this.home.name + "vs. " + this.away.name + " at " + this.home.stadium + ": " + "tied at nil-nil"
    else if this.isTied
      then this.home.name + "vs. " + this.away.name + " at " + this.home.stadium + ": " + "tied at " + this.isTied + "- all"
    else if this.isHomeWin
      then this.home.name + "vs. " + this.away.name + " at " + this.home.stadium + ": " + this.homeGoals + "-" + this.awayGoals + "to " + this.home.name
    else if this.isAwayWin
      then this.home.name + "vs. " + this.away.name + " at " + this.home.stadium + ": " + this.homeGoals + "-" + this.awayGoals + "to " + this.away.name
end Match
