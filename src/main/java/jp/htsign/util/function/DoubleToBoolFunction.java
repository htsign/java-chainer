package jp.htsign.util.function;

@FunctionalInterface
public interface DoubleToBoolFunction {
  public boolean applyAsBool(double value);
}
