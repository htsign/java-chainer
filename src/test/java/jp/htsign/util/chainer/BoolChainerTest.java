package jp.htsign.util.chainer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoolChainerTest {
  
  BoolChainer chainer;
  
  @BeforeEach
  void setup() {
    chainer = new BoolChainer(true);
  }
  
  @Test
  void testChainToObj() {
    assertEquals("true", chainer.chainToObj(String::valueOf).getValue());
  }
  
  @Test
  void testChain() {
    assertFalse(chainer.chain(b -> !b).getValue());
  }
  
  @Test
  void testChainToByte() {
    assertEquals((byte) 1, chainer.chainToByte(b -> b ? (byte) 1 : (byte) 0).getValue());
  }

  @Test
  void testChainToShort() {
    assertEquals((short) 1, chainer.chainToShort(b -> b ? (short) 1 : (short) 0).getValue());
  }
  
  @Test
  void testChainToInt() {
    assertEquals(1, chainer.chainToInt(b -> b ? 1 : 0).getValue());
  }
  
  @Test
  void testChainToLong() {
    assertEquals(1L, chainer.chainToLong(b -> b ? 1L : 0L).getValue());
  }
  
  @Test
  void testChainToFloat() {
    assertEquals(1.0f, chainer.chainToFloat(b -> b ? 1.0f : 0.0f).getValue());
  }
  
  @Test
  void testChainToDouble() {
    assertEquals(1.0, chainer.chainToDouble(b -> b ? 1.0 : 0.0).getValue());
  }
  
  @Test
  void testChainToChar() {
    assertEquals('a', chainer.chainToChar(b -> b ? 'a' : 'b').getValue());
  }
  
  @Test
  void testConsume() {
    class MyBoolean {
      public boolean b;
      public void of(boolean b) {
        this.b = b;
      }
    }
    MyBoolean mb = new MyBoolean();
    chainer.consume(mb::of);
    assertTrue(mb.b);
  }
  
  @Test
  void testGetValue() {
    assertTrue(chainer.getValue());
  }
}
