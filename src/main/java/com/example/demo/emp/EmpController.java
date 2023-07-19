package com.example.demo.emp;

import com.example.demo.entity.Emp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;


@Api(tags="职工相关接口")
@RestController
@RequestMapping("/vue-element-admin/user")
public class EmpController {

    @Autowired
    private EmpService empService;

        @ApiOperation("获取职工列表接口")
        @GetMapping("/userList")
        public Object userList(@RequestParam("page") String page,@RequestParam("limit") String limit,
                            @RequestParam(value="name",required=false) String name,@RequestParam(value="dept",required=false) String dept,@RequestParam(value="degree",required=false) String degree){
            int litmitInt = Integer.parseInt(limit);
            int pageInt = Integer.parseInt(page) - 1;
            Object userList = empService.getUserList(pageInt*litmitInt,litmitInt,name,dept,degree);
            Object usersCount = empService.getUsersCount(name,dept,degree);
            HashMap<String, Object> re = new HashMap<>();
            re.put("code", 200);
            re.put("data", userList);
            re.put("total", usersCount);
            return re;
        }

    @ApiOperation("职工添加接口")
    @PostMapping("/userAdd")
    public Object userAdd(@RequestBody Emp emp){
        Object o = empService.addUser(emp.getEmp_name(), emp.getAge(), emp.getSex(), emp.getDept_name(), emp.getEmp_degree_name(), emp.getLogin_account());
        HashMap<String, Object> re = new HashMap<>();
        re.put("code", 200);
        if(Integer.valueOf(1).equals(o)){
            re.put("msg", "成功");
        }else{
            re.put("msg", "失败");
        }
        return re;
    }
    @ApiOperation("职工修改接口")
    @PostMapping("/userPut")
    public Object userPut(@RequestBody Emp emp){
        Object o = empService.putUser(emp.getId(),emp.getEmp_name(), emp.getAge(), emp.getSex(), emp.getDept_name(), emp.getEmp_degree_name(), emp.getLogin_account());
        HashMap<String, Object> re = new HashMap<>();
        re.put("code", 200);
        if(Integer.valueOf(1).equals(o)){
            re.put("msg", "成功");
        }else{
            re.put("msg", "失败");
        }
        re.put("code", 200);
        return re;
    }

    @ApiOperation("职工删除接口")
    @GetMapping("/userDel")
    public Object userDel(@RequestParam("id") String id){
        Object o = empService.delUser(Integer.parseInt(id));
        HashMap<String, Object> re = new HashMap<>();
        re.put("code", 200);
        if(Integer.valueOf(1).equals(o)){
            re.put("msg", "成功");
        }else{
            re.put("msg", "失败");
        }
        re.put("code", 200);
        return re;
    }
}
