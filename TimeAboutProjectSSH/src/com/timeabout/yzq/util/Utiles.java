package com.timeabout.yzq.util;

import com.timeabout.yzq.configure.MD5;

public class Utiles {
	/**
	 * ���û�����������м���Ȼ��ʹ��������������жԱ�
	 * @param name �û���
	 * @param password ����
	 * @param MD5Code �������������
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
