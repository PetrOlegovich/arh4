package HW4;

public class CashProvider {
    private long card;
    private long hashCard;
    private boolean isAuthorization;

    public CashProvider(long card, long hashCard) {
        this.card = card;
        this.hashCard = hashCard;
        this.isAuthorization = false;