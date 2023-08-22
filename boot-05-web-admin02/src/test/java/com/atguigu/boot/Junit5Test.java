package com.atguigu.boot;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @projectName: boot-05-web-admin02
 * @package: com.atguigu.boot
 * @className: Junit5Test
 * @author: SingKwan
 * @description: TODO
 * @date: 2023/4/24 13:20
 * @version: 1.0
 */

@DisplayName("Junit5功能测试类")
public class Junit5Test {

    @DisplayName("测试DisplayName注解")
    @Test
    void testDisplayName(){
        System.out.println(1);
    }

    @DisplayName("测试简单断言")
    @Test
    void testSimpleAssertions(){
        int cal=cal(2,3);
        assertEquals(5,cal,"业务逻辑计算失败");
        Object obj1=new Object();
        Object obj2=new Object();
        Assertions.assertSame(obj1,obj2,"两个对象不一样");
    }

    @Test
    @DisplayName("array assertion")
    void array() {
        assertArrayEquals(new int[]{1, 2}, new int[] {1, 2});
    }

    @Test
    @DisplayName("assert all")
    public void all() {
        assertAll("Math",
                () -> assertEquals(2, 1+1),
                () -> assertTrue(1 > 0)
        );
    }

    @Test
    @DisplayName("异常断言")
    void testException(){
        assertThrows(ArithmeticException.class,
                ()->{ int i=10/0; },
                "业务逻辑居然正常运行?");
    }

    @DisplayName("测试前置条件")
    @Test
    void testAssumption(){
        Assumptions.assumeTrue(false,"结果不是true");
        System.out.println("11111");
    }


    int cal(int a, int b){
        return a+b;
    }

    @Disabled
    @DisplayName("测试方法2")
    @Test
    void test2(){
        System.out.println(2);
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("测试即将开始---");
    }

    @AfterEach
    void afterEach(){
        System.out.println("测试已经结束---");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("所有测试即将开始~");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("所有测试已经结束~");
    }

}
