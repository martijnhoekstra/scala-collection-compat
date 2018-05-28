package scala.util

package object compat {
  implicit def bias[A, B](src: Either[A, B]) = src.right
  implicit def swappable[A, B](src: Either[A, B]): SwappableEither[A, B] = new SwappableEither[A, B](src)
}