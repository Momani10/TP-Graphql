package ma.projet.graph.entities;

import lombok.Data;

import java.util.Date;


@Data
public class TransactionRequest {
    private Long compteId;
    private double amount;
    private TransactionType type;

}