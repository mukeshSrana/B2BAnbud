package org.b2b.anbud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.b2b.anbud.domain.Bedrift;
import org.b2b.anbud.repo.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RegisterService {

    @Autowired
    private RegisterRepository repo;

    public List<Bedrift> listAll() {
        return repo.findAll();
    }

    public void save(Bedrift bedrift) {
        repo.save(bedrift);
    }

    public Bedrift get(long id) {
        return repo.findById(id).get();
    }

    public void delete(long id) {
        repo.deleteById(id);
    }
}

