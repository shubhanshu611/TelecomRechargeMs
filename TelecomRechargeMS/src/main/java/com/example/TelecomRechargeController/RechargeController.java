package com.example.TelecomRechargeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TelecomRechargeModel.RechargeModel;
import com.example.TelecomRechargeRepository.RechargeRepository;

@RestController
@RequestMapping("/api/recharges")
public class RechargeController {

    @Autowired
    private RechargeRepository rechargeRepository;

    @PostMapping
    public ResponseEntity<RechargeModel> createRecharge(@RequestBody RechargeModel recharge) {
        RechargeModel savedRecharge = rechargeRepository.save(recharge);
        return new ResponseEntity<>(savedRecharge, HttpStatus.CREATED);
    }
}