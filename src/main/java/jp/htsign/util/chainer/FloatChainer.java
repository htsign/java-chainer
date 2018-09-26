package jp.htsign.util.chainer;

import java.util.function.*;
import jp.htsign.util.function.*;

public class FloatChainer {
  private float value;

  public FloatChainer(final float value) {
    this.value = value;
  }

  public <R> Chainer<R> chain(final FloatFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BooleanChainer chain(final FloatToBooleanFunction func) {
    return new BooleanChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chain(final FloatToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chain(final FloatToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chain(final FloatToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chain(final FloatToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chain(final FloatUnaryOperator func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chain(final FloatToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chain(final FloatToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }

  public float getValue() {
    return value;
  }
}