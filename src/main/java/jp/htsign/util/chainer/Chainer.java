package jp.htsign.util.chainer;

import java.util.function.*;
import jp.htsign.util.function.*;

public class Chainer<T> {
  private T value;

  public Chainer(final T value) {
    this.value = value;
  }

  public <R> Chainer<R> chain(final Function<T, R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BoolChainer chainToBool(final ToBooleanFunction<T> func) {
    return new BoolChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chainToByte(final ToByteFunction<T> func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chainToShort(final ToShortFunction<T> func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chainToInt(final ToIntFunction<T> func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chainToLong(final ToLongFunction<T> func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chainToFloat(final ToFloatFunction<T> func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chainToDouble(final ToDoubleFunction<T> func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chainToChar(final ToCharFunction<T> func) {
    return new CharChainer(func.applyAsChar(value));
  }
  
  public void consume(final Consumer<T> consumer) {
    consumer.accept(value);
  }

  public T getValue() {
    return value;
  }
}