package edu.neu.coe.info6205.union_find;

import edu.neu.coe.info6205.sort.simple.InsertionSort;
import edu.neu.coe.info6205.util.Benchmark;
import edu.neu.coe.info6205.util.Benchmark_Timer;

public class BenchMark_UF {
    public static void main(String[] args) {
        int runTimes = 5000;
        int siteNumber = 2000;
        Benchmark<Boolean> pc = new Benchmark_Timer<>(
                "Timer of path compression",
                null,
                b -> {
                    UF_HWQUPC.count(siteNumber, true);
                },
                null
        );
        double pathCompression = pc.run(true, runTimes);
        System.out.println("The time of " + siteNumber + " sites is:  " + pathCompression);

        Benchmark<Boolean> uf = new Benchmark_Timer<>(
                "Timer of no path compression",
                null,
                b -> {
                    UF_HWQUPC.count(siteNumber, false);
                },
                null
        );
        double noCompression = uf.run(true, runTimes);
        System.out.println("The time of " + siteNumber + " sites is:  " + noCompression);
    }
}
