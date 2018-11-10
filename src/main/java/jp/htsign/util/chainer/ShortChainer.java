package jp.htsign.util.chainer;

import java.util.function.*;
import jp.htsign.util.function.*;

public class ShortChainer {
  private short value;

  public ShortChainer(final short value) {
    this.value = value;
  }

  public <R> Chainer<R> chain(final ShortFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BoolChainer chainToBool(final ShortToBooleanFunction func) {
    return new BoolChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chainToByte(final ShortToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chainToShort(final ShortUnaryOperator func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chainToInt(final ShortToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chainToLong(final ShortToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chainToFloat(final ShortToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chainToDouble(final ShortToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chainToChar(final ShortToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }
  
  public void consume(final ShortConsumer consumer) {
    consumer.accept(value);
  }

  public short getValue() {
    return value;
  }
}