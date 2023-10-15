public class InvoiceItem {
    String id, desc;
    int qty;
    double unitPrice;
    InvoiceItem(String id, String desc, int qty, double unitPrice){
        this.id =id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    String getId(){
        return id;
    }
    String getDesc(){return desc;}
    int getQty(){return qty;}
    void setQty(int q){
        this.qty= q;
    }
    double getUnitPrice(){return unitPrice;}
    void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
    double getTotal(){
        return qty*unitPrice;
    }
    @Override
    public String toString(){
        return "InvoiceItem[id="+id+",desc="+desc+",qty="+qty+",unitPrice="+ unitPrice+"]";
    }

}
