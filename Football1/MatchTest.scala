package o1.football1

/** A small program that uses the classes `Club` and `Match` to keep track
  * of some football matches. To be customized by the student. */
object MatchTest extends App:    //object선언하고 끝에 콜론 안붙여서 생긴 에러. --> 현상: match1이 죄다 에러뜸.

  val club1 = Club("Manchester United", "Old Trafford")
  val club2 = Club("Liverpool", "Anfield")

  // Create a new match, add some goals and print out some stats.
  val match1 = Match(club2, club1)    /*error: string을 원하는데 club을 보냈다. --> Match.scala에서 매개변수 타입을 Club으로 바꾸기.*/
  match1.addHomeGoal()    /*Match.scala에서 addHomeGoal() 함수가 대문자(A)로 시작.*/
  match1.addAwayGoal()
  match1.addAwayGoal()
  match1.addAwayGoal()
  match1.addHomeGoal()
  println(match1.homeGoals)   //Match.scala에서 homeCount, awayCount가 private상수라서 밖에서 못바꿈. --> 각각 homeGoals, awayGoals로 바꿔서 사용.
  println(match1.awayGoals)
  println(match1.goalDifference)
  println("Is a home win:  " + match1.isHomeWin)    //error: value isHomeWin is not a member of o1.football1.Match --> 이 경우는 def끼리 들여쓰기가 잘못되어 있거나, end의 들여쓰기가 잘못된 경우.
  println("Is an away win: " + match1.isAwayWin)

  // Add some more goals to the same match and print out more stats:
  match1.addHomeGoal()
  match1.addHomeGoal()
  println(match1.totalGoals)    //error: method totalGoals in class Match does not take parameters. 해결: 괄호 없애기
  println(match1.goalDifference)

  // Create another match:
  val match2 = Match(club1, club2)
  // Print out the goals scored by each club in the second match:
  println(match2.homeGoals)
  println(match2.awayGoals)

  // Test which match has the larger total score:
  println(match2.isHigherScoringThan(match1))   //들여쓰기 안되어 있음.
  println(match1.isHigherScoringThan(match2))

  // Check goallessness:
  if match1.isGoalless then   //error: Required: Boolean, Found: Unit. 해결: 스칼라는 if문에서 else문 설정 안하면 에러뜸. else일때 fasle 이도록 작성.
    println("The first match is goalless.")
  if match2.isGoalless then
    println("The second match is goalless.")

  // Print out the locations:
  println(match1.location)    //Match.scala에 location함수가 없음.
  println(match2.location)

  // Print out full descriptions of the matches:
  println(match1)   //에러는 안나는데 REPL실행하면 o1.football1.Match@7f690630로 나옴 --> override toString 짜기(doc. 조건 보고)
  println(match2)   //o1.football1.Match@edf4efb

  // You’ll need to expand this program in order to test all the features
  // of the classes properly.

end MatchTest
