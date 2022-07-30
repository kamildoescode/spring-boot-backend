package com.kamildoescode.springbootbackend.controller;

import com.kamildoescode.springbootbackend.model.DefaultPageResponse;
import com.kamildoescode.springbootbackend.service.DefaultPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class DefaultPageController {
    private final DefaultPageService defaultPageService;

    @GetMapping(value = "/")
    public DefaultPageResponse getDefaultPage() {
        return defaultPageService.getDefaultPageResponse();
    }
}
