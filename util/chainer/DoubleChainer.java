package htsign.util.chainer;

import java.util.function.*;
import htsign.util.function.*;

public class DoubleChainer {
  private double value;

  public DoubleChainer(final double value) {
    this.value = value;
  }

  public <R> Chainer<R> chain(final DoubleFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BooleanChainer chain(final DoubleToBooleanFunction func) {
    return new BooleanChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chain(final DoubleToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chain(final DoubleToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chain(final DoubleToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chain(final DoubleToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chain(final DoubleToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chain(final DoubleUnaryOperator func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chain(final DoubleToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }

  public double getValue() {
    return value;
  }
}