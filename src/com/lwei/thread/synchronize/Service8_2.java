package com.lwei.thread.synchronize;

public class Service8_2 {

	private String usernameParam;
	private String passwordParam;

	public void setUsernamePassword(String username, String password) {
		try {
			String anyString = new String();
			synchronized (anyString) {
				System.out.println(
						"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "进入同步块");
				usernameParam = username;
				Thread.sleep(3000);
				passwordParam = password;
				System.out.println(
						"线程名称为：" + Thread.currentThread().getName() + "在" + System.currentTimeMillis() + "离开同步块");
			}

			System.out.println("线程名称为：" + Thread.currentThread().getName() + " usernameParam = " + usernameParam
					+ " passwordParam = " + passwordParam);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
