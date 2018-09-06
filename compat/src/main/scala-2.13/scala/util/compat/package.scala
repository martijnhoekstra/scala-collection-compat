package scala.util

package object compat {
  /**
   * Adds chaining methods `tap` and `pipe` to every type. See [[ChainingOps]].
   */
  object chainingOps extends ChainingSyntax

  type Using[R] = scala.util.Using[R]
  val Using = scala.util.Using
}
