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
package de.vorb.util.tuple.test;

import static de.vorb.util.tuple.Tuple.tuple2;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import de.vorb.util.tuple.Tuple2;

/**
 * Test class for Tuple2.
 * 
 * @author Paul Vorbach <paul@vorb.de>
 */
public class Tuple2Test {

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple2#Tuple2(Object, Object)}.
   */
  @Test
  public void testTuple2() {
    final Tuple2<String, String> t = tuple2("a", "b");
    assertThat(t, is(not(sameInstance(null))));
  }

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple2#_1()}.
   */
  @Test
  public void test_1() {
    final String arg = "a";
    final Tuple2<String, String> t = tuple2(arg, "b");
    assertThat(t._1(), is(equalTo("a")));
    assertThat(t._1(), is(arg));
  }

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple2#_2()}.
   */
  @Test
  public void test_2() {
    final String arg = "b";
    final Tuple2<String, String> t = tuple2("a", arg);
    assertThat(t._2(), is(equalTo("b")));
    assertThat(t._2(), is(arg));
  }

  /**
   * Test method for
   * {@link de.vorb.util.tuple.Tuple2#mkString(String, String, String)}.
   */
  @Test
  public void testMkStringStringStringString() {
    final Tuple2<String, String> t = tuple2("a", "b");
    assertThat(t.mkString("Tuple(", ", ", ")"), is(equalTo("Tuple(a, b)")));
  }

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple2#mkString(String)}.
   */
  @Test
  public void testMkStringString() {
    final Tuple2<String, String> t = tuple2("a", "b");
    assertThat(t.mkString(", "), is(equalTo("Tuple(a, b)")));
  }

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple2#mkString()}.
   */
  @Test
  public void testMkString() {
    final Tuple2<String, String> t = tuple2("a", "b");
    assertThat(t.mkString(), is(equalTo("Tuple(a, b)")));
  }

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple2#hashCode()}.
   */
  @Test
  public void testHashCode() {
    final Tuple2<String, String> t1 = tuple2("a", "b");
    final Tuple2<String, String> t2 = tuple2("b", "a");
    assertThat(t1.hashCode(), is(not(t2.hashCode())));
    assertThat(t1.hashCode(), is(t1.hashCode()));
    assertThat(t2.hashCode(), is(t2.hashCode()));
    assertThat(t1.hashCode(), is(tuple2("a", "b").hashCode()));
  }

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple2#equals(Object)}.
   */
  @Test
  public void testEqualsObject() {
    final Tuple2<String, String> t = tuple2("a", "b");
    assertThat(t, is(equalTo(tuple2("a", "b"))));
    assertThat(t, is(not(equalTo(tuple2("a", "a")))));
    assertThat(t, is(not(equalTo(tuple2("b", "b")))));
    assertThat(t, is(not(equalTo(tuple2("b", "a")))));
  }

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple2#toString()}.
   */
  @Test
  public void testToString() {
    final Tuple2<String, String> t = tuple2("a", "b");
    assertThat(t.toString(), is(equalTo("(a, b)")));
  }
}
