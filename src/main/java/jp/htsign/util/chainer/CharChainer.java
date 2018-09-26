package jp.htsign.util.chainer;

import java.util.function.*;
import jp.htsign.util.function.*;

public class CharChainer {
  private char value;

  public CharChainer(final char value) {
    this.value = value;
  }

  public <R> Chainer<R> chain(final CharFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BooleanChainer chain(final CharToBooleanFunction func) {
    return new BooleanChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chain(final CharToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chain(final CharToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chain(final CharToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chain(final CharToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chain(final CharToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chain(final CharToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chain(final CharUnaryOperator func) {
    return new CharChainer(func.applyAsChar(value));
  }

  public char getValue() {
    return value;
  }
}