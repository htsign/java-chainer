package htsign.util.function;

@FunctionalInterface
public interface ByteFunction<T> {
  public T apply(byte value);
}
