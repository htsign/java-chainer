package jp.htsign.util.function;

@FunctionalInterface
public interface FloatToBoolFunction {
  public boolean applyAsBool(float value);
}
