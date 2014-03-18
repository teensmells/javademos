/**
 * Project: demo File Created at 2014-1-24 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is the
 * confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the terms of the license agreement you entered
 * into with dianping.com.
 */
package chong.zhu.demo.concurrent.concurrentmodificationexception;

import java.util.Iterator;

/**
 * use different collection to test concurrentModificationException in multi and single thread
 * 
 * @author chong.zhu
 */
public class ConcurrentModificationExceptionTest {

    public static void main(String[] args) {
        testWithConcurrent();
        // testWithSingleThread();
    }

    /**
     * 
     */
    private static void testWithSingleThread() {
        MyConcurrentSafeList.addElements();
        Iterator<String> it = MyConcurrentSafeList.testList.iterator();
        while (it.hasNext()) {
            String key = it.next();
            if (key.equals("3")) {
                MyConcurrentSafeList.delElement(3);
            }
        }
    }

    /**
     * 
     */
    private static void testWithConcurrent() {
        MyConcurrentSafeList.addElements();
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                MyConcurrentSafeList.iteratorList();
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                MyConcurrentSafeList.delElement(3);
            }
        });

        thread1.start();
        thread2.start();
    }
}
