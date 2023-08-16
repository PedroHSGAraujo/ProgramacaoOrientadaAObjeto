public class verifica {
    public static void main(String[] args) {
        int num = verificaPrimo(10);
        System.out.println(num);
    }
    public static Integer verificaPrimo(Integer a){
        int i;
        int ret = 0;
        if (a <= 1){
            ret = 0;
        }else{
            for(i=2; i < a; i++){
                if(a%i==0){
                    ret = 0;
                    break;
                }
            }
            if(i==a){
                ret = 1;
            }
        }
        return ret;
    }
}
