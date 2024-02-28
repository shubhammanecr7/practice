package com.calc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "calculations")
public class Calculator {

    @Id
    private Integer id;
    private int num1;
    private int num2;
    private String operation;
    private Double result;
}