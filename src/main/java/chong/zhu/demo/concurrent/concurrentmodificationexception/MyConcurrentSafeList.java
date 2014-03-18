/**
 * Project: javademos File Created at 2014-1-26 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is
 * the confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement
 * you entered into with dianping.com.
 */
package chong.zhu.demo.concurrent.concurrentmodificationexception;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * TODO Comment of MyConcurrentSafeList
 * 
 * @author chong.zhu
 */
public class MyConcurrentSafeList {

    public static List<String> testList = new CopyOnWriteArrayList<String>();

    public static void addElements() {
        testList.add("1");
        testList.add("2");
        testList.add("3");
        testList.add("4");
        testList.add("5");
        testList.add("6");
        testList.add("7");
        testList.add("8");
    }

    public static void delElement(int key) {
        System.out.println("delete:" + testList.remove(key));
    }

    public static void iteratorList() {
        Iterator<String> it = testList.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key);
        }
    }
}
