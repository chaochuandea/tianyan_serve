package com.springapp.mvc;

import com.alibaba.fastjson.JSON;
import spark.ResponseTransformer;


/**
 * Created by maibenben on 2015/7/10.
 */
public class ResultRespnseTrasformer implements ResponseTransformer {
    private Object result;
    private int ret = 0;//这是成功标志
    private String text="成功";//这是每次携带的描述
    private Result res ;
    public ResultRespnseTrasformer(Object result){
        this.result = result;
        res = new Result();
        res.setData(result);
        res.setRet(ret);
        res.setText(text);
    }

    public ResultRespnseTrasformer(int ret,String text){
        this.result = result;
        res = new Result();
        res.setData(new Object());
        res.setRet(ret);
        res.setText(text);
    }

    public ResultRespnseTrasformer(int ret){
        this.result = result;
        res = new Result();
        res.setData(new Object());
        res.setRet(ret);
        res.setText("");
    }


    public ResultRespnseTrasformer(Object result,int ret,String text){
        this.result = result;
        res = new Result();
        res.setData(new Object());
        res.setRet(ret);
        res.setText(text);
    }




    @Override
    public String render(Object model) throws Exception {
        return JSON.toJSONString(res);
    }
}
