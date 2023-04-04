package com.example.TelecomRechargeRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.TelecomRechargeModel.RechargeModel;



public interface RechargeRepository extends JpaRepository<RechargeModel, Long> {
}