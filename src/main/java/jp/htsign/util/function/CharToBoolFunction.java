package jp.htsign.util.function;

@FunctionalInterface
public interface CharToBoolFunction {
  public boolean applyAsBool(char value);
}
