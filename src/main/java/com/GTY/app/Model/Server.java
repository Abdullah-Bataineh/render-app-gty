package com.GTY.app.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Entity
@Table(name = "server")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Service
public class Server {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
@Column(name = "host")
    private String Host;
@Column(name = "username")
    private String userName;
@Column(name = "password")
    private String Password;
}
