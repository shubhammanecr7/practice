package com.calc.controller;

import com.calc.model.Calculator;
import com.calc.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calc")
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;
    @PostMapping("/operate")
    public String calculateOperation(@RequestBody Calculator task){
        return calculatorService.doOperation(task);
    }

    @GetMapping("/show")
    public List<Calculator> show(){
        return calculatorService.show();
    }

}
