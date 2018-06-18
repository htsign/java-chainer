package htsign.util.function;

@FunctionalInterface
public interface BooleanToCharFunction {
  public char applyAsChar(boolean value);
}
