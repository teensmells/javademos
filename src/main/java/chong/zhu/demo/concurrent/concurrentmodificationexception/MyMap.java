/**
 * Project: javademos File Created at 2014-1-26 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is
 * the confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement
 * you entered into with dianping.com.
 */
package chong.zhu.demo.concurrent.concurrentmodificationexception;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * TODO Comment of MyMap
 * 
 * @author chong.zhu
 */
public class MyMap {

    public static Map<Integer, String> testMap = new HashMap<Integer, String>();

    public static void addElements() {
        testMap.put(1, "1");
        testMap.put(2, "2");
        testMap.put(3, "3");
        testMap.put(4, "4");
        testMap.put(5, "5");
        testMap.put(6, "6");
        testMap.put(7, "7");
        testMap.put(8, "8");
    }

    public static void delElement(String key) {
        System.out.println("delete:" + testMap.remove(key));
    }

    public static void iteratorList() {
        Iterator<Integer> it = testMap.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println(key);
        }
    }
}
