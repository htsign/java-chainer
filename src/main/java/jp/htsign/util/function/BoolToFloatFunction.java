package jp.htsign.util.function;

@FunctionalInterface
public interface BoolToFloatFunction {
  public float applyAsFloat(boolean value);
}
