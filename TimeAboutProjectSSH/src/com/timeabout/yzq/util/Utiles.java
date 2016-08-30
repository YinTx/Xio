package com.timeabout.yzq.util;

import com.timeabout.yzq.configure.MD5;

public class Utiles {
	/**
	 * 把用户名和密码进行加密然后和传输过来的密码进行对比
	 * @param name 用户名
	 * @param password 密码
	 * @param MD5Code 传输过来的密码
	 * @return
	 */
	public static boolean checkUserNameAndPass(String name, String password,
			String MD5Code) {
		String nameAndPass = name + password;
		String NewCode = MD5.toMD5(nameAndPass);
		if (NewCode.equals(MD5Code)) {
			return true;
		} else {
			return false;
		}
	}
}
