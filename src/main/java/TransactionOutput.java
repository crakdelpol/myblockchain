import java.security.PublicKey;

public class TransactionOutput {

    public String id;
    public PublicKey reciepient;
    public float value;
    public String parentTransactionId;

    public TransactionOutput(String id, PublicKey reciepient, float value, String parentTransactionId) {
        this.id = id;
        this.reciepient = reciepient;
        this.value = value;
        this.parentTransactionId = parentTransactionId;
    }

    public TransactionOutput(PublicKey reciepient, float value, String transactionId) {

    }

    //Check if coin belongs to you
    public boolean isMine(PublicKey publicKey) {
        return (publicKey == reciepient);
    }
}
