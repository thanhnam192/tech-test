package com.animal.bird;

import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken implements AdultAction {
    private static  Map<String, String> singCms;
    private String language = "VietNam";
    static {
        singCms = new HashMap<>();
        singCms.put("VietNam", "o` o' ooo");
        singCms.put("Danish", "kykyliky");
        singCms.put("Dutch", "kukeleku");
        singCms.put("Finnish", "kukko kiekuu");
        singCms.put("French", "cocorico");
        singCms.put("German", "kikeriki");
        singCms.put("Greek", "kikiriki");
        singCms.put("Hebrew", "coo-koo-ri-koo");
        singCms.put("Hungarian", "kukuriku");
        singCms.put("Italian", "chicchirichi");
        singCms.put("Japanese", " ko-ke-kok-ko-o");
        singCms.put("Portuguese", "cucurucu");
        singCms.put("Russian", "kukareku");
        singCms.put("Swedish", "kuckeliku");
        singCms.put("Turkish", "kuk-kurri-kuuu");
        singCms.put("Urdu", "kuklooku");
    }

    public Rooster(){

    }

    public Rooster(String language){
        this.language = language;
    }



    @Override
    public String sing() {
        String s = singCms.get(language);
        if( s != null ){
            return  s;
        }

        return "Cock-a-doodle-doo";
    }

    @Override
    public String crow() {
        return "ROAR....!";
    }
}
