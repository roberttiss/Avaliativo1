package ProjetoUSMoney;

public class USMoney {
    int dollars;
    int cents;
    //metodo construtor que atribui os valores dos parâmetros ao objeto atual usando this.
    public USMoney(int dollars, int cents){
        this.dollars = dollars;
        this.cents = cents;
    }

    //realiza a soma do objeto juntamente com a soma do objeto do parâmetro e 
    //retorna um novo objeto com os novos valores da soma realizada
    public USMoney plus(USMoney objeto1) {
        int totaldoll = this.dollars + objeto1.dollars ;
        int totalcent = this.cents + objeto1.cents ;

        if(totalcent >= 100){
            int divisaocents = totalcent / 100;
            totalcent = totalcent % 100;
            totaldoll += divisaocents;
        }
        return new USMoney(totaldoll, totalcent);
    }
    //retorna o valor de cents
    public int getcents(){
        return this.cents;
    }
    //retorna o valor de dollars
    public int getdoll(){
        return this.dollars;
    }


}
