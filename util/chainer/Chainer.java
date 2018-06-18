package htsign.util.chainer;

import java.util.function.*;
import htsign.util.function.*;

public class Chainer<T> {
  private T value;

  public Chainer(final T value) {
    this.value = value;
  }

  public <R> Chainer<R> chain(final Function<T, R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BooleanChainer chain(final ToBooleanFunction<T> func) {
    return new BooleanChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chain(final ToByteFunction<T> func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chain(final ToShortFunction<T> func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chain(final ToIntFunction<T> func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chain(final ToLongFunction<T> func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chain(final ToFloatFunction<T> func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chain(final ToDoubleFunction<T> func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chain(final ToCharFunction<T> func) {
    return new CharChainer(func.applyAsChar(value));
  }

  public T getValue() {
    return value;
  }
}