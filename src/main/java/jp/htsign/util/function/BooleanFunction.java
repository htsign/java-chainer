package htsign.util.function;

@FunctionalInterface
public interface BooleanFunction<T> {
  public T apply(boolean value);
}
