/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vuha.util.tset;

import org.junit.Test;
import static org.junit.Assert.*;
import vuha.util.MathUtility;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {

    //minh se test cac tinh huong sai ham getFactorial() o day
    //tinh huong la tham so dua vao
    //tinh huong xai ham test ham goi laf YEST CASES
    //thuong ta co tin huong thanh cong va that bai
    //thanh con dua vao value hop le 0..20
    // that bai dua vao am, >20
    @Test //biet ham nay public static void main()
    //ten ham bao goi nhu nghia ket qua tra ve, tinh trang test
    //minh muono test ham tra ve ngon
    public void getFactorial_RunsWell_IfValibArgument() {
        assertEquals(120, MathUtility.getFactorial(5));
        //tui muon chack coi co dung la goi ham 5! thi oi ve 120 neu co xanh , ko thi do
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(6, MathUtility.getFactorial(3));
        //tui muon thay xanh tren github
    }

}
//mac dinh code test vs code chinh doc lap vs qua trinh clean and buil
//du  code xanh hay đỏ
//miễn nó ko bị eror cú pháp
//bạn vẫn luôn đống gói build ra đc file .jar .war
//xanh là hàm chuẩn thì ms nên ra đc .jar .war
//vây ta cân có cách gài cái xanh đỏ vào quy trình build
// nêế code dang màu đỏ thì phải disable cái nút clear&buildF