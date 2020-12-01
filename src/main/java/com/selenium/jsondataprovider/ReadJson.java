package com.selenium.jsondataprovider;

import com.selenium.resourcesproperties.Resources;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.Reader;

public class ReadJson {
    public  JSONObject jsonObject;
    public void loadJsonData(){
        jsonObject=new JSONObject();
        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader(Resources.JSONDATA.getValue())) {
            jsonObject = (JSONObject) parser.parse(reader);
            System.out.println(jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getData(String filedName, int iteration){
        String fieldData="";
        JSONArray testdata = (JSONArray) jsonObject.get("TC_01");
        for(int i=0;i<=testdata.size()-1;i++){
            JSONObject data=(JSONObject)testdata.get(i);
            if(data.get("iteration").toString().equals(String.valueOf(iteration))){
                fieldData= data.get(filedName).toString();
                System.out.println(fieldData);
                break;
            }
        }
        return fieldData;
    }

}

