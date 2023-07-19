package com.example.demo.emp;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/vue-element-admin/user")
@Api(tags="登录相关接口")
public class login {

    @ApiOperation("登录接口")
    @PostMapping("/login")
    public Object login(@RequestBody Map<String,Object> params){
        Object username = params.get("username");
        Object password = params.get("password");
        HashMap<String, String> info = new HashMap<>();
        HashMap<String, Object> re = new HashMap<>();
        if(username != null && password != null && "admin".equals(username.toString()) && "admin123".equals(password.toString())){
            info.put("name", "admin");
            info.put("token","admin");
            re.put("data", info);
            re.put("code", 200);
        }else{
            re.put("data", info);
            re.put("code", 500);
        }
        return re;
    }

    @ApiOperation("登录后获取信息接口")
    @GetMapping("/info")
    public Object info(){
        HashMap<String, Object> info = new HashMap<>();
        info.put("roles", new Object[]{"admin"});
        info.put("name", "Admin");
        info.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        info.put("introduction","I am a super administrator");
        HashMap<String, Object> re = new HashMap<>();
        re.put("data", info);
        re.put("code", 200);
        return re;
    }

    @ApiOperation("登出接口")
    @PostMapping("/logout")
    public Object logout(){
        HashMap<String, Object> re = new HashMap<>();
        re.put("success", "success");
        re.put("code", 200);
        return re;
    }
}
