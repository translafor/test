package com.test.spring.Builder;

/**
 * Builder模式代码测试
 */
public class TestBuilder {
    String name;
    int age;
    String phone;
    String email;

    private TestBuilder(){};

    @Override
    public String toString() {
        return "TestBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private int age;
        private String phone;
        private String email;

        public Builder(){}


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public TestBuilder build(){
            TestBuilder testBuilder=new TestBuilder();
            testBuilder.name=name;
            testBuilder.age=age;
            testBuilder.phone=phone;
            testBuilder.email=email;
            return testBuilder;
        }
    }
}
