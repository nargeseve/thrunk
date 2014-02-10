package com.jprogrammers.tag;

import com.jprogrammers.language.LanguageUtil;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Created by EN20 on 2/7/14.
 */
public class Message extends TagSupport {

    String key;

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out = pageContext.getOut();
            out.print(LanguageUtil.get(key));
        }catch (Exception e){
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
