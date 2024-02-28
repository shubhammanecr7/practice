package com.calc.repo;

import com.calc.model.Calculator;

import java.util.List;

public interface CalculatorRepo {
    void saveOperation(Calculator task);

    List<Calculator> showOperations();
}
