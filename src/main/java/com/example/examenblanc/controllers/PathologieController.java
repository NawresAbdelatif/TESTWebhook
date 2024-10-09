package com.example.examenblanc.controllers;

import com.example.examenblanc.entities.Pathologie;
import com.example.examenblanc.services.IPathologisService;
import org.springframework.web.bind.annotation.*;

@RestController
public class PathologieController {
    IPathologisService pathologisService ;

    public PathologieController(IPathologisService pathologisService) {
        this.pathologisService = pathologisService;
    }

    @PostMapping("/pathologie")
    Pathologie addBloc(@RequestBody Pathologie path){
        return pathologisService.ajouterPathologie(path);

    }
    @PutMapping( "/pathologie/{codeActe}/{codePathologie}" )
    public void affecterActeAPathologie(@PathVariable String codeActe , @PathVariable String codePathologie){
         pathologisService.affecterActeAPathologie(codeActe, codePathologie);
    }
}
