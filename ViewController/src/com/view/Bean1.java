package com.view;

import java.util.Locale;

import javax.faces.context.FacesContext;

public class Bean1 {
    public Bean1() {
    }
    private String language;

    public String method1() {
        System.out.println("changeLocale " + getLanguage());
        Locale newLocale = new Locale(this.getLanguage());
        FacesContext context = FacesContext.getCurrentInstance();
        context.getViewRoot().setLocale(newLocale);
        return null;
    }


    public String changeToSpanish() {

        Locale newLocale = new Locale("es");
        FacesContext context = FacesContext.getCurrentInstance();
        context.getViewRoot().setLocale(newLocale);
        return null;
    }


    public String changeToEnglish() {

        Locale newLocale = new Locale("en");
        FacesContext context = FacesContext.getCurrentInstance();
        context.getViewRoot().setLocale(newLocale);
        return null;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        if (language == null) {
            return "en";
        }
        return language;
    }
}
