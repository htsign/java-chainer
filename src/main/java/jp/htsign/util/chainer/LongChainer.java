package jp.htsign.util.chainer;

import java.util.function.*;
import jp.htsign.util.function.*;

public class LongChainer {
  private long value;

  public LongChainer(final long value) {
    this.value = value;
  }

  public <R> Chainer<R> chain(final LongFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BoolChainer chainToBool(final LongToBooleanFunction func) {
    return new BoolChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chainToByte(final LongToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chainToShort(final LongToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chainToInt(final LongToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chainToLong(final LongUnaryOperator func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chainToFloat(final LongToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chainToDouble(final LongToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chainToChar(final LongToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }
  
  public void consume(final LongConsumer consumer) {
    consumer.accept(value);
  }

  public long getValue() {
    return value;
  }
}