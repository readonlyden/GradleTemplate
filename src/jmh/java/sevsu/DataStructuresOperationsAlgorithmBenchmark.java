package sevsu;

import org.openjdk.jmh.annotations.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
public class DataStructuresOperationsAlgorithmBenchmark {
    private final int SIZE = 1000;

    private int[] array;
    private LinkedList<Integer> linkedList;

    @Setup(Level.Iteration)
    public void setup() {
        var random = new Random();

        array = new int[SIZE + 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }

        linkedList = new LinkedList<>();
        for (int i = 0; i < SIZE + 1; i++) {
            linkedList.add(random.nextInt());
        }
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public int get1ElementFromArray() {
        return this.array[1];
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public int get1ElementFromList() {
        return this.linkedList.get(1);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public int get10ElementFromArray() {
        return this.array[10];
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public int get10ElementFromList() {
        return this.linkedList.get(10);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public int get100ElementFromArray() {
        return this.array[100];
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public int get100ElementFromList() {
        return this.linkedList.get(100);
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public int get1000ElementFromArray() {
        return this.array[1000];
    }

    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    public int get1000ElementFromList() {
        return this.linkedList.get(1000);
    }
}
