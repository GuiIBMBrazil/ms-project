package com.example.hrpayroll.services;

import com.example.hrpayroll.entities.Payment;
import com.example.hrpayroll.entities.Worker;
import com.example.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;


    public Payment getPayment(long workerId, Integer days){

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
