class Teste extends Plus {
    public Boolean testaConta(){
        float x = 10;
        float y = 5;
        float u = 15;

        float responta = Plus.ExecuteCalcule(x, y);

        if(u == responta){
            return true;
        }
        return false;
    } 
}