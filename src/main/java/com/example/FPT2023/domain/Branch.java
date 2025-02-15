package com.example.FPT2023.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "branchs")
@Entity
@Setter
@Getter
public class Branch {

    @Id
    private Long maNganh;

    private String tenNganh;

    private String loaiNganh;

    @Override
    public String toString() {
        return "Branch [maNganh=" + maNganh + ", tenNganh=" + tenNganh + ", loaiNganh=" + loaiNganh + "]";
    }

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
    private List<Graduate> graduates;

}
