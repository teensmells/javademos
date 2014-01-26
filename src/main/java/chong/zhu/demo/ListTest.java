/**
 * Project: demo File Created at 2014-1-24 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is the
 * confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the terms of the license agreement you entered
 * into with dianping.com.
 */
package chong.zhu.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * TODO Comment of ListTest
 * 
 * @author chong.zhu
 */
public class ListTest {

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

    public static void delElements(int key) {
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
