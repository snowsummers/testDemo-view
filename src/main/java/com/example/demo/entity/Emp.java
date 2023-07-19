package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("职工对象")
public class Emp {

    @ApiModelProperty(value="序号，从1开始",hidden=true)
    private Integer id;
    @ApiModelProperty(value="员工姓名")
    private String emp_name;
    @ApiModelProperty(value="员工性别")
    private String sex;
    @ApiModelProperty(value="员工年龄")
    private Integer age;
    @ApiModelProperty(value="部门名称")
    private String dept_name;
    @ApiModelProperty(value="学历")
    private String emp_degree_name;
    @ApiModelProperty(value="登录账号")
    private String login_account;
    @ApiModelProperty(value="密码")
    private String passward;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getEmp_degree_name() {
        return emp_degree_name;
    }

    public void setEmp_degree_name(String emp_degree_name) {
        this.emp_degree_name = emp_degree_name;
    }

    public String getLogin_account() {
        return login_account;
    }

    public void setLogin_account(String login_account) {
        this.login_account = login_account;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", emp_name='" + emp_name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", dept_name='" + dept_name + '\'' +
                ", emp_degree_name='" + emp_degree_name + '\'' +
                ", login_account='" + login_account + '\'' +
                ", passward='" + passward + '\'' +
                '}';
    }
}
