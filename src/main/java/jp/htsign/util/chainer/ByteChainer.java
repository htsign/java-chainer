package jp.htsign.util.chainer;

import java.util.function.*;
import jp.htsign.util.function.*;

public class ByteChainer {
  private byte value;

  public ByteChainer(final byte value) {
    this.value = value;
  }

  public <R> Chainer<R> chain(final ByteFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BoolChainer chainToBool(final ByteToBooleanFunction func) {
    return new BoolChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chainToByte(final ByteUnaryOperator func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chainToShort(final ByteToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chainToInt(final ByteToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chainToLong(final ByteToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chainToFloat(final ByteToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chainToDouble(final ByteToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chainToChar(final ByteToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }
  
  public void consume(final ByteConsumer consumer) {
    consumer.accept(value);
  }

  public byte getValue() {
    return value;
  }
}