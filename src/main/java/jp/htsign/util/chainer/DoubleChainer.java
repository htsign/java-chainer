package jp.htsign.util.chainer;

import java.util.function.*;
import jp.htsign.util.function.*;

public class DoubleChainer {
  private double value;

  public DoubleChainer(final double value) {
    this.value = value;
  }

  public <R> Chainer<R> chainToObj(final DoubleFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BoolChainer chainToBool(final DoubleToBooleanFunction func) {
    return new BoolChainer(func.applyAsBoolean(value));
  }

  public ByteChainer chainToByte(final DoubleToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chainToShort(final DoubleToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chainToInt(final DoubleToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chainToLong(final DoubleToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chainToFloat(final DoubleToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chain(final DoubleUnaryOperator func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chainToChar(final DoubleToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }
  
  public void consume(final DoubleConsumer consumer) {
    consumer.accept(value);
  }

  public double getValue() {
    return value;
  }
}