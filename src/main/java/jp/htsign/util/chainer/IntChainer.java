package jp.htsign.util.chainer;

import java.util.function.*;
import jp.htsign.util.function.*;

public class IntChainer {
  private int value;

  public IntChainer(final int value) {
    this.value = value;
  }

  public <R> Chainer<R> chain(final IntFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BooleanChainer chain(final IntToBooleanFunction func) {
    return new BooleanChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chain(final IntToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chain(final IntToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chain(final IntUnaryOperator func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chain(final IntToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chain(final IntToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chain(final IntToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chain(final IntToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }

  public int getValue() {
    return value;
  }
}