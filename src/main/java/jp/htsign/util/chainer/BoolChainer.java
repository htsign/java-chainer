package jp.htsign.util.chainer;

import java.util.function.*;
import jp.htsign.util.function.*;

public class BoolChainer {
  private boolean value;

  public BoolChainer(final boolean value) {
    this.value = value;
  }

  public <R> Chainer<R> chain(final BooleanFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BoolChainer chain(final BooleanUnaryOperator func) {
    return new BoolChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chain(final BooleanToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chain(final BooleanToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chain(final BooleanToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chain(final BooleanToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chain(final BooleanToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chain(final BooleanToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chain(final BooleanToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }

  public boolean getValue() {
    return value;
  }
}