package htsign.util.chainer;

import java.util.function.*;
import htsign.util.function.*;

public class ByteChainer {
  private byte value;

  public ByteChainer(final byte value) {
    this.value = value;
  }

  public <R> Chainer<R> chain(final ByteFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BooleanChainer chain(final ByteToBooleanFunction func) {
    return new BooleanChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chain(final ByteUnaryOperator func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chain(final ByteToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chain(final ByteToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chain(final ByteToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chain(final ByteToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chain(final ByteToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chain(final ByteToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }

  public byte getValue() {
    return value;
  }
}