package com.github.ltsopensource.admin;

import org.springframework.util.AntPathMatcher;

public class Test {
    public static void main(String[] args) {
        {
            AntPathMatcher pathMatcher = new AntPathMatcher();
            boolean match = pathMatcher.match("/js/**", "/js/abc/a.js");
            System.out.println(match);
        }
        {
            AntPathMatcher pathMatcher = new AntPathMatcher();
            boolean match = pathMatcher.match("**/js/**", "lts-admin/js/abc/a.js");
            System.out.println(match);
        }
    }
}
