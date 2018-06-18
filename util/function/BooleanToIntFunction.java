package htsign.util.function;

@FunctionalInterface
public interface BooleanToIntFunction {
  public int applyAsInt(boolean value);
}
