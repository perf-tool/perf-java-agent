package com.github.perftool.agent;

import java.lang.instrument.Instrumentation;

public class PerfAgent {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("Perf agent start");
    }

}
