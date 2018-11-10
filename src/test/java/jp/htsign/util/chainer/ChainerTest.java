package jp.htsign.util.chainer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ChainerTest {
  
  Chainer<String> chainer;
  
  @BeforeEach
  void setup() {
    chainer = new Chainer<>("123");
  }
  
  @Test
  void testChain() {
    assertEquals("123456", chainer.chain(s -> (s + "456")).getValue());
  }
  
  @Test
  void testChainToBool() {
    assertTrue(chainer.chainToBool(s -> s.equals("123")).getValue());
  }
  
  @Test
  void testChainToByte() {
    assertEquals((byte) 123, chainer.chainToByte(Byte::parseByte).getValue());
  }

  @Test
  void testChainToShort() {
    assertEquals((short) 123, chainer.chainToShort(Short::parseShort).getValue());
  }
  
  @Test
  void testChainToInt() {
    assertEquals(123, chainer.chainToInt(Integer::parseInt).getValue());
  }
  
  @Test
  void testChainToLong() {
    assertEquals(123L, chainer.chainToLong(Long::parseLong).getValue());
  }
  
  @Test
  void testChainToFloat() {
    assertEquals(123.0f, chainer.chainToFloat(Float::parseFloat).getValue());
  }
  
  @Test
  void testChainToDouble() {
    assertEquals(123.0, chainer.chainToDouble(Double::parseDouble).getValue());
  }
  
  @Test
  void testChainToChar() {
    assertEquals('{', chainer.chainToChar(s -> (char) Integer.parseInt(s)).getValue());
  }
  
  @Test
  void testConsume() {
    class MyString {
      public String s;
      public void of(String s) {
        this.s = s;
      }
    }
    MyString ms = new MyString();
    chainer.consume(ms::of);
    assertEquals("123", ms.s);
  }
  
  @Test
  void testGetValue() {
    assertEquals("123", chainer.getValue());
  }
}
