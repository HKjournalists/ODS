/*******************************************************************************
 * $Header$
 * $Revision$
 * $Date$
 *
 *==============================================================================
 *
 * Copyright (c) 2001-2012 Primeton Technologies, Ltd.
 * All rights reserved.
 * 
 * Created on 2015年7月3日
 *******************************************************************************/


package org.training.example.threadLocal;

/**
 * TODO 此处填写 class 信息
 *
 * @author weixin (mailto:weixin@primeton.com)
 */

public class CountTestCase {
	public static void main(String[] args) {
		CountTask task = new CountTask("task1");
		CountTask task2 = new CountTask("task2");
		task.start();
		task2.start();
	}
}

/*
 * 修改历史
 * $Log$ 
 */