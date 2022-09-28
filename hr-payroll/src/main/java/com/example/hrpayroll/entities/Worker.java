package com.example.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Worker implements Serializable {

    private Long id;
    private String name;
    private Double dailyIncome;
}
