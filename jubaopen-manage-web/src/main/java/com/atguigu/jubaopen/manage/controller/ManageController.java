package com.atguigu.jubaopen.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.jubaopen.bean.ContractResult;
import com.atguigu.jubaopen.manage.service.ManageService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ManageController {


    @Reference
    private ManageService manageService;

    @RequestMapping("smp")
    public String toSmp(){
        return "smp";
    }

    @RequestMapping("contract.html")
    public String toContract(Model model){
        Map<String, Object> attributeMap = manageService.getAttributeList();
        model.addAttribute("attributeMap",attributeMap);
        return "contract";
    }

    @RequestMapping("/common/{pageName}.html")
    public String toPage(HttpServletRequest request, @PathVariable(value = "pageName") String pageName){
        String loanContractNum = request.getParameter("loanContractNum");
        String borrowerId = request.getParameter("borrowerId");
        Map<String,Object> map = null;
        if("look".equals(pageName)){
           map = manageService.lookPaymentConditions(loanContractNum,borrowerId);//查询还款情况

        }else if("alter".equals(pageName)){
            map = manageService.alterPaymentConditions(loanContractNum,borrowerId);//
        }
        request.setAttribute("map",map);
        return "common"+"/"+pageName;
     }



    @RequestMapping("getResult")
    @ResponseBody
    public   Map<String,Object> getResult(@RequestParam Map<String,Object> params, Model model){
        Map<String,Object> map = new HashMap<>();
        //String page = request.getParameter("page");//page 为easyui分页插件默认传到后台的参数，代表当前的页码，起始页为1
        //String pagesize = request.getParameter("rows");//rows为为easyui分页插件默认传到后台的参数，代表当前设置的每页显示的记录条数
        Integer from = (Integer.parseInt((String)params.get("page"))-1)*Integer.parseInt((String) params.get("rows"));
        Integer pagesize = Integer.parseInt((String)params.get("rows"));

        params.put("from",from);
        params.put("pagesize",pagesize);
        int total = manageService.getTotalpage();
        List<ContractResult> allList = manageService.getAll(params);
        map.put("total",total);
        map.put("rows",allList);
        return map;
    }







}
