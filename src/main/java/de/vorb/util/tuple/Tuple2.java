/**
 * Copyright © 2012 Paul Vorbach <paul@vorb.de>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.vorb.util.tuple;

/**
 * A generic tuple class with two elements.
 * 
 * @see de.vorb.util.tuple.Tuple for information about creating a Tuple2.
 * 
 * @author Paul Vorbach <paul@vorb.de>
 */
public class Tuple2<T1, T2> extends Tuple {

  private final T1 _1;
  private final T2 _2;

  private Integer  hash = null;

  Tuple2(final T1 arg1, final T2 arg2) {
    if (arg1 == null)
      throw new IllegalArgumentException("arg1 must not be null.");
    if (arg2 == null)
      throw new IllegalArgumentException("arg2 must not be null.");

    _1 = arg1;
    _2 = arg2;
  }

  public T1 _1() {
    return _1;
  }

  public T2 _2() {
    return _2;
  }

  public String mkString(final String start, final String sep, final String end) {
    return start + _1 + sep + _2 + end;
  }

  public String mkString(final String sep) {
    return mkString("Tuple(", sep, ")");
  }

  public String mkString() {
    return mkString(", ");
  }

  @Override
  public int hashCode() {
    if (hash == null) {
      final int prime = 109;
      hash = 1;
      hash = prime * hash + (_1 == null ? 0 : _1.hashCode());
      hash = prime * hash + (_2 == null ? 0 : _2.hashCode());
    }
    return hash.intValue();
  }

  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (!(obj instanceof Tuple2))
      return false;
    final Tuple2<?, ?> other = (Tuple2<?, ?>) obj;
    if (_1 == null) {
      if (other._1 != null)
        return false;
    } else if (!_1.equals(other._1))
      return false;
    if (_2 == null) {
      if (other._2 != null)
        return false;
    } else if (!_2.equals(other._2))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return mkString("(", ", ", ")");
  }
}
