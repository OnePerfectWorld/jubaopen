package com.atguigu.jubaopen.manage.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.atguigu.jubaopen.bean.*;
import com.atguigu.jubaopen.manage.mapper.*;
import com.atguigu.jubaopen.manage.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ManageServiceImpl implements ManageService {

    @Autowired
    private ManageMapper manageMapper;

    @Autowired
    private BusinessTypeInfoMapper businessTypeInfoMapper;

    @Autowired
    private ContractTypeInfoMapper contractTypeInfoMapper;

    @Autowired
    private TrustInstitutionInfoMapper trustInstitutionInfoMapper;

    @Autowired
    private TrustPlanInfoMapper trustPlanInfoMapper;

    @Autowired
    private TrustProductsInfoMapper trustProductsInfoMapper;

    @Autowired
    private TypeContractChangeInfoMapper typeContractChangeInfoMapper;

    @Autowired
    private NplmBorrowerInfoMapper nplmBorrowerInfoMapper;

    @Autowired
    private  NplmContractAttributeMapper nplmContractAttributeMapper;

    @Autowired
    private NplmLoanContractMapper nplmLoanContractMapper;

    @Autowired
    private NplmRepaymentDetailMapper nplmRepaymentDetailMapper;

    @Autowired
    private NplmOverdueContractMapper nplmOverdueContractMapper;

    @Autowired
    private NplmRepaymentPlanMapper nplmRepaymentPlanMapper;

    @Autowired
    private NplmRepaymentRecordMapper nplmRepaymentRecordMapper;


    @Override
    public Map<String, Object> lookPaymentConditions(String loanContractNum, String borrowerId) {
        Map<String,Object> map = new HashMap<>();

        return null;
    }

    @Override
    public Map<String, Object> alterPaymentConditions(String loanContractNum, String borrowerId) {
        return null;
    }

    @Override
    public List<ContractResult> getAll(Map<String,Object> params) {
        

        List<ContractResult> contractResultList = manageMapper.getAll(params);
        return contractResultList;
    }

    @Override
    public List<ContractResult> getContractByContractResult() {
        return null;
    }

    @Override
    public int getTotalpage() {

        return manageMapper.getTotalPage();
    }
    @Override
    public Map<String,Object> getAttributeList(){
        List<BusinessTypeInfo> businessTypeInfos = businessTypeInfoMapper.selectAll();
        List<ContractTypeInfo> contractTypeInfos = contractTypeInfoMapper.selectAll();
        List<TrustInstitutionInfo> trustInstitutionInfos = trustInstitutionInfoMapper.selectAll();
        List<TrustPlanInfo> trustPlanInfos = trustPlanInfoMapper.selectAll();
        List<TrustProductsInfo> trustProductsInfos = trustProductsInfoMapper.selectAll();
        List<TypeContractChangeInfo> typeContractChangeInfos = typeContractChangeInfoMapper.selectAll();
        Map<String,Object> map = new HashMap<>();
        map.put("businessTypeInfos",businessTypeInfos);
        map.put("contractTypeInfos",contractTypeInfos);
        map.put("trustInstitutionInfos",trustInstitutionInfos);
        map.put("trustPlanInfos",trustPlanInfos);
        map.put("trustProductsInfos",trustProductsInfos);
        map.put("typeContractChangeInfos",typeContractChangeInfos);
        return map;
    }




}
