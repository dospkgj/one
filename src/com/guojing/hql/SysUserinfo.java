package com.guojing.hql;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * SysUserinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="sys_userinfo"
    ,catalog="tsavhotback"
)

public class SysUserinfo  implements java.io.Serializable {


    // Fields    

     private String userId;
     private String loginName;
     private String passWord;
     private String fullName;
     private String sex;
     private Integer power;
     private Integer status;
     private String creater;
     private Timestamp createDate;
     private Integer isOnline;
     private Timestamp logDate;
     private Timestamp lastDate;
     private Timestamp birthday;
     private String idcardNo;
     private String workTel;
     private String qq;
     private String houseTel;
     private String mobileTel;
     private String houseAddr;
     private String email;
     private String remarks;
     private String default01;
     private String default02;


    // Constructors

    /** default constructor */
    public SysUserinfo() {
    }

	/** minimal constructor */
    public SysUserinfo(String userId, String loginName, String passWord, String fullName, String sex, Integer power, Integer status, String creater, Timestamp createDate) {
        this.userId = userId;
        this.loginName = loginName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.sex = sex;
        this.power = power;
        this.status = status;
        this.creater = creater;
        this.createDate = createDate;
    }
    
    /** full constructor */
    public SysUserinfo(String userId, String loginName, String passWord, String fullName, String sex, Integer power, Integer status, String creater, Timestamp createDate, Integer isOnline, Timestamp logDate, Timestamp lastDate, Timestamp birthday, String idcardNo, String workTel, String qq, String houseTel, String mobileTel, String houseAddr, String email, String remarks, String default01, String default02) {
        this.userId = userId;
        this.loginName = loginName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.sex = sex;
        this.power = power;
        this.status = status;
        this.creater = creater;
        this.createDate = createDate;
        this.isOnline = isOnline;
        this.logDate = logDate;
        this.lastDate = lastDate;
        this.birthday = birthday;
        this.idcardNo = idcardNo;
        this.workTel = workTel;
        this.qq = qq;
        this.houseTel = houseTel;
        this.mobileTel = mobileTel;
        this.houseAddr = houseAddr;
        this.email = email;
        this.remarks = remarks;
        this.default01 = default01;
        this.default02 = default02;
    }

   
    // Property accessors
    @Id 
    
    @Column(name="UserID", unique=true, nullable=false, length=20)

    public String getUserId() {
        return this.userId;
    }
    
    public void setUserId(String userId) {
        this.userId = userId;
    }
    
    @Column(name="LoginName", nullable=false, length=30)

    public String getLoginName() {
        return this.loginName;
    }
    
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
    
    @Column(name="PassWord", nullable=false, length=30)

    public String getPassWord() {
        return this.passWord;
    }
    
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    @Column(name="FullName", nullable=false, length=30)

    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    @Column(name="Sex", nullable=false, length=2)

    public String getSex() {
        return this.sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    @Column(name="power", nullable=false)

    public Integer getPower() {
        return this.power;
    }
    
    public void setPower(Integer power) {
        this.power = power;
    }
    
    @Column(name="Status", nullable=false)

    public Integer getStatus() {
        return this.status;
    }
    
    public void setStatus(Integer status) {
        this.status = status;
    }
    
    @Column(name="Creater", nullable=false, length=30)

    public String getCreater() {
        return this.creater;
    }
    
    public void setCreater(String creater) {
        this.creater = creater;
    }
    
    @Column(name="CreateDate", nullable=false, length=0)

    public Timestamp getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }
    
    @Column(name="isOnline")

    public Integer getIsOnline() {
        return this.isOnline;
    }
    
    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }
    
    @Column(name="LogDate", length=0)

    public Timestamp getLogDate() {
        return this.logDate;
    }
    
    public void setLogDate(Timestamp logDate) {
        this.logDate = logDate;
    }
    
    @Column(name="LastDate", length=0)

    public Timestamp getLastDate() {
        return this.lastDate;
    }
    
    public void setLastDate(Timestamp lastDate) {
        this.lastDate = lastDate;
    }
    
    @Column(name="Birthday", length=0)

    public Timestamp getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }
    
    @Column(name="IDCardNo", length=18)

    public String getIdcardNo() {
        return this.idcardNo;
    }
    
    public void setIdcardNo(String idcardNo) {
        this.idcardNo = idcardNo;
    }
    
    @Column(name="WorkTel", length=20)

    public String getWorkTel() {
        return this.workTel;
    }
    
    public void setWorkTel(String workTel) {
        this.workTel = workTel;
    }
    
    @Column(name="QQ", length=20)

    public String getQq() {
        return this.qq;
    }
    
    public void setQq(String qq) {
        this.qq = qq;
    }
    
    @Column(name="HouseTel", length=20)

    public String getHouseTel() {
        return this.houseTel;
    }
    
    public void setHouseTel(String houseTel) {
        this.houseTel = houseTel;
    }
    
    @Column(name="MobileTel", length=20)

    public String getMobileTel() {
        return this.mobileTel;
    }
    
    public void setMobileTel(String mobileTel) {
        this.mobileTel = mobileTel;
    }
    
    @Column(name="HouseAddr", length=200)

    public String getHouseAddr() {
        return this.houseAddr;
    }
    
    public void setHouseAddr(String houseAddr) {
        this.houseAddr = houseAddr;
    }
    
    @Column(name="Email", length=50)

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Column(name="Remarks", length=50)

    public String getRemarks() {
        return this.remarks;
    }
    
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
    
    @Column(name="Default01", length=50)

    public String getDefault01() {
        return this.default01;
    }
    
    public void setDefault01(String default01) {
        this.default01 = default01;
    }
    
    @Column(name="Default02", length=50)

    public String getDefault02() {
        return this.default02;
    }
    
    public void setDefault02(String default02) {
        this.default02 = default02;
    }
   








}