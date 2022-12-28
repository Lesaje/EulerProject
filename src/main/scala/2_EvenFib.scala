import scala.annotation.tailrec

def fibNum(n: Int): Int =
  if n == 1 then 1
  else if n == 2 then 2
  else fibNum(n - 1) + fibNum(n - 2)

def evenFibonacci(max : Int) : Int =
  @tailrec
  def loop(n : Int, acc : Int) : Int =
    val fib = fibNum(n)
    if      fib >= max then acc
    else if fib%2 == 0 then loop(n+1, acc+fib)
    else                    loop(n+1, acc)
  loop(1, 0)


