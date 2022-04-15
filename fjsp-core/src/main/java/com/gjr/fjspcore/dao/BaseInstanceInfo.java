package com.gjr.fjspcore.dao;

/**
 * @author GJR
 * @version 1.0
 * @description: 读取的算例的基本信息
 * @date 2022/4/12 21:55
 */
public class BaseInstanceInfo {

    /**工件数*/
    private int jobNum;

    /**机器数*/
    private int machineNum;

    /**每台机器的工序数*/
    private int[] everyJobOperation;

    /**所有工件工序数*/
    private int allOperations;
}
