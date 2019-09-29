package scala.jdk.japaapi

import scala.collection.{mutable, concurrent}
import scala.collection.{JavaConversions => JC}
import java.{lang => jl, util => ju}
import java.util.{concurrent => juc}

object CollectionConverters {
  /**
   * Converts a Scala `Iterator` to a Java `Iterator`.
   *
   * The returned Java `Iterator` is backed by the provided Scala `Iterator` and any side-effects of
   * using it via the Java interface will be visible via the Scala interface and vice versa.
   *
   * If the Scala `Iterator` was previously obtained from an implicit or explicit call of
   * `asScala` then the original Java `Iterator` will be returned.
   *
   * @param i The Scala `Iterator` to be converted.
   * @return  A Java `Iterator` view of the argument.
   */
  def asJava[A](i: Iterator[A]): ju.Iterator[A] = JC.asJavaIterator(i)
  
  /**
   * Converts a Scala `Iterator` to a Java `Enumeration`.
   *
   * The returned Java `Enumeration` is backed by the provided Scala `Iterator` and any side-effects
   * of using it via the Java interface will be visible via the Scala interface and vice versa.
   *
   * If the Scala `Iterator` was previously obtained from an implicit or explicit call of
   * `asScala` then the original Java `Enumeration` will be returned.
   *
   * @param i The Scala `Iterator` to be converted.
   * @return  A Java `Enumeration` view of the argument.
   */
  def asJavaEnumeration[A](i: Iterator[A]): ju.Enumeration[A] =
    JC.asJavaEnumeration(i)
  
  /**
   * Converts a Scala `Iterable` to a Java `Iterable`.
   *
   * The returned Java `Iterable` is backed by the provided Scala `Iterable` and any side-effects of
   * using it via the Java interface will be visible via the Scala interface and vice versa.
   *
   * If the Scala `Iterable` was previously obtained from an implicit or explicit call of
   * `asScala` then the original Java `Iterable` will be returned.
   *
   * @param i The Scala `Iterable` to be converted.
   * @return  A Java `Iterable` view of the argument.
   */
  def asJava[A](i: Iterable[A]): jl.Iterable[A] = JC.asJavaIterable(i)

  /**
   * Converts a Scala `Iterable` to an immutable Java `Collection`.
   *
   * If the Scala `Iterable` was previously obtained from an implicit or explicit call of
   * `asScala` then the original Java `Collection` will be returned.
   *
   * @param i The Scala `Iterable` to be converted.
   * @return  A Java `Collection` view of the argument.
   */
  def asJavaCollection[A](i: Iterable[A]): ju.Collection[A] =
    JC.asJavaCollection(i)

  /**
   * Converts a Scala `Iterable` to an immutable Java `Collection`.
   *
   * If the Scala `Iterable` was previously obtained from an implicit or explicit call of
   * `asScala` then the original Java `Collection` will be returned.
   *
   * @param i The Scala `Iterable` to be converted.
   * @return  A Java `Collection` view of the argument.
   */
  def asJava[A](b: mutable.Buffer[A]): ju.List[A] = JC.bufferAsJavaList(b)
  
  /**
   * Converts a Scala mutable `Seq` to a Java `List`.
   *
   * The returned Java `List` is backed by the provided Scala `Seq` and any side-effects of using it
   * via the Java interface will be visible via the Scala interface and vice versa.
   * @param s The Scala `Seq` to be converted.
   * @return  A Java `List` view of the argument.
   */
  def asJava[A](s: mutable.Seq[A]): ju.List[A] = JC.mutableSeqAsJavaList(s)
  
  /**
   * Converts a Scala `Seq` to a Java `List`.
   *
   * If the Scala `Seq` was previously obtained from an implicit or explicit call of
   * `asScala` then the original Java `List` will be returned.
   *
   * @param s The Scala `Seq` to be converted.
   * @return  A Java `List` view of the argument.
   */
  def asJava[A](s: Seq[A]): ju.List[A] = JC.seqAsJavaList(s)
  
  /**
   * Converts a Scala mutable `Set` to a Java `Set`.
   *
   * If the Scala `Set` was previously obtained from an implicit or explicit call of
   * `asScala` then the original Java `Set` will be returned.
   *
   * @param s The Scala mutable `Set` to be converted.
   * @return  A Java `Set` view of the argument.
   */
  def asJava[A](s: mutable.Set[A]): ju.Set[A] = JC.mutableSetAsJavaSet(s)
  
  /**
   * Converts a Scala `Set` to a Java `Set`.
   *
   * The returned Java `Set` is backed by the provided Scala `Set` and any side-effects of using it
   * via the Java interface will be visible via the Scala interface and vice versa.
   *
   * If the Scala `Set` was previously obtained from an implicit or explicit call of
   * `asScala` then the original Java `Set` will be returned.
   *
   * @param s The Scala `Set` to be converted.
   * @return  A Java `Set` view of the argument.
   */
  def asJava[A](s: Set[A]): ju.Set[A] = JC.setAsJavaSet(s)
  
