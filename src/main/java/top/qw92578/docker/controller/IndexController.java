package top.qw92578.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: top.qw92578.docker.controller
 * @ClassName: IndexController
 * @Author: fgq
 * @Description: 首页
 * @Date: 2020/5/14 13:13
 */
@RestController("index")
public class IndexController {

    @RequestMapping()
    public String index() {
        return "hello docker!";
    }
}
