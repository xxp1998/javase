package com.lixin.lesson16;

public class UserOperatorThread  extends Thread
{
	
	private  Bank  bank;
	
	private double  opmoney;
	
	public  UserOperatorThread(String  threadName,Bank  bank,double  opmoney)
	{
		//�����̵߳�����
		this.setName(threadName);
		
		this.bank=bank;
		this.opmoney=opmoney;
	}
	
	public   void  run()
	{
		this.bank.operatoeMoney(opmoney);
	}

}