  /**
   * Converts a Scala mutable `Map` to a Java `Map`.
   *
   * The returned Java `Map` is backed by the provided Scala `Map` and any side-effects of using it
   * via the Java interface will be visible via the Scala interface and vice versa.
   *
   * If the Scala `Map` was previously obtained from an implicit or explicit call of
   * `asScala` then the original Java `Map` will be returned.
   *
   * @param m The Scala mutable `Map` to be converted.
   * @return  A Java `Map` view of the argument.
   */
  def asJava[K, V](m: mutable.Map[K, V]): ju.Map[K, V] = JC.mutableMapAsJavaMap(m)
  
  /**
   * Converts a Scala mutable `Map` to a Java `Dictionary`.
   *
   * The returned Java `Dictionary` is backed by the provided Scala `Dictionary` and any
   * side-effects of using it via the Java interface will be visible via the Scala interface and
   * vice versa.
   *
   * If the Scala `Map` was previously obtained from an implicit or explicit call of
   * `asScala` then the original Java `Dictionary` will be returned.
   *
   * @param m The Scala `Map` to be converted.
   * @return  A Java `Dictionary` view of the argument.
   */
  def asJavaDictionary[K, V](m: mutable.Map[K, V]): ju.Dictionary[K, V] =
    JC.asJavaDictionary(m)
  
  /**
   * Converts a Scala `Map` to a Java `Map`.
   *
   * The returned Java `Map` is backed by the provided Scala `Map` and any side-effects of using it
   * via the Java interface will be visible via the Scala interface and vice versa.
   *
   * If the Scala `Map` was previously obtained from an implicit or explicit call of
   * `asScala` then the original Java `Map` will be returned.
   *
   * @param m The Scala `Map` to be converted.
   * @return  A Java `Map` view of the argument.
   */
  def asJava[K, V](m: Map[K, V]): ju.Map[K, V] = JC.mapAsJavaMap(m)
  
  /**
   * Converts a Scala mutable `concurrent.Map` to a Java `ConcurrentMap`.
   *
   * The returned Java `ConcurrentMap` is backed by the provided Scala `concurrent.Map` and any
   * side-effects of using it via the Java interface will be visible via the Scala interface and
   * vice versa.
   *
   * If the Scala `concurrent.Map` was previously obtained from an implicit or explicit call of
   * `asScala` then the original Java `ConcurrentMap` will be returned.
   *
   * @param m The Scala `concurrent.Map` to be converted.
   * @return  A Java `ConcurrentMap` view of the argument.
   */
  def asJava[K, V](m: concurrent.Map[K, V]): juc.ConcurrentMap[K, V] = JC.mapAsJavaConcurrentMap(m)

  /**
   * Converts a Java `Iterator` to a Scala `Iterator`.
   *
   * The returned Scala `Iterator` is backed by the provided Java `Iterator` and any side-effects of
   * using it via the Scala interface will be visible via the Java interface and vice versa.
   *
   * If the Java `Iterator` was previously obtained from an implicit or explicit call of
   * `asJava` then the original Scala `Iterator` will be returned.
   *
   * @param i The Java `Iterator` to be converted.
   * @return  A Scala `Iterator` view of the argument.
   */
  def asScala[A](i: ju.Iterator[A]): Iterator[A] = JC.asScalaIterator(i)
  
  /**
   * Converts a Java `Enumeration` to a Scala `Iterator`.
   *
   * The returned Scala `Iterator` is backed by the provided Java `Enumeration` and any side-effects
   * of using it via the Scala interface will be visible via the Java interface and vice versa.
   *
   * If the Java `Enumeration` was previously obtained from an implicit or explicit call of
   * `asJavaEnumeration` then the original Scala `Iterator` will be returned.
   *
   * @param e The Java `Enumeration` to be converted.
   * @return  A Scala `Iterator` view of the argument.
   */
  def asScala[A](e: ju.Enumeration[A]): Iterator[A] = JC.enumerationAsScalaIterator(e)
  
  /**
   * Converts a Java `Iterable` to a Scala `Iterable`.
   *
   * The returned Scala `Iterable` is backed by the provided Java `Iterable` and any side-effects of
   * using it via the Scala interface will be visible via the Java interface and vice versa.
   *
   * If the Java `Iterable` was previously obtained from an implicit or explicit call of
   * `asJava` then the original Scala `Iterable` will be returned.
   *
   * @param i The Java `Iterable` to be converted.
   * @return  A Scala `Iterable` view of the argument.
   */
  def asScala[A](i: jl.Iterable[A]): Iterable[A] = JC.iterableAsScalaIterable(i)
  
