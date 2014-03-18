/**
 * Project: javademos File Created at 2014-2-22 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is
 * the confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement
 * you entered into with dianping.com.
 */
package chong.zhu.demo.algorithm.number;

/**
 * TODO Comment of BinaryOneNum
 * 
 * @author chong.zhu
 */
public class OneNumInBinary {

    public static void main(String[] args) {
        System.out.println(getSameBitNum(32, 64));
    }

    public static int getOneNum1(int i) {
        int num = 0;
        while (i > 0) {
            if ((i & 0x01) == 1) {
                num++;
            }
            i >>= 1;
        }
        return num;
    }

    public static int getOneNum2(int i) {
        int num = 0;
        while (i > 0) {
            i &= (i - 1);
            num++;
        }
        return num;
    }

    public static int getSameBitNum(int a, int b) {
        int num = 0;
        while (a > 0 && b > 0) {
            if ((a & 1) == (b & 1)) {
                num++;
            }
            a >>= 1;
            b >>= 1;
        }
        return num;
    }
}
