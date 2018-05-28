package scala.util.compat

private[compat] class SwappableEither[+A, +B](underlying: Either[A, B]) {
  def swap: Either[B, A] = underlying match {
    case Right(b) => Left(b)
    case Left(a) => Right(a)
  }
  
}
