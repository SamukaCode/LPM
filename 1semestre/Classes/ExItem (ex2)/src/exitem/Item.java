
package exitem;


public class Item {
    //código, descrição, quantidade comprada do item, preço do item.
    private int cod;
    private String desc;
    private int qnt;
    private float prec;
    
    public Item() {
        cod=0;
        desc="";
        qnt=0;
        prec=0;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        if (qnt<0)
            this.qnt = 0;
        else
            this.qnt = qnt;
    }

    public float getPrec() {
        return prec;
    }

    public void setPrec(float prec) {
        this.prec = prec;
    }
    
    public float getTotal() {
        return qnt*prec;
    }
}
