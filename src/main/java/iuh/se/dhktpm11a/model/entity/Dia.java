package iuh.se.dhktpm11a.model.entity;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Dia {
    @Id
    @GeneratedValue
    private String maDia;
    private String maChiTietPhieuThue;
    private String maTieuDe;
    @Type(type="org.hibernate.type.StringNVarcharType")
    private String trangThai;

    public Dia(String maChiTietPhieuThue, String maTieuDe, String trangThai) {
        this.maChiTietPhieuThue = maChiTietPhieuThue;
        this.maTieuDe = maTieuDe;
        this.trangThai = trangThai;
    }

    public Dia() {
    }

    public String getMaDia() {
        return maDia;
    }

    public void setMaDia(String maDia) {
        this.maDia = maDia;
    }

    public String getMaChiTietPhieuThue() {
        return maChiTietPhieuThue;
    }

    public void setMaChiTietPhieuThue(String maChiTietPhieuThue) {
        this.maChiTietPhieuThue = maChiTietPhieuThue;
    }

    public String getMaTieuDe() {
        return maTieuDe;
    }

    public void setMaTieuDe(String maTieuDe) {
        this.maTieuDe = maTieuDe;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dia dia = (Dia) o;
        return Objects.equals(maDia, dia.maDia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maDia);
    }

    @Override
    public String toString() {
        return "Dia{" +
                "maDia='" + maDia + '\'' +
                ", maChiTietPhieuThue='" + maChiTietPhieuThue + '\'' +
                ", maTieuDe='" + maTieuDe + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
}
