package jp.htsign.util.function;

@FunctionalInterface
public interface IntToFloatFunction {
  public float applyAsFloat(int value);
}
