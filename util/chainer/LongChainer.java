package htsign.util.chainer;

import java.util.function.*;
import htsign.util.function.*;

public class LongChainer {
  private long value;

  public LongChainer(final long value) {
    this.value = value;
  }

  public <R> Chainer<R> chain(final LongFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BooleanChainer chain(final LongToBooleanFunction func) {
    return new BooleanChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chain(final LongToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chain(final LongToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chain(final LongToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chain(final LongUnaryOperator func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chain(final LongToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chain(final LongToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chain(final LongToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }

  public long getValue() {
    return value;
  }
}