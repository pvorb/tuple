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
 * A generic Tuple.
 * 
 * @author Paul Vorbach <paul@vorb.de>
 */
public abstract class Tuple {
  /**
   * Creates and returns a new Tuple with one element.
   * 
   * @param val
   *          Value of the Tuple
   * @return Tuple with one value
   */
  public static <T> Tuple1<T> tuple1(final T val) {
    return new Tuple1<T>(val);
  }

  /**
   * Creates and returns a new Tuple with two elements.
   * 
   * @param val1
   *          first value of the tuple
   * @param val2
   *          second value of the tuple
   * @return tuple with one value
   */
  public static <T1, T2> Tuple2<T1, T2> tuple2(final T1 val1, final T2 val2) {
    return new Tuple2<T1, T2>(val1, val2);
  }
}
