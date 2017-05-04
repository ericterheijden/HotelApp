package com.capgemini.HotelApp.controller;

import com.capgemini.HotelApp.model.Input;
import com.capgemini.HotelApp.model.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LMANNA on 4-5-2017.
 */

@RestController
public class JsonController {
    @RequestMapping (value="/api/json", method= RequestMethod.POST)
    public Result json(@RequestBody Input input){
        if(input.getNumber() == 42){
            Result result = new Result("ds",3,"sgfd",true);
            return result;
        }
            return null;
    }
}
