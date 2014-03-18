/**
 * Project: javademos File Created at 2014-2-21 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is
 * the confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement
 * you entered into with dianping.com.
 */
package chong.zhu.demo.inherit;

/**
 * TODO Comment of Parent
 * 
 * @author chong.zhu
 */
public class Parent {

    public static Parent pclass = new Child();

    public void test() {
        System.out.println("parent");
    }
}
