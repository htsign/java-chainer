package jp.htsign.util.function;

@FunctionalInterface
public interface BoolToCharFunction {
  public char applyAsChar(boolean value);
}
