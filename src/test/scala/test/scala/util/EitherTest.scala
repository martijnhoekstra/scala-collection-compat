package test.scala.util

import org.junit.Test
import org.junit.Assert

import scala.util.compat._

class EitherTest {
  @Test
  def maps(): Unit = {
    val e = Right(2)
    Assert.assertEquals(Right(4), e.map(x => x  * 2))
  }

  @Test
  def swaps(): Unit = {
    val e: Either[String, Int] = Right(2)
    Assert.assertEquals(Left(2), e.swap)
  }

  @Test
  def flatmaps(): Unit = {
    val r1 = Right(1)
    val r2 = Right(2.0)
    val l1 = Left("nope")
    val l2 = Left(new Exception("nope"))

    Assert.assertEquals(
      r2, r1.flatMap(_ => r2)
    )

    Assert.assertEquals(
      l1, r1.flatMap(_ => l1)
    )

    Assert.assertEquals(
      l1, l1.flatMap(_ => l2)
    )

    Assert.assertEquals(
      l1, l1.flatMap(_ => r1)
    )

  }
}