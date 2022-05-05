package com.nowcoder.community;

import java.io.IOException;

/**
 * @author Ma Tengfei
 * @create 2022-05-05 21:26
 */
public class WkTests {

    public static void main(String[] args) {
        String cmd = "d:/developer_tools/wkhtmltopdf/bin/wkhtmltoimage --quality 75  https://www.nowcoder.com d:/work/data/wk-images/3.png";
        try {
            Runtime.getRuntime().exec(cmd);
            System.out.println("ok.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
