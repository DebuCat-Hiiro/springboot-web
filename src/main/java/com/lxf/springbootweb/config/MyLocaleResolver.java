package com.lxf.springbootweb.config;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author Hanamaru
 */
public class MyLocaleResolver implements LocaleResolver {
    /**
     * 解析请求链接
     * @param request
     * @return locale
     */
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取请求中的语言参数
        String language = request.getParameter("lang");
        //如果请求中没有语言，则使用默认的语言
        Locale locale = Locale.getDefault();
        //如果请求的链接中包含了国际化的参数
        if(StringUtils.hasText(language)){
            //解析语言
            String[] split = language.split("_");
            //国家，地区
            locale=new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
