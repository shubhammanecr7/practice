package com.calc.service;

import com.calc.model.Calculator;

import java.util.List;

public interface CalculatorService {
    String doOperation(Calculator calculator);

    List<Calculator> show();
}
