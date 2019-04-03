package jp.htsign.util.chainer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ByteChainerTest {
  
  ByteChainer chainer;
  
  @BeforeEach
  void setup() {
    chainer = new ByteChainer((byte) 1);
  }
  
  @Test
  void testChainToObj() {
    assertEquals("1", chainer.chainToObj(String::valueOf).getValue());
  }
  
  @Test
  void testChainToBool() {
    assertTrue(chainer.chainToBool(b -> b == (byte) 1).getValue());
  }
  
  @Test
  void testChain() {
    assertEquals((byte) 1, chainer.chain(b -> b).getValue());
  }

  @Test
  void testChainToShort() {
    assertEquals((short) 1, chainer.chainToShort(b -> (short) b).getValue());
  }
  
  @Test
  void testChainToInt() {
    assertEquals(1, chainer.chainToInt(b -> (int) b).getValue());
  }
  
  @Test
  void testChainToLong() {
    assertEquals(1L, chainer.chainToLong(b -> (long) b).getValue());
  }
  
  @Test
  void testChainToFloat() {
    assertEquals(1.0f, chainer.chainToFloat(b -> (float) b).getValue());
  }
  
  @Test
  void testChainToDouble() {
    assertEquals(1.0, chainer.chainToDouble(b -> (double) b).getValue());
  }
  
  @Test
  void testChainToChar() {
    assertEquals('a', chainer.chainToChar(b -> b == (byte) 1 ? 'a' : 'b').getValue());
  }
  
  @Test
  void testConsume() {
    class MyByte {
      public byte b;
      public void of(byte b) {
        this.b = b;
      }
    }
    MyByte mb = new MyByte();
    chainer.consume(mb::of);
    assertEquals((byte) 1, mb.b);
  }
  
  @Test
  void testGetValue() {
    assertEquals((byte) 1, chainer.getValue());
  }
}
