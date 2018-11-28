package com.rodrigo.sipriano.PersonalWebsite.controller;

import com.rodrigo.sipriano.PersonalWebsite.contentService.ContentService;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContentServiceController {
	
	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @RequestMapping("/greeting")
    public ContentService greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new ContentService(counter.incrementAndGet(),
                            String.format(template, name));
    }
	
}
