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
 * Created on 2015年9月13日
 *******************************************************************************/


package example.desigepatten.proxy;

/**
 * TODO 此处填写 class 信息
 *
 * @author weixin (mailto:weixin@primeton.com)
 */

public class TankLogProxy implements IMoveable{
	
	private IMoveable m;
	
	/**
	 * 
	 */
	public TankLogProxy(IMoveable m) {
		this.m  = m;
	}

	/* (non-Javadoc)
	 * @see example.desigepatten.proxy.IMoveable#move()
	 */
	public void move() {
		System.out.println("log Tank move start......");
		m.move();
		System.out.println("log Tank move stop......");
	}

}

/*
 * 修改历史
 * $Log$ 
 */