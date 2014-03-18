/**
 * Project: javademos File Created at 2014-3-3 $Id$ Copyright 2010 dianping.com. All rights reserved. This software is
 * the confidential and proprietary information of Dianping Company. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in accordance with the terms of the license agreement
 * you entered into with dianping.com.
 */
package chong.zhu.demo.innerclass;

/**
 * TODO Comment of OuterClassWithNested
 * 
 * @author chong.zhu
 */
public class OuterClassWithNested {

    private String name;

    public static class NestedClass {

        private static String WIFE = "jane";

        private String        address;

        public static String myWife() {
            return WIFE;
        }

        /**
         * @return the address
         */
        public String getAddress() {
            return address;
        }

        /**
         * @param address the address to set
         */
        public void setAddress(String address) {
            this.address = address;
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
