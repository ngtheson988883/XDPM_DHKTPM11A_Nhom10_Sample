package iuh.se.dhktpm11a.model.service;

import iuh.se.dhktpm11a.model.entity.Dia;
import iuh.se.dhktpm11a.model.respository.DiaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiaServiceImp implements DiaService{

    @Autowired
    DiaRespository diaRespository;

    @Override
    public Dia findDiabyMaDia(String maDia) {
        return diaRespository.findDiaByMaDia(maDia);
    }

    @Override
    public List<Dia> findAllDia() {
        return diaRespository.findAll();
    }
}
