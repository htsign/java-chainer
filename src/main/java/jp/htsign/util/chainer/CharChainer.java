package jp.htsign.util.chainer;

import java.util.function.*;
import jp.htsign.util.function.*;

public class CharChainer {
  private char value;

  public CharChainer(final char value) {
    this.value = value;
  }

  public <R> Chainer<R> chainToObj(final CharFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BoolChainer chainToBool(final CharToBooleanFunction func) {
    return new BoolChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chainToByte(final CharToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chainToShort(final CharToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chainToInt(final CharToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chainToLong(final CharToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chainToFloat(final CharToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chainToDouble(final CharToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chain(final CharUnaryOperator func) {
    return new CharChainer(func.applyAsChar(value));
  }
  
  public void consume(final CharConsumer consumer) {
    consumer.accept(value);
  }

  public char getValue() {
    return value;
  }
}