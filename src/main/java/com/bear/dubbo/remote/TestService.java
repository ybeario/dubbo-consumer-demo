package com.bear.dubbo.remote;
//引入接口（此处偷懒了，没有将接口打成 jar 包后导入，而是直接把接口文件添加到项目下，强烈不建议此种做法）
public interface TestService {  
    String sayHello(String name);  
}  