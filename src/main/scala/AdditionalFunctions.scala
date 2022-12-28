import scala.annotation.tailrec

def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if a > b then zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))

def isPrime(n : Int) : Boolean =
  @tailrec
  def loop(iter : Int) : Boolean =
    if iter > Math.sqrt(n) then true
    else if n % iter == 0 then false
    else loop(iter + 2)

  if n == 2 then true
  else if n%2 == 0 then false
  else loop(3)

@tailrec
def gcd(a : Int, b: Int): Int =
  if b == 0 then a
  else gcd(b, a%b)

