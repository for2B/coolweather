package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017\9\3 0003.
 */

public class Province extends DataSupport {

    private int id;

    private  String provinceName;

    private int proviceCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getProvinceName(){
        return provinceName;
    }

    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }

    public int getProviceCode(){
        return  getProviceCode();
    }

    public void setProvinceCode(int proviceCode){
        this.proviceCode = proviceCode;
    }
}
