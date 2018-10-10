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

  public BoolChainer chainToBool(final BooleanUnaryOperator func) {
    return new BoolChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chainToByte(final BooleanToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chainToShort(final BooleanToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chainToInt(final BooleanToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chainToLong(final BooleanToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chainToFloat(final BooleanToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chainToDouble(final BooleanToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chainToChar(final BooleanToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }

  public boolean getValue() {
    return value;
  }
}