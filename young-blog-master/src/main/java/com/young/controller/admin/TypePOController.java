package com.young.controller.admin;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.young.entity.TypePO;
import com.young.service.api.TypePOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**  分类管理控制器
 * @author young
 * @Description
 * @date 2020-06-21 9:01
 */
@Controller
public class TypePOController {

    @Autowired
    private TypePOService typePOService;

    /*
    获取分类列表
     */
    @GetMapping("/admin/type/list")
    public String list(@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                       @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize,
                       Model model){

        //开启分页功能，设置页码
        PageHelper.startPage(pageNum,pageSize);

        //获取分类数据
        List<TypePO> typePOList = typePOService.getTypePOList();

        PageInfo<Object> pageInfo = new PageInfo(typePOList);

        model.addAttribute("pageInfo",pageInfo);

        return "admin/types";


    }
}
