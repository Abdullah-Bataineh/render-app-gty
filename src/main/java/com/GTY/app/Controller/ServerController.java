package com.GTY.app.Controller;

import com.GTY.app.Model.Server;
import com.GTY.app.Services.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/server")
public class ServerController {
    @Autowired
    private ServerService serverService;
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Server> getServer(){
        return serverService.getServer();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Server setServer(@RequestBody Server server){
        return serverService.setServer(server);
    }
}
