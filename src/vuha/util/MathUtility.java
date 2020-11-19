/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuha.util;

/**
 *
 * @author Admin
 */
public class MathUtility {

    /**
     * @param args the command line arguments
     */
    // class này chứa các hàm tiện ích dùng chung cho mọi nơi
    //do đó dùng static
    public static final double PI=3.1415;
    //hàm tính giai thừa n>=0&& n<=20
    
    public static long getFactorial(int n){
        if(n<0||n>20)
            throw new IllegalArgumentException("n must be >=0 & <=20");
        if(n==0||n==1)
            return 1;
        long result=1;
        for(int i=2;i<=n;i++){
            result *=i;
        }
        return result;
    }
    
    public static void main(String[] args) {
        // test hàm bằng mắt
        System.out.println("5!: "+ getFactorial(5));
        //expected:120
        // và test bộ data khác
        System.out.println("0!: "+ getFactorial(0));
        //e:1,a:1--oke
        //e:ném về ngoại lệ IllegalArgumentException nếu tình huống giai thừ -5
        System.out.println("5!: "+ getFactorial(-5));
        System.out.println("CI for today");
    }
}
// code viet ra dev test truoc, cos vai hinh thuc test code khac nha
        //1.TDD Test Driven Development
        //viet dan khung cua ham
        // sau do dung ham test
        //chay thu xem xanh do xanh là ổn đỏ là loiox
        // cứ lên tuc xanh đỏ như thế trong qua trình viết code
        // sửa code, người ta ggoij là lập trình hướng thỏa mãn
// viết test TĐ
//2.sout(ham kem data) để coi kết quả ra sao, có đúng như mình kì vọng ko
// nói pjair trả về như thế hay ko--> xme bằng mắt
//3.JOptionPane của bên javaDesktop để popup kết quả ra màn hình
//4.viết 1 trang wed gọi hàm xử lí..... hao sức quá