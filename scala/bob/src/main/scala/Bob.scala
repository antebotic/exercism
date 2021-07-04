
object Bob {
  def response(statement: String): String = {
    if(statement.trim.length == 0) "Fine. Be that way!"
    else if(isQuestion(statement)) answerQuestion(statement)
    else if(isAllCapital(statement)) "Whoa, chill out!"
    else "Whatever."
  }

  def isAllCapital(statement: String): Boolean = {
    val r = statement
      .trim
      .replaceAll("[^A-Za-z]","")
      .map(_.isUpper)

    if(r.length > 0) r.reduce(_ && _)
    else false
  }

  def isQuestion(statement: String): Boolean =
    statement.trim.takeRight(1) == "?"

  def answerQuestion(str: String): String = {
    if(isAllCapital(str.trim)) "Calm down, I know what I'm doing!"
    else "Sure."
  }
}
