package iuh.se.dhktpm11a.model.respository;

import iuh.se.dhktpm11a.model.entity.Dia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiaRespository extends JpaRepository<Dia, String> {

    public List<Dia> findAll();
    public Dia findDiaByMaDia(String maDia);

}
