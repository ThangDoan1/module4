package thang.demo.service;


import thang.demo.entity.Status;
import thang.demo.repository.IStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService implements IStatusService{

    @Autowired
    IStatusRepository statusRepository;


    @Override
    public void createStatus() {
        statusRepository.save(new Status(1, "available"));
        statusRepository.save(new Status(2, "used"));
    }
}
