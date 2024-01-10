package com.example.demoprometheus.serivce;

public interface TimedService {

    public Long sleep60_000() throws InterruptedException;

    public Long sleep30_000() throws InterruptedException;

    public Long sleep10_000() throws InterruptedException;

    public Long sleep5_000() throws InterruptedException;
}
