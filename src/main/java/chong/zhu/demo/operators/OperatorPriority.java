/**
 * Project: javademos File Created at 2014-3-3 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is
 * the confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement
 * you entered into with dianping.com.
 */
package chong.zhu.demo.operators;

/**
 * TODO Comment of OperatorPriority
 * 
 * @author chong.zhu
 */
public class OperatorPriority {

    public static void main(String[] args) {
        String a = new String("abc");
        String b = new String("abc");
        String c = "abc";
        String d = "abc";

        System.out.println("-->" + (a.equals(b)));
        System.out.println("-->" + c == d);
    }
}
