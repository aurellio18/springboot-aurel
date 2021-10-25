package com.example.aurelliof.hello.controller;

import com.example.aurelliof.hello.model.Identity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.aurelliof.hello.repositories.IdentityRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    IdentityRepository identityRepository;

    @GetMapping(value = "checkAPI")
    public String checkAPI(){
        return "Hello World!";
    }

    @PostMapping(value = "addIdentity")
    public Identity addIdentity(@RequestBody Identity param){

        identityRepository.save(param);
        return param;
    }

    @GetMapping(value = "getAllIdentity")
    public List<Identity> getAllIdentity(){
        return identityRepository.findAll();
    }

    @GetMapping(value = "getById")
    public Identity getById(@RequestParam int id){
        return identityRepository.findById(id).get();
    }

    @PostMapping(value = "updateIdentity")
    public Identity updateIdentity(@RequestBody Identity param){
        return identityRepository.save(param);
    }

    @GetMapping(value = "removeIdentity")
    public List<Identity> deleteIdentity(@RequestParam int id){
        identityRepository.deleteById(id);
        List<Identity> identityList = identityRepository.findAll();
        return identityList;
    }

    @DeleteMapping(value = "removeAll")
    public List<Identity> removeAll(){
        identityRepository.deleteAll();
        List<Identity> identityList = identityRepository.findAll();
        return null;
    }


}
