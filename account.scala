// At this stage, you don’t have to worry about the definitions immediately below this text.
package o1.singletons

import scala.math.*   // Math functions will come in handy in this assignment.

// CHAPTER 2.2: Define the account object below.

object account:
  val number = "1234567"
  var balance = 0
  def deposit(sum: Int) = {
    this.balance = this.balance + max(sum, 0)
  }
  def withdraw(sum: Int) = {
    val withdrawn = max(min(sum, this.balance), 0)
    this.balance = this.balance - withdrawn
    withdrawn
  }

  // Write your code here. Remember to indent it appropriately.

end account

