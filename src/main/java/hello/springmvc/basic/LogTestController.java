package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController // 뷰로 리턴하지 않고 문자열로 리턴해도됨
public class LogTestController {

    //private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";
        System.out.println("name = " + name);

        //log.trace("trace log={}" + name); 연산이 발생해서 쓸모없는 데이터 낭비
        log.trace("trace log={}", name);
        log.debug("debug log={}", name);
        log.info(" info log={},", name);
        log.warn(" warn log={},", name);
        log.error(" error log={},", name);

        return "ok";
    }
}
