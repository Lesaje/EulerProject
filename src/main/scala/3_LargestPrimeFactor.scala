import scala.annotation.tailrec

def largestPrimeFactor(target : Long) : Int =
  @tailrec
  def loop(primes : List[Int], iter: Int, n: Long) : List[Int] =
    if iter > Math.sqrt(n) then primes
    else if checkFactorization(iter, n) then loop(iter :: primes, iter+1, n)
    else loop(primes, iter+1, n)
  loop(List(2), 3, target).max

def checkFactorization(n: Int, target: Long): Boolean =
  if !isPrime(n) then false
  else if target % n == 0 then true
  else false
