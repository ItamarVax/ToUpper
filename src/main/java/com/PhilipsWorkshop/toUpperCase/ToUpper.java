package com.PhilipsWorkshop.toUpperCase;

import com.google.common.base.CaseFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToUpper {
    @GetMapping("/convert")
    public String processString(@RequestParam String txt){
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_UNDERSCORE, txt);
    }
}
