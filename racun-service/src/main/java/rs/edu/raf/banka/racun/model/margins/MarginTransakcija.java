package rs.edu.raf.banka.racun.model.margins;

import lombok.*;
import rs.edu.raf.banka.racun.enums.KapitalType;
import rs.edu.raf.banka.racun.enums.MarginTransakcijaType;
import rs.edu.raf.banka.racun.model.Racun;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarginTransakcija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private MarginTransakcijaType tip;

    @ManyToOne
    @JoinColumn(name = "racun_id")
    private Racun racun;

    private Date datumVreme;

    private Long orderId;
    private String username;
    private String opis;

    private KapitalType kapitalType = KapitalType.NOVAC;
    private Long haritjeOdVrednostiID;

    private Double ulog;
    private Double loanValue;
    private Double maintenanceMargin;
    private Double kamata;

    private double unitPrice;

}
