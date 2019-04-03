package jp.htsign.util.chainer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DoubleChainerTest {
  
  DoubleChainer chainer;
  
  @BeforeEach
  void setup() {
    chainer = new DoubleChainer(123.0);
  }
  
  @Test
  void testChainToObj() {
    assertEquals("1.0", chainer.chainToObj(String::valueOf).getValue());
  }
  
  @Test
  void testChainToBool() {
    assertTrue(chainer.chainToBool(d -> d == 123.0).getValue());
  }
  
  @Test
  void testChainToByte() {
    assertEquals((byte) 123, chainer.chainToByte(d -> (byte) d).getValue());
  }

  @Test
  void testChainToShort() {
    assertEquals((short) 123, chainer.chainToShort(d -> (short) d).getValue());
  }
  
  @Test
  void testChainToInt() {
    assertEquals(123, chainer.chainToInt(d -> (int) d).getValue());
  }
  
  @Test
  void testChainToLong() {
    assertEquals(123L, chainer.chainToLong(d -> (long) d).getValue());
  }
  
  @Test
  void testChainToFloat() {
    assertEquals(123.0f, chainer.chainToFloat(d -> (float) d).getValue());
  }
  
  @Test
  void testChain() {
    assertEquals(124.0, (double) chainer.chain(d -> d + 1.0).getValue());
  }
  
  @Test
  void testChainToChar() {
    assertEquals('{', chainer.chainToChar(d -> (char) d).getValue());
  }
  
  @Test
  void testConsume() {
    class MyDouble {
      public double d;
      public void of(double d) {
        this.d = d;
      }
    }
    MyDouble md = new MyDouble();
    chainer.consume(md::of);
    assertEquals(123.0, md.d);
  }

  @Test
  public double testGetValue() {
    assertEquals(123.0, chainer.getValue());
  }
}