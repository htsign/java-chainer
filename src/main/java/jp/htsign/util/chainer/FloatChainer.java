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

  public BoolChainer chainToBool(final FloatToBooleanFunction func) {
    return new BoolChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chainToByte(final FloatToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chainToShort(final FloatToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chainToInt(final FloatToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chainToLong(final FloatToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chainToFloat(final FloatUnaryOperator func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chainToDouble(final FloatToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chainToChar(final FloatToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }

  public float getValue() {
    return value;
  }
}