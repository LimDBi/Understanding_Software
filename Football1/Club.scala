package o1.football1

/** The class `Club` represents football clubs in a match statistics system.
  * Only some very basic information for each club is recorded.
  * A club object is immutable once created.
  * @param name     the name of the club
  * @param stadium  the name of the home stadium of the club */
class Club(val name: String, val stadium: String):    //val name, val stadium에서 : String 추가

  /** Produces a textual description of the club (which consists of just the club’s name). */
  override def toString = this.name

end Club    //들여쓰기 되어있어서 오류 생김.
