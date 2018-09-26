package jp.htsign.util.function;

@FunctionalInterface
public interface DoubleToFloatFunction {
  public float applyAsFloat(double value);
}