  /**
   * Converts a Java `Collection` to a Scala `Iterable`.
   *
   * If the Java `Collection` was previously obtained from an implicit or explicit call of
   * `asJavaCollection` then the original Scala `Iterable` will be returned.
   *
   * @param c The Java `Collection` to be converted.
   * @return  A Scala `Iterable` view of the argument.
   */
  def asScala[A](c: ju.Collection[A]): Iterable[A] = JC.collectionAsScalaIterable(c)
  
  /**
   * Converts a Java `List` to a Scala mutable `Buffer`.
   *
   * The returned Scala `Buffer` is backed by the provided Java `List` and any side-effects of using
   * it via the Scala interface will be visible via the Java interface and vice versa.
   *
   * If the Java `List` was previously obtained from an implicit or explicit call of
   * `asJava` then the original Scala `Buffer` will be returned.
   *
   * @param l The Java `List` to be converted.
   * @return A Scala mutable `Buffer` view of the argument.
   */
  def asScala[A](l: ju.List[A]): mutable.Buffer[A] = JC.asScalaBuffer(l)
  
  /**
   * Converts a Java `Set` to a Scala mutable `Set`.
   *
   * The returned Scala `Set` is backed by the provided Java `Set` and any side-effects of using it
   * via the Scala interface will be visible via the Java interface and vice versa.
   *
   * If the Java `Set` was previously obtained from an implicit or explicit call of
   * `asJava` then the original Scala `Set` will be returned.
   *
   * @param s The Java `Set` to be converted.
   * @return  A Scala mutable `Set` view of the argument.
   */
  def asScala[A](s: ju.Set[A]): mutable.Set[A] = JC.asScalaSet(s)
  
  /**
   * Converts a Java `Map` to a Scala mutable `Map`.
   *
   * The returned Scala `Map` is backed by the provided Java `Map` and any side-effects of using it
   * via the Scala interface will be visible via the Java interface and vice versa.
   *
   * If the Java `Map` was previously obtained from an implicit or explicit call of
   * `asJava` then the original Scala `Map` will be returned.
   *
   * If the wrapped map is synchronized (e.g. from `java.util.Collections.synchronizedMap`), it is
   * your responsibility to wrap all non-atomic operations with `underlying.synchronized`.
   * This includes `get`, as `java.util.Map`'s API does not allow for an atomic `get` when `null`
   * values may be present.
   *
   * @param m The Java `Map` to be converted.
   * @return  A Scala mutable `Map` view of the argument.
   */
  def asScala[A, B](m: ju.Map[A, B]): mutable.Map[A, B] = JC.mapAsScalaMap(m)
  
  /**
   * Converts a Java `ConcurrentMap` to a Scala mutable `ConcurrentMap`.
   *
   * The returned Scala `ConcurrentMap` is backed by the provided Java `ConcurrentMap` and any
   * side-effects of using it via the Scala interface will be visible via the Java interface and
   * vice versa.
   *
   * If the Java `ConcurrentMap` was previously obtained from an implicit or explicit call of
   * `asJava` then the original Scala `ConcurrentMap` will be returned.
   *
   * @param m The Java `ConcurrentMap` to be converted.
   * @return  A Scala mutable `ConcurrentMap` view of the argument.
   */
  def asScala[A, B](m: juc.ConcurrentMap[A, B]): concurrent.Map[A, B] =
    JC.mapAsScalaConcurrentMap(m)
  
  /**
   * Converts a Java `Dictionary` to a Scala mutable `Map`.
   *
   * The returned Scala `Map` is backed by the provided Java `Dictionary` and any side-effects of
   * using it via the Scala interface will be visible via the Java interface and vice versa.
   *
   * If the Java `Dictionary` was previously obtained from an implicit or explicit call of
   * `asJavaDictionary` then the original Scala `Map` will be returned.
   *
   * @param d The Java `Dictionary` to be converted.
   * @return  A Scala mutable `Map` view of the argument.
   */
  def asScala[A, B](d: ju.Dictionary[A, B]): mutable.Map[A, B] = JC.dictionaryAsScalaMap(d)
  
  /**
   * Converts a Java `Properties` to a Scala mutable `Map[String, String]`.
   *
   * The returned Scala `Map[String, String]` is backed by the provided Java `Properties` and any
   * side-effects of using it via the Scala interface will be visible via the Java interface and
   * vice versa.
   *
   * @param p The Java `Properties` to be converted.
   * @return  A Scala mutable `Map[String, String]` view of the argument.
   */
  def asScala(p: ju.Properties): mutable.Map[String, String] = JC.propertiesAsScalaMap(p)
}