package com.example.demoprometheus.serivce;

import org.springframework.stereotype.Service;

@Service
public class TimedServiceImpl implements TimedService {
    @Override
    public Long sleep60_000() throws InterruptedException {
        Thread.sleep(60 * 1000);
        return 60 * 1000L;
    }

    @Override
    public Long sleep30_000() throws InterruptedException {
        Thread.sleep(30 * 1000);
        return 30 * 1000L;
    }

    @Override
    public Long sleep10_000() throws InterruptedException {
        Thread.sleep(10 * 1000);
        return 10 * 1000L;
    }

    @Override
    public Long sleep5_000() throws InterruptedException {
        Thread.sleep(5 * 1000);
        return 5 * 1000L;
    }
}
