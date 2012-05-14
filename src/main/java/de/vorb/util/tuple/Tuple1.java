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
 * A generic tuple class with one element.
 * 
 * @author Paul Vorbach <paul@vorb.de>
 */
public class Tuple1<T> extends Tuple {
  private final T _1;

  /**
   * Creates a new Tuple1.
   * 
   * @param arg
   *          Value of the tuple
   */
  Tuple1(final T arg) {
    if (arg == null)
      throw new IllegalArgumentException("arg must not be null.");
    _1 = arg;
  }

  /**
   * Returns the value of the tuple.
   * 
   * @return Value of the tuple
   */
  public T _1() {
    return _1;
  }

  /**
   * Creates a String from the tuple.
   * 
   * <p>
   * <code>start + _1() + end</code>
   * </p>
   * 
   * @param start
   *          Prefix
   * @param sep
   *          Separator
   * @param end
   *          Suffix
   * @return String representation of the tuple
   */
  public String mkString(final String start, final String sep, final String end) {
    return start + _1 + end;
  }

  /**
   * Creates a String from the tuple.
   * 
   * <p>
   * <code>"Tuple(" + _1() + ")"</code>
   * </p>
   * 
   * @param sep
   *          Separator
   * @return String representation of the tuple
   */
  public String mkString(final String sep) {
    return mkString();
  }

  /**
   * Creates a String from the tuple.
   * 
   * <p>
   * <code>"Tuple(" + _1() + ")"</code>
   * </p>
   * 
   * @return String representation of the tuple
   */
  public String mkString() {
    return mkString("Tuple(", null, ")");
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    return _1.hashCode();
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals()
   */
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (!(obj instanceof Tuple1)) {
      return _1.equals(obj);
    }
    final Tuple1<?> other = (Tuple1<?>) obj;
    if (_1 == null) {
      if (other._1 != null)
        return false;
    } else if (!_1.equals(other._1))
      return false;
    return true;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return mkString("(", null, ")");
  }
}
