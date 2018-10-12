package iuh.se.dhktpm11a.model.service;

import iuh.se.dhktpm11a.model.entity.Dia;

import java.util.List;

public interface DiaService {
    public Dia findDiabyMaDia(String maDia);
    public List<Dia> findAllDia();

    // Các hàm xử lý nghiệp vụ khác liên quan tới Đĩa
    //....

}
