package com.GTY.app.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Table(name = "chanel")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Service
public class Chanel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "chanelname")
    private String chanelName;
    @Column(name = "photo",length = 20000)
    private String Photo;
    @Column(name = "highstreamid")
    private String highStreamId;
    @Column(name = "mediumstreamid")
    private String mediumStreamId;
    @Column(name = "lowstreamid")
    private String lowStreamId;
}
