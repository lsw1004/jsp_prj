package day1128;

import java.sql.Date;
import java.util.Arrays;

public class ParamDTO {
	private String id, pass, birth, loc, intro, code, ip, secChUaPlatform, userAgent, name, email, profile;
	private String[] language;
	private Date inputDate;
	
	public ParamDTO() {
	}
	
	public ParamDTO(String id, String pass, String birth, String loc, String intro, String code, String ip,
			String secChUaPlatform, String userAgent, String name, String email, String profile, String[] language,
			Date inputDate) {
		super();
		this.id = id;
		this.pass = pass;
		this.birth = birth;
		this.loc = loc;
		this.intro = intro;
		this.code = code;
		this.ip = ip;
		this.secChUaPlatform = secChUaPlatform;
		this.userAgent = userAgent;
		this.name = name;
		this.email = email;
		this.profile = profile;
		this.language = language;
		this.inputDate = inputDate;
	}




	public Date getInputDate() {
		return inputDate;
	}

	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSecChUaPlatform() {
		return secChUaPlatform;
	}

	public void setSecChUaPlatform(String secChUaPlatform) {
		this.secChUaPlatform = secChUaPlatform;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String[] getLanguage() {
		return language;
	}

	public void setLanguage(String[] language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return "ParamDTO [id=" + id + ", pass=" + pass + ", birth=" + birth + ", loc=" + loc + ", intro=" + intro
				+ ", code=" + code + ", ip=" + ip + ", secChUaPlatform=" + secChUaPlatform + ", userAgent=" + userAgent
				+ ", name=" + name + ", email=" + email + ", profile=" + profile + ", language="
				+ Arrays.toString(language) + ", inputDate=" + inputDate + "]";
	}




	
	
	
}// class
