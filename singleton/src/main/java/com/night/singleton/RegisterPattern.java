package com.night.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/13 11:04
 * 注册表形式 克服单例模式 不能继承问题
 */
public class RegisterPattern {

    private static Map register = new HashMap();

    /**
     * 静态块  在类被加载时自动执行
     */
    static {
        RegisterPattern registerPattern = new RegisterPattern();
        register.put(registerPattern.getClass().getName(),registerPattern);
    }

    //受保护的构造函数  继承关系可以调用 克服单例类不能继承的缺点
    protected  RegisterPattern(){};

    public  static RegisterPattern getInstance(String className) throws Exception {

        if(className == null){
            throw new Exception("类名称不能为空");
        }

        if(register.get(className) == null){
            try {
                register.put(className,Class.forName(className).newInstance());
            }catch (Exception e) {
                e.printStackTrace();
                throw  e;
            }
        }
        return (RegisterPattern) register.get(className);
    }
}
