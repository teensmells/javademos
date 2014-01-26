/**
 * Project: demo File Created at 2014-1-24 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is the
 * confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only in accordance with the terms of the license agreement you entered
 * into with dianping.com.
 */
package chong.zhu.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * TODO Comment of ConcurrentModification
 * 
 * @author chong.zhu
 */
public class ConcurrentModificationExceptionTest {

    public static void main(String[] args) {
        ListTest.addElements();
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                ListTest.iteratorList();
            }
        });

        Thread thread2 = new Thread(new Runnable() {

            @Override
            public void run() {
                ListTest.delElements(3);
            }
        });

        thread1.start();
        thread2.start();
    }
}
