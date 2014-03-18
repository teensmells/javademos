/**
 * Project: javademos File Created at 2014-3-3 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is
 * the confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement
 * you entered into with dianping.com.
 */
package chong.zhu.demo.innerclass;

import chong.zhu.demo.innerclass.OuterClassWithNested.NestedClass;

/**
 * TODO Comment of InnerClassAndNestedClass
 * 
 * @author chong.zhu
 */
public class InnerClassAndNestedClass {

    public static void main(String[] args) {
        OuterClassWithInner outer = new OuterClassWithInner();
        outer.setName("tom");
        OuterClassWithInner.InnerClass inner = outer.new InnerClass();
        inner.setAddress("hell");

        OuterClassWithNested outer2 = new OuterClassWithNested();
        outer.setName("peter");
        NestedClass nested = new NestedClass();
    }
}
