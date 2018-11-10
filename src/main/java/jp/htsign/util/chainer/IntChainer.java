package jp.htsign.util.chainer;

import java.util.function.*;
import jp.htsign.util.function.*;

public class IntChainer {
  private int value;

  public IntChainer(final int value) {
    this.value = value;
  }

  public <R> Chainer<R> chainToObj(final IntFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BoolChainer chainToBool(final IntToBooleanFunction func) {
    return new BoolChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chainToByte(final IntToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chainToShort(final IntToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chain(final IntUnaryOperator func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chainToLong(final IntToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chainToFloat(final IntToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chainToDouble(final IntToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chainToChar(final IntToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }
  
  public void consume(final IntConsumer consumer) {
    consumer.accept(value);
  }

  public int getValue() {
    return value;
  }
}