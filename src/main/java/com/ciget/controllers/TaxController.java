package com.ciget.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.Operation;

@RestController()
@RequestMapping("/tax")
public class TaxController {

    @Operation(summary = "Test description for the operation")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation"),
            @ApiResponse(responseCode = "404", description = "Nothing was found "),
            @ApiResponse(responseCode = "500", description = "test "),
    })
    @RequestMapping("/")
    public String index() {
        return "Spring Boot REST API";
    }
}
