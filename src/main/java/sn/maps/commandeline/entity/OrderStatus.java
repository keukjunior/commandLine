package sn.maps.commandeline.entity;

public enum OrderStatus {
    PENDING,    // commande créée, en attente de confirmation
    CONFIRMED,  // commande confirmée, en cours de préparation
    SHIPPED,    // commande expédiée
    DELIVERED,  // commande livrée
    CANCELLED   // commande annulée
}
