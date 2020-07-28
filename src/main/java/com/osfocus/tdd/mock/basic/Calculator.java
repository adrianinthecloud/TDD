package com.osfocus.tdd.mock.basic;

public class Calculator {
    private final Processor1 process1;
    private final Processor2 process2;

    public Calculator(Processor1 process1, Processor2 process2) {
        this.process1 = process1;
        this.process2 = process2;
    }

    public long add(long a, long b) {
        return process1.process(a) + process2.process(b);
    }

    public long minus(long a, long b) {
        return process1.process(a) - process2.process(b);
    }

    public long times(long a, long b) {
        return process1.process(a) * process2.process(b);
    }
}
