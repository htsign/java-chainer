package jp.htsign.util.function;

@FunctionalInterface
public interface BoolUnaryOperator {
  public boolean applyAsBool(boolean value);
}
