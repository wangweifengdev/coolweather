package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/8/21.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityeCode;
    private  int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String CityName(){
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public int getCityeCode(){
        return cityeCode;
    }
    public void setCityeCode(int cityeCode){
        this.cityeCode=cityeCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId=provinceId;
    }
}

