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

  public BooleanChainer chain(final ShortToBooleanFunction func) {
    return new BooleanChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chain(final ShortToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chain(final ShortUnaryOperator func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chain(final ShortToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chain(final ShortToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chain(final ShortToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chain(final ShortToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chain(final ShortToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }

  public short getValue() {
    return value;
  }
}