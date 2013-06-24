package com.mycompany.goods.action;

import java.util.List;

import com.mycompany.entity.UserEntity;
import com.mycompany.service.UserDaoService;

/**
 * 找回密码Action
 * 
 * @author Administrator
 * 
 */
public class PassWordAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4774522462499983601L;
	private UserDaoService userDaoService;
	private static final String FIDNPASSWORD2 = "findpassword";
	private static final String SUREMODIFYPW = "suremodifypw";
	private static final String FINDPASSWORD3 = "findpassword3";
	private static final String ERROR = "error";
	/**
	 * 用户实体申明
	 */
	private UserEntity userEntity;
	/**
	 * 答案属性
	 */
	private String result;
	
	/**
	 * 新密码属性
	 */
	private String passwordOne;

	/**
	 * 查看此账号的问题
	 * 
	 * @return
	 */

	public String FindUserPassWord() {
		if (userEntity.getName() != null && !userEntity.getName().equals("")) {
			getSession().setAttribute("newname", userEntity.getName());
		}
		List<UserEntity> list = userDaoService.FindUserExist(userEntity
				.getName());

		if (list.size() != 0) {
			getSession().setAttribute("password", list.get(0).getPassword());
			getSession().setAttribute("answer", list.get(0).getResult());
			getSession().setAttribute("question", list.get(0).getQuestion());
			return FIDNPASSWORD2;
		}
		return ERROR;
	}

	/**
	 * 确认修改密码
	 * 
	 * @return
	 */

	public String SureModifyPassword() {
		String name=(String) getSession().getAttribute("newname");
		//userEntity=new UserEntity(null, null, null, null, passwordOne, null, null, null, null, null);
		userDaoService.ModifyPassword(name, userEntity);
		return SUREMODIFYPW;
	}

	/**
	 * 确认答案是否正确
	 * 
	 * @param userEntity
	 */

	public String SurePassWord() {
		String answer = (String) getSession().getAttribute("answer");
		if (result == null || result.equals("")) {
			return ERROR;
		} else {
			if (result.equals(answer)) {
				return FINDPASSWORD3;
			} else {
				return ERROR;
			}

		}
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setPasswordOne(String passwordOne) {
		this.passwordOne = passwordOne;
	}

	public String getPasswordOne() {
		return passwordOne;
	}
	
	public UserDaoService getUserDaoService() {
		return userDaoService;
	}

	public void setUserDaoService(UserDaoService userDaoService) {
		this.userDaoService = userDaoService;
	}

}
