public class CalculadoraV3 {
    public int somar(int... elementos){
        var res = 0;
        //for each
        for(int elemento : elementos){
            res += elemento;
        }
        return res;
    }
}
