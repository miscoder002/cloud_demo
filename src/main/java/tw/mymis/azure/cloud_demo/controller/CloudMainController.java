package tw.mymis.azure.cloud_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CloudMainController {

    @GetMapping("/")
    public String CloudRoot() {
        return "<h1>您看到的網頁目前是在 Azure Cloud 上的虛擬機器中執行</h1>" +
                "<h2> SpringBoot 2.7.7  JDK 1.8 版本</h2>";
    }
}
