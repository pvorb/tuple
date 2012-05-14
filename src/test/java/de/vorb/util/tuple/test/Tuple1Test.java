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

import static de.vorb.util.tuple.Tuple.tuple1;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import de.vorb.util.tuple.Tuple1;

/**
 * Test class for {@link de.vorb.util.tuple.Tuple1}.
 * 
 * @author Paul Vorbach <paul@vorb.de>
 */
public class Tuple1Test {

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple1#Tuple1(Object)}.
   */
  @Test
  public void testTuple1() {
    final Tuple1<String> t = tuple1("test");
    assertThat(t, is(not(nullValue())));
  }

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple1#_1()}.
   */
  @Test
  public void test_1() {
    final String arg = "test";
    final Tuple1<String> t = tuple1(arg);
    assertThat(t._1(), is(equalTo("test")));
    assertThat(t._1(), is(sameInstance(arg)));
  }

  /**
   * Test method for
   * {@link de.vorb.util.tuple.Tuple1#mkString(String, String, String)}.
   */
  @Test
  public void testMkStringStringStringString() {
    final Tuple1<String> t = tuple1("test");
    assertThat(t.mkString("Tuple(", ", ", ")"), is(equalTo("Tuple(test)")));
  }

  /**
   * Test method for
   * {@link de.vorb.util.tuple.Tuple1#mkString(java.lang.String)}.
   */
  @Test
  public void testMkStringString() {
    final Tuple1<String> t = tuple1("test");
    assertThat(t.mkString(", "), is(equalTo("Tuple(test)")));
  }

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple1#mkString()}.
   */
  @Test
  public void testMkString() {
    final Tuple1<String> t = tuple1("test");
    assertThat(t.mkString(), is(equalTo("Tuple(test)")));
  }

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple1#equals(Object)}
   */
  @Test
  public void testHashCode() {
    final Tuple1<String> t = tuple1("test");
    assertThat(t.hashCode(), is(tuple1("test").hashCode()));
    assertThat(t.hashCode(), is(not(tuple1("").hashCode())));
  }

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple1#equals(Object)}.
   */
  @Test
  public void testEqualsObject() {
    final Tuple1<String> t = tuple1("test");
    assertThat(t, is(equalTo(t)));
    assertThat(t, is(not(nullValue())));
    assertThat(t, is(equalTo(tuple1("test"))));
    assertTrue(t.equals("test"));
  }

  /**
   * Test method for {@link de.vorb.util.tuple.Tuple1#toString()}.
   */
  @Test
  public void testToString() {
    final Tuple1<String> t = tuple1("test");
    assertThat(t.toString(), is(equalTo("(test)")));
  }
}
