package com.company.task9Loto.menutext;

import java.util.Locale;

public class MenuTextProviderFactory {

    public static MenuTextProvider getMenuTextProvider(){
        if(Locale.getDefault().equals(new Locale("ru"))){
            return new MenuTextProviderRu();
        } else {
            return new MenuTextProviderEn();
        }
    }
}
