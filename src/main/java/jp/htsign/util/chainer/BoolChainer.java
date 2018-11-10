package jp.htsign.util.chainer;

import java.util.function.*;
import jp.htsign.util.function.*;

public class BoolChainer {
  private boolean value;

  public BoolChainer(final boolean value) {
    this.value = value;
  }

  public <R> Chainer<R> chainToObj(final BoolFunction<R> func) {
    return new Chainer<>(func.apply(value));
  }

  public BoolChainer chain(final BoolUnaryOperator func) {
    return new BoolChainer(func.applyAsBool(value));
  }

  public ByteChainer chainToByte(final BoolToByteFunction func) {
    return new ByteChainer(func.applyAsByte(value));
  }

  public ShortChainer chainToShort(final BoolToShortFunction func) {
    return new ShortChainer(func.applyAsShort(value));
  }

  public IntChainer chainToInt(final BoolToIntFunction func) {
    return new IntChainer(func.applyAsInt(value));
  }

  public LongChainer chainToLong(final BoolToLongFunction func) {
    return new LongChainer(func.applyAsLong(value));
  }

  public FloatChainer chainToFloat(final BoolToFloatFunction func) {
    return new FloatChainer(func.applyAsFloat(value));
  }

  public DoubleChainer chainToDouble(final BoolToDoubleFunction func) {
    return new DoubleChainer(func.applyAsDouble(value));
  }

  public CharChainer chainToChar(final BoolToCharFunction func) {
    return new CharChainer(func.applyAsChar(value));
  }
  
  public void consume(final BoolConsumer consumer) {
    consumer.accept(value);
  }

  public boolean getValue() {
    return value;
  }
}