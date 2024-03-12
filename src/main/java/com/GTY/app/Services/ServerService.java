package com.GTY.app.Services;

import com.GTY.app.Model.Server;
import com.GTY.app.Repository.ChanelRepository;
import com.GTY.app.Repository.ServerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerService {
@Autowired
    private ServerRepository serverRepository;
@Autowired
private ChanelRepository chanelRepository;

public Server setServer(Server server){
    serverRepository.deleteAll();
    chanelRepository.deleteAll();
    return serverRepository.save(server);
}

public List<Server> getServer(){
    return serverRepository.findAll();
}
public void deleteServer(long id){
     serverRepository.deleteById(id);
}
}
