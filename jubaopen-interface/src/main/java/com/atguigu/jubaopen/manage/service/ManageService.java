package com.atguigu.jubaopen.manage.service;

import com.atguigu.jubaopen.bean.ContractResult;

import java.util.List;
import java.util.Map;

public interface ManageService {


    List<ContractResult> getAll(Map<String,Object> params);


    List<ContractResult> getContractByContractResult();


    int getTotalpage();

    Map<String,Object> getAttributeList();

    Map<String,Object> lookPaymentConditions(String loanContractNum, String borrowerId);

    Map<String,Object> alterPaymentConditions(String loanContractNum, String borrowerId);
}
