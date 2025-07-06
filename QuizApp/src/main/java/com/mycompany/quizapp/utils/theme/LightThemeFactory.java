/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quizapp.utils.theme;

import com.mycompany.quizapp.App;

/**
 *
 * @author admin
 */
public class LightThemeFactory implements ThemeFactory {

    @Override
    public String getStylesheet() {
        return App.class.getResource("light.css").toExternalForm();
    }
    
}
