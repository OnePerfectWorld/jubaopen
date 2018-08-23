package com.atguigu.jubaopen.manage.mapper;

import com.atguigu.jubaopen.bean.ContractResult;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface ManageMapper extends Mapper<ContractResult>{



    List<ContractResult> getAll(Map<String,Object> params);


    int getTotalPage();
}
