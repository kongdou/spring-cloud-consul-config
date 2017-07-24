package com.lw.consul.controller;

import com.lw.consul.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liaowen on 2017/7/24.
 */
@RestController
public class ConsulController {

  //*********************part 1 ****************************
    @Autowired
    private UserInfo userInfo;

    @RequestMapping(value = "/consulInfo")
    public  String  getConsulInfo(){
        return userInfo.toString();
    }


  //*********************part  2****************************

    @Value("${LiaoWenn.address}")
    private  String   address;

    @RequestMapping(value = "/consulInfo2")
    public  String  getConsulInfo2(){
        return address;
    }


    //*********************part  3****************************

    private   static String  email  ;

    @Value("${LiaoWenn.email}")
    public  void setEmail(String email) {
        ConsulController.email = email;
    }

    @RequestMapping(value = "/consulInfo3")
    public  String  getConsulInfo3(){
        return email;
    }

    //*********************part  4****************************

    //在spring xml文件如何取值？
    //配置在consul上的属性取值跟配置在配置文件中取值一样通过${}
}
