def multiplesOf3Or5 (from : Int, to : Int): Int =
    def ifNumberCorrect(n: Int): Int =
      if n%3 == 0 || n%5 == 0 then n
      else 0
    mapReduce(ifNumberCorrect, (x:Int, y:Int) => x+y, 0)(from, to)
