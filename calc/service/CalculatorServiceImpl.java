package com.calc.service;

import com.calc.model.Calculator;
import com.calc.repo.CalculatorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Autowired
    private CalculatorRepo calculatorRepo;

    @Override
    public String doOperation(Calculator task) {
        String operation = task.getOperation();
        if (operation.equals("divide") && task.getNum2() == 0) {
            return "Divide operation not possible if num2 value = 0";
        }
        double result;
        switch (operation) {
            case "add":
                result = task.getNum1() + task.getNum2();
                break;
            case "subtract":
                result = task.getNum1() - task.getNum2();
                break;
            case "multiply":
                result = task.getNum1() * task.getNum2();
                break;
            case "divide":
                result = (double) task.getNum1() / task.getNum2();
                break;
            default:
                return "Invalid operation : " + operation;
        }
        task.setResult(result);
        calculatorRepo.saveOperation(task);
        return operation + " operation complete result is " + result;
    }

    @Override
    public List<Calculator> show() {
        return calculatorRepo.showOperations();
    }
}
