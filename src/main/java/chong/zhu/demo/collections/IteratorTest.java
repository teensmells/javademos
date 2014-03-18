/**
 * Project: javademos File Created at 2014-2-17 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is
 * the confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement
 * you entered into with dianping.com.
 */
package chong.zhu.demo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * TODO Comment of IteratorTest
 * 
 * @author chong.zhu
 */
public class IteratorTest {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        ListIterator<Integer> listIt = list.listIterator();
        while (listIt.hasNext()) {
            System.out.println(listIt.next());
        }

        while (listIt.hasPrevious()) {
            System.out.println(listIt.previous());
        }
    }
}
