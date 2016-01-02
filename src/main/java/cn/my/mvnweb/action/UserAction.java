package cn.my.mvnweb.action;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;

import com.opensymphony.xwork2.ActionSupport;

import cn.my.mvnweb.biz.IFlUserBiz;
import cn.my.mvnweb.entity.FlUser;

@Namespace("/")
@Action(value="userAction")
public class UserAction extends ActionSupport{

	private static final long serialVersionUID = 7317649558903987585L;
	private String id;
	private FlUser user;
	private IFlUserBiz flUserBiz;
	
	
	public String doLogin(){
		FlUser loginUser = flUserBiz.doLogin(user.getFuUserId());
		if(loginUser==null){
			addFieldError("loginMsg", "用户名错误！");
			return INPUT;
		}else if(!loginUser.getFuPassword().equals(user.getFuPassword())){
			addFieldError("loginMsg", "密码错误！");
			return INPUT;
		}else{
			ServletActionContext.getRequest().getSession().setAttribute("loginUser", loginUser);
			return SUCCESS;
		}
	}
	
	
	
	
	
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public FlUser getUser() {
		return user;
	}
	public void setUser(FlUser user) {
		this.user = user;
	}
	public IFlUserBiz getFlUserBiz() {
		return flUserBiz;
	}
	public void setFlUserBiz(IFlUserBiz flUserBiz) {
		this.flUserBiz = flUserBiz;
	}
}
