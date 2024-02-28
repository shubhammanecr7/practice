package com.calc.repo;

import com.calc.model.Calculator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Slf4j
public class CalculatorRepoImpl implements CalculatorRepo {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveOperation(Calculator task) {
        mongoTemplate.save(task);
        log.info("Saved {} operation!", task.getOperation());
    }

    @Override
    public List<Calculator> showOperations() {
        log.info("Returned all operations in DB!");
        return mongoTemplate.findAll(Calculator.class);
    }
}
