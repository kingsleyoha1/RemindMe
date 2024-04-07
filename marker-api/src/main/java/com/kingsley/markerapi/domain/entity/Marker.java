package com.kingsley.markerapi.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.Instant;
import jakarta.persistence.*;

@Entity
@Table(name = "markers")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Marker {
    @Id
    @SequenceGenerator(name = "bm_id_seq_gen", sequenceName = "bm_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bm_id_seq_gen")
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String url;
    private Instant createdAt;
